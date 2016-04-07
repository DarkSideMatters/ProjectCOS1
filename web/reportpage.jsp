<%-- 
    Document   : reportpage
    Created on : Apr 5, 2016, 1:34:33 PM
    Author     : Plamen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Report Page</title>
    </head>
    <body>
        <h1>The Report Is Provided By Polygon!</h1>
        <form name="Form2" action="UIServlet" method="POST">
        <table>
            <tr><td>Report Number:</td><td> <input type="text" name="reportno" value="" /></td></tr>
            <tr><td>Date:</td><td> <input type="text" name="rdate" value="" /></td></tr>
            <tr><td>Name of building:</td><td> <input type="text" name="bname" value="" /></td></tr>
            <tr><td>Comment:</td><td> <input type="text" name="comment" value="" /></td></tr>
        </table><br>
        Additional Information:<br>
               <textarea name="rcomment" rows="4" cols="30">
               </textarea>
        <input type="hidden" name="origin" value="report" /><br>
        <tr><td></td>
            <td><input type="submit" value="Submit" /></td></tr>
        </form>
    </body>
</html>
