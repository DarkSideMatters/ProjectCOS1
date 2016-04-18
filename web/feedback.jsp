<%-- 
    Document   : feedback
    Created on : Feb 19, 2016, 12:56:20 PM
    Author     : Mircea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback</title>
    </head>
    <body>
        <h3><%= session.getAttribute("message") %> </h3>
    </body>
</html>