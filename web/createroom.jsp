<%-- 
    Document   : createroom
    Created on : Apr 20, 2016, 6:36:47 AM
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
        <h1>Create room:</h1>
        <form name="Form" action="UIServlet" method="POST">
        <table>
        <tr><td>RoomNo:</td><td> <input type="text" name="roomno" value="" /></td></tr><br>  
        <tr><td>Room size(square meters):</td><td> <input type="text" name="roomsize" value="" /></td></tr>
        </table>
        <br>
        <input type="hidden" name="origin" value="addfloor"/>
        <br><tr><td></td><td><input type="submit" value="Create" /></td></tr>
        </form>
    </body>
</html>
