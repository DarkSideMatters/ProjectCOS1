<%-- 
    Document   : adminpage
    Created on : Apr 20, 2016, 12:49:45 PM
    Author     : Plamen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>You are now logged in!</h1>
        
        <form name="Form1" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="customerlist">
            <input type="submit" name="Blistingpage" value="List Customers"/>
        </form>
        
        <br></br>

        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="editpadmin">
            <input type="submit" name="Editadmin" value="Edit Admin"/>
        </form>
        
        <br></br>
        
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="adminloginpage">
            <input type="submit" name="Editadmin" value="Log Out"/>
        </form>
        
        <br></br>
        
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="ays">
            <% request.getSession().setAttribute("disthing", "Administrator Account");
            %>
            <input type="submit" name="Editadmin" value="Delete Admin"/>
        </form>
        
        
    </body>
</html>
