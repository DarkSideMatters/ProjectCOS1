<%-- 
    Document   : arreportlist
    Created on : Apr 27, 2016, 10:46:19 PM
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
            <%  Admin am = (Admin)request.getSession().getAttribute("currentadmin");
            Room rm = (Room)request.getSession().getAttribute("currentroom");
            ArrayList<RReport> reps = rm.getReports();
        
            if(reps.size()==0){%>
            <%= "There are no reports." %>
            <%}
            
            
            for(int i=0;i<reps.size();i++){
               
            
            if(i==0) {%>
            <tr><th>Nr</th><th>Report Id</th><th>Report Date</th><th>Polygon Author</th><th>Construction Manager</th></tr>
            <%}%>
            
            <form name="Form2" action="UIServlet" method="post">
        
           <tr>
            
            <td> <%= i+1%> </td>
            <td> <%= reps.get(i).getRrepid() %> </td>
            <td> <%= reps.get(i).getRrepdate() %> </td>
            <td> <%= am.getFirstname() + " " %><%= am.getLastname() %> </td>
            <td> <%= reps.get(i).getRconmng() %> </td>
            <input type="hidden" name="origin" value="rrepoption"/>
            <input type="hidden" name="rrepid" value="<%= reps.get(i).getRrepid() %>" />
            <td> <input type="submit" name="btn" value="View"> </td>
            <td> <input type="submit" name="btn" value="Edit"> </td>
            <td> <input type="submit" name="btn" value="Delete"> </td>
            
            
           </tr>
          </form>
        <%}%>
        
    
        </table>
        
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="rreportpage">
            <input type="submit" name="Buildingpage" value="Add Report"/>
        </form>
        
        <br></br>
        
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="roomslist">
            <input type="submit" name="Buildingpage" value="Back"/>
        </form>
        
            
    </body>
</html>