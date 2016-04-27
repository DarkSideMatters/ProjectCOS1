<%-- 
    Document   : createfloor
    Created on : Apr 20, 2016, 6:24:21 AM
    Author     : Radu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create floor</h1>
        <form name="Form" action="UIServlet" method="POST">
        <tr><td>Floor Name:</td><td> <input type="text" name="fname" value="" /></td></tr>  
        <br>
        <input type="hidden" name="origin" value="addfloor"/>
        <br><tr><td></td><td><input type="submit" value="Submit" /></td></tr>
        </form>
</body>
</html>
