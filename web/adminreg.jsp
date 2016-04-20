<%-- 
    Document   : adminlogin
    Created on : Apr 20, 2016, 11:54:05 AM
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
       <form name="Form1" action="UIServlet" method="POST">
        <table>
            <tr><td>Username:</td><td> <input type="text" name="usrn" value="" /></td></tr>
            <tr><td>Password:</td><td> <input type="text" name="pwd" value="" /></td></tr>
            <tr><td>First Name:</td><td> <input type="text" name="fn" value="" /></td></tr>
            <tr><td>Last Name:</td><td> <input type="text" name="ln" value="" /></td></tr>
            <tr><td>E-mail:</td><td> <input type="text" name="email" value="" /></td></tr>
            <tr><td>Telephone:</td><td> <input type="text" name="tel" value="" /></td></tr>
            
            <input type="hidden" name="origin" value="adminreg" />
            <tr><td></td><td><input type="submit" value="Submit" /></td></tr>
        </table>
        </form>
    </body>
</html>
