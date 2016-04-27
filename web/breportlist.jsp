<%-- 
    Document   : breportlist
    Created on : Apr 24, 2016, 6:14:00 PM
    Author     : Mircea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.ArrayList, Entity.*, Presentation.UIServlet" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <table>
        <% Building bld = (Building)request.getSession().getAttribute("currentbuilding");
            ArrayList<BReport> reps = bld.getReports();
        
            if(reps.size()==0){%>
            <%= "There are no reports." %>
            <%}
            
            
            for(int i=0;i<reps.size();i++){
               
            
            if(i==0) {%>
            <tr><th>Nr</th><th>Date</th><th>Polygon Author</th><th>Construction Manager</th></tr>
            <%}%>
            
            <form name="Form2" action="UIServlet" method="post">
        
           <tr>
               
            <td> <%= i+1%> </td>
            <td> <%= reps.get(i).getBrdate()%> </td>
            <td> <%= reps.get(i).getPemployee()%> </td>
            <td> <%= reps.get(i).getBconmanager()%> </td>
            <input type="hidden" name="origin" value="breportoption"/>
            <input type="hidden" name="brnum" value="<%= reps.get(i).getBrepid() %>" />
            <td> <input type="submit" name="btn" value="View"> </td>
            
           </tr>
          </form>
        <%}%>
        
    
        </table>
        
        <br></br>
        
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="buildinglist">
            <input type="submit" name="Buildingpage" value="Back"/>
        </form>
            
    </body>
</html>