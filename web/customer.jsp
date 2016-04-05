<%-- 
    Document   : customer
    Created on : Apr 4, 2016, 1:21:30 PM
    Author     : Plamen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create a Customer</title>
    </head>
    <body>
        <h1>Please fill in your information!</h1>
        <form name="Form1" action="UIServlet" method="POST">
        <table>
            <tr><td>Name:</td><td> <input type="text" name="cname" value="" /></td></tr>
            <tr><td>E-mail:   </td><td> <input type="text" name="email" value="" /></td></tr>
            <tr><td>Telephone Number:</td><td> <input type="text" name="telephone" value="" /></td></tr>
            <tr><td>Address:</td><td> <input type="text" name="caddress" value="" /></td></tr>
            <input type="hidden" name="origin" value="customer" />
            <tr><td></td><td><input type="submit" value="Submit" /></td></tr>
        </table>
        </form>
       
    </body>
</html>
