<%-- 
    Document   : edit
    Created on : Apr 19, 2016, 5:02:28 PM
    Author     : Berkant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit a Building</title>
    </head>
    <body>
        <h1>All fields left blank will not modify!</h1>
        <form name="Form" action="UIServlet" method="POST">
        <table>
            <tr><td>Building Name:</td><td> <input type="text" name="name" value="" /></td></tr>
            <tr><td>City:   </td><td> <input type="text" name="city" value="" /></td></tr>
            <tr><td>Address:</td><td> <input type="text" name="address" value="" /></td></tr>
            <tr><td>Zip:</td><td> <input type="text" name="zip" value="" /></td></tr>
            <tr><td>Year:</td><td> <input type="text" name="year" value="" /></td></tr>
            <tr><td>Size:</td><td> <input type="text" name="size" value="" /></td></tr>
            <input type="hidden" name="origin" value="building" />
            <tr><td></td><td><input type="submit" value="Submit" /></td></tr>
        </table>
        </form>
        
        
        
    </body>
</html>

