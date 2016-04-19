<%-- 
    Document   : buildinglist
    Created on : Apr 19, 2016, 1:34:12 PM
    Author     : Mircea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.ArrayList, Entity.Building, Presentation.UIServlet" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% List<Building> buildings = (List)request.getSession().getAttribute("buildings");
            for(int i=0;i<buildings.size();i++){
        %><li><%buildings.get(i).getCid();%></li>
        <%}%>
            
    </body>
</html>
