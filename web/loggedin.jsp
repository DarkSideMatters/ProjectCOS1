<%-- 
    Document   : loggedin
    Created on : Apr 18, 2016, 5:29:10 PM
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
        <h1>You are now logged in!</h1>
        
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="buildinglist">
            <input type="submit" name="Blistingpage" value="List Buildings"/>
        <form/>
        
    </body>
</html>
