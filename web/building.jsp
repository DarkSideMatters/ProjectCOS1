<%-- 
    Document   : building
    Created on : Mar 30, 2016, 10:45:05 AM
    Author     : Plamen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create a Building</title>
    </head>
    <body>
        <form name="Form" action="UIServlet" method="POST">
        <table>
            <h1>Please fill in all the layers in order to create the building!</h1>
            <tr><td>Owner Name:</td><td> <input type="text" name="name" value="" /></td></tr>
            <tr><td>Address:   </td><td> <input type="text" name="address" value="" /></td></tr>
            <tr><td>ParcelNo:</td><td> <input type="text" name="pno" value="" /></td></tr>
            <tr><td>Size:</td><td> <input type="text" name="size" value="" /></td></tr>
            <tr><td></td><td><input type="submit" value="Submit" /></td></tr>
            <input type="hidden" name="origin" value="building" />
        </table>
        </form>
    </body>
</html>
