<%-- 
    Document   : buildinglist
    Created on : Apr 19, 2016, 1:34:12 PM
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
            <tr><th>Cid</th><th>Bid</th><th>Building Name</th><th>City</th><th>Address</th><th>Zip</th><th>Year</th><th>Size</th></tr>
        <% Customer cstm = (Customer)request.getSession().getAttribute("currentcustomer");
            ArrayList<Building> blds = cstm.getBuildings();
        %><form name="Form2" action="UIServlet" method="post"><%
            
            
            for(int i=0;i<blds.size();i++){
                
        %> 
        
           <tr>
            
            <td> <%= blds.get(i).getCid() %> </td>
            <td> <%= blds.get(i).getBid() %> </td>
            <td> <%= blds.get(i).getBname() %> </td>
            <td> <%= blds.get(i).getCity()%> </td>
            <td> <%= blds.get(i).getAddress() %> </td>
            <td> <%= blds.get(i).getZip() %> </td>
            <td> <%= blds.get(i).getYear() %> </td>
            <td> <%= blds.get(i).getSize() %> </td>
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