<%-- 
    Document   : adminlogin
    Created on : Apr 20, 2016, 1:44:00 PM
    Author     : Mircea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Administrator Log in:</h1>
        <form name="Form2" action="UIServlet" method="post">
            Username:
            <input type="text" name="username" value=""><br><br>
            Password:
            <input type="password" name="pass"><br><br>
            <input type="hidden" name="origin" value="adminlogin">
            <input type="submit" name="login" value="Log in"/>
        </form>
        <br>
            <br/>
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="adminreg"/>
            <input type="submit" name="register" value="Register"/>
        </form>
    </body>
</html>
