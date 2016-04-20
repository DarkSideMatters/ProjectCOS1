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
            <tr><th>Nr</th><th>Cid</th><th>Username</th><th>Password</th><th>First Name</th><th>Last Name</th><th>Mail</th><th>Telephone</th><th>City</th><th>Address</th><th>Zip</th></tr>
        <% Accounts acc = (Accounts)request.getSession().getAttribute("accounts");
            ArrayList<Customer> cms = acc.getCustomers();
        
            
            
            for(int i=0;i<cms.size();i++){
               
            %>
            
            <form name="Form2" action="UIServlet" method="post">
        
           <tr>
            
            <td> <%= i+1 %> </td>
            <td> <%= cms.get(i).getCid() %> </td>
            <td> <%= cms.get(i).getUsername() %> </td>
            <td> <%= cms.get(i).getPassword() %> </td>
            <td> <%= cms.get(i).getFirstname() %> </td>
            <td> <%= cms.get(i).getLastname() %> </td>
            <td> <%= cms.get(i).getMail() %> </td>
            <td> <%= cms.get(i).getTel() %> </td>
            <td> <%= cms.get(i).getCity() %> </td>
            <td> <%= cms.get(i).getAddress() %> </td>
            <td> <%= cms.get(i).getZip() %> </td>
            <input type="hidden" name="origin" value="customeroption"/>
            <input type="hidden" name="cmnr" value="<%= cms.get(i).getCid() %>" />
            <td> <input type="submit" name="btn" value="Edit"> </td>
            <td> <input type="submit" name="btn" value="Delete"> </td>
            
            
           </tr>
          </form>
        <%}%>
        
    
        </table>
    </body>
</html>
