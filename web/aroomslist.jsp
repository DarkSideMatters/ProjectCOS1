<%-- 
    Document   : aroomslist
    Created on : Apr 27, 2016, 5:04:28 PM
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
        <% Floor flo = (Floor)request.getSession().getAttribute("currentfloor");
            ArrayList<Room> rom = flo.getRooms();
        
            if(rom.size()==0){%>
            <%= "There are no rooms." %>
            <%}
            
            
            for(int i=0;i<rom.size();i++){
               
            
            if(i==0) {%>
            <tr><th>RoomNo</th><th>Building Name</th><th>Size</th></tr>
            <%}%>
            
            <form name="Form2" action="UIServlet" method="post">
        
           <tr>
            
            
            <td> <%= i+1 %> </td>
            <td> <%= rom.get(i).getRname() %> </td>
            <td> <%= rom.get(i).getRsize() %> </td>
             <input type="hidden" name="origin" value="roomoption"/>
            <input type="hidden" name="rid" value="<%= rom.get(i).getRid() %>" />
            <td> <input type="submit" name="btn" value="Edit"> </td>
            <td> <input type="submit" name="btn" value="Delete"> </td>
            <td> <input type="submit" name="btn" value="List Reports"> </td>
            
            
           </tr>
          </form>
        <%}%>
        
    
        </table>
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="roompage">
            <input type="submit" name="Buildingpage" value="Add Room"/>
        </form>
        
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="floorslist">
            <input type="submit" name="Buildingpage" value="Back"/>
        </form>
            
    </body>
</html>