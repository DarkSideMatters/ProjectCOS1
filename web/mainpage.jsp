<%-- 
    Document   : mainpage
    Created on : Mar 31, 2016, 11:49:55 AM
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
        <h1>Choose an option</h1>
        <br></br>
        <form name="Form" action="UIServlet" method="POST">
            <input type="hidden" name="origin" value="buildingpage" />
            <input type="submit" value="Create Building" />
        </form>
        <br></br>
        <form name="Form" action="UIServlet" method="POST">
            <input type="hidden" name="origin" value="customerpage" />
            <input type="submit" value="Create Customer" />
        </form>
        <br></br>
        <form name="Form" action="UIServlet" method="POST">
            <input type="hidden" name="origin" value="reportpage" />
            <input type="submit" value="Create Report" />
        </form>
    </body>
</html>
