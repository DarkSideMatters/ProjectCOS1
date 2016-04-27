<%-- 
    Document   : floorslist
    Created on : Apr 20, 2016, 6:52:50 AM
    Author     : Radu
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
            
        <% Building bld= (Building)request.getSession().getAttribute("currentbuilding");
            ArrayList<Floor> flo = bld.getFloors();
        
            if(flo.size()==0){%>
            <%= "There are no floors." %>
            <%}
            
            
            for(int i=0;i<flo.size();i++){
               
            
            if(i==0) {%>
            <tr><th>FloorNo</th></tr>
            <%}%>
            
            <form name="Form2" action="UIServlet" method="post">
        
           <tr>
            
            <td> <%= flo.get(i).getFname() %> </td>
            <input type="hidden" name="origin" value="flooroption"/>
            <input type="hidden" name="fid" value="<%= flo.get(i).getFid() %>" />
            <td> <input type="submit" name="btn" value="Edit"> </td>
            <td> <input type="submit" name="btn" value="Delete"> </td>
            <td> <input type="submit" name="btn" value="List Rooms"> </td>
            
            
            
           </tr>
          </form>
        <%}%>
        
    
        </table>
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="floorpage">
            <input type="submit" name="Buildingpage" value="Add Floor"/>
        </form>
        
        <br></br>
        
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="buildinglist">
            <input type="submit" name="Buildingpage" value="Back"/>
        </form>
            
    </body>
</html>
