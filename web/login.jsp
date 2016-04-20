<%-- 
    Document   : LogIn
    Created on : Feb 18, 2016, 8:51:08 AM
    Author     : Plamen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Log in:</h1>
        <form name="Form2" action="UIServlet" method="post">
            Username:
            <input type="text" name="username" value=""><br><br>
            Password:
            <input type="password" name="pass"><br><br>
            <input type="hidden" name="origin" value="login">
            <input type="submit" name="login" value="Log in"/>
        </form>
        <br>
            <br/>
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="customerpage"/>
            <input type="submit" name="register" value="Register"/>
        </form>

    </body>
</html>