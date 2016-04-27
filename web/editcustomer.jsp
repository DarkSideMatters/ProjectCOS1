<%-- 
    Document   : editcustomer
    Created on : Apr 27, 2016, 1:39:45 PM
    Author     : Mircea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create a Customer</title>
    </head>
    <body>
        <h1>Please fill in with your information to create an account:</h1>
        <form name="Form1" action="UIServlet" method="POST">
        <table>
            <tr><td>Username:</td><td> <input type="text" name="usrn" value="" /></td></tr>
            <tr><td>Password:</td><td> <input type="text" name="pwd" value="" /></td></tr>
            <tr><td>First Name:</td><td> <input type="text" name="fn" value="" /></td></tr>
            <tr><td>Last Name:</td><td> <input type="text" name="ln" value="" /></td></tr>
            <tr><td>E-mail:</td><td> <input type="text" name="email" value="" /></td></tr>
            <tr><td>Telephone:</td><td> <input type="text" name="tel" value="" /></td></tr>
            <tr><td>City:   </td><td> <input type="text" name="city" value="" /></td></tr>
            <tr><td>Address:</td><td> <input type="text" name="caddress" value="" /></td></tr>
            <tr><td>Zip:</td><td> <input type="text" name="zip" value="" /></td></tr>
            <input type="hidden" name="origin" value="editcustomer" />
            <tr><td></td><td><input type="submit" value="Submit" /></td></tr>
        </table>
        </form>
       
    </body>
</html>