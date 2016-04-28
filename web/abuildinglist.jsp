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
        <% Customer cstm = (Customer)request.getSession().getAttribute("currentcustomer");
            ArrayList<Building> blds = cstm.getBuildings();
        
            if(blds.size()==0){%>
            <%= "There are no buildings." %>
            <%}
            
            
            for(int i=0;i<blds.size();i++){
               
            
            if(i==0) {%>
            <tr><th>Nr</th><th>Building Name</th><th>City</th><th>Address</th><th>Zip</th><th>Year</th><th>Size</th></tr>
            <%}%>
            
            <form name="Form2" action="UIServlet" method="post">
        
           <tr>
            
            <td> <%= i+1 %> </td>
            <td> <%= blds.get(i).getBname() %> </td>
            <td> <%= blds.get(i).getCity()%> </td>
            <td> <%= blds.get(i).getAddress() %> </td>
            <td> <%= blds.get(i).getZip() %> </td>
            <td> <%= blds.get(i).getYear() %> </td>
            <td> <%= blds.get(i).getSize() %> </td>
            <input type="hidden" name="origin" value="buildingoption"/>
            <input type="hidden" name="buildingnr" value="<%=blds.get(i).getBid()%>" />
            <td> <input type="submit" name="btn" value="Edit"> </td>
            <td> <input type="submit" name="btn" value="Delete"> </td>
            <td> <input type="submit" name="btn" value="List Floors"> </td>
            <td> <input type="submit" name="btn" value="List Reports"> </td>
            
            
           </tr>
          </form>
        <%}%>
        
    
        </table>
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="buildingpage">
            <input type="submit" name="Buildingpage" value="Add Building"/>
        </form>
        
        <br></br>
        
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="customerlistpage">
            <input type="submit" name="Buildingpage" value="Back"/>
        </form>
            
    </body>
</html>
