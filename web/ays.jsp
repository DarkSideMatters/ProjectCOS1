<%-- 
    Document   : ays
    Created on : Apr 24, 2016, 7:07:41 PM
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
        <h1><%= request.getSession().getAttribute("message")%></h1>
        
        <br></br>
        
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="imsure">
            <input type="submit" name="Editadmin" value="Yes"/>
        </form>
        
        <br></br>
        
        <form name="Form2" action="UIServlet" method="post">
            <input type="hidden" name="origin" value="imnotsure">
            <input type="submit" name="Editadmin" value="No"/>
        </form>
        
    </body>
</html>
