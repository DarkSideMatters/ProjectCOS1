
<%-- 
    Document   : roomslist
    Created on : Apr 20, 2016, 7:31:44 AM
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
            <tr><th>RoomNO</th><th>Building Name</th><th>Size</th></tr>
        <% Floor flo = (Floor)request.getSession().getAttribute("current");
            ArrayList<Room> rom = flo.getRooms();
        
            
            
            for(int i=0;i<rom.size();i++){
               
            %>
            
            <form name="Form2" action="UIServlet" method="post">
        
           <tr>
            
            
            <td> <%= rom.get(i).getRname() %> </td>
             <input type="hidden" name="origin" value="buildingoption"/>
            <input type="hidden" name="buildingnr" value="<%= rom.get(i).getRid() %>" />
            <td> <input type="submit" name="btn" value="Edit"> </td>
            <td> <input type="submit" name="btn" value="Delete"> </td>
            <td> <input type="submit" name="btn" value="View Report"> </td>
            
            
           </tr>
          </form>
        <%}%>
        
    
        </table>
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="buildingpage">
            <input type="submit" name="Buildingpage" value="Add Building"/>
        <form/>
            
    </body>
</html>
