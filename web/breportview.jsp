<%-- 
    Document   : breportview
    Created on : Apr 27, 2016, 1:10:38 PM
    Author     : Mircea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.ArrayList, Entity.*, Presentation.UIServlet" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
          body {
          font-family: Helvetica;
          margin-left:100px;
          margin-right:100px; 
        }
          h1{font-size:4em;
             text-align:center;}
          h2{font-size:2em;
             text-align:center;
           }
       #tabel1{}
  
            
        </style>
    </head>
    <body>
           <h1>Polygon</h1>
           <h2>-Building Report-</h2>
           
           <% Building bld = (Building)request.getSession().getAttribute("currentbuilding");
              Admin adm = (Admin)request.getSession().getAttribute("currentadmin");
              BReport brep = (BReport)request.getSession().getAttribute("currentbreport");
           %>
           
        <form name="Form2" action="UIServlet" method="post">
        <table id="tabel1">
            <tr><td>ReportNo:</td><td> <%= brep.getBrepid() %></td></tr>    
            <tr><td>Date:</td><td> <%= brep.getBrdate() %></td></tr>
            <tr><td>Name of building:</td><td> <%= bld.getBname() %></td></tr>
            <tr><td>City:   </td><td> <%= bld.getCity() %> </td></tr>
            <tr><td>Address:</td><td> <%= bld.getAddress() %></td></tr>
            <tr><td>Zip</td><td> <%= bld.getZip() %></td></tr>
        </table><br>
        <hr>
        
        <ul><li>General information about the building</li></ul>
        <table>
            <tr><td>Year:</td><td> <%= bld.getYear() %></td></tr>
            <tr><td>Floor space(square meters):</td><td> <%= bld.getSize() %></td></tr>
            <tr><td>What the building has been used for:</td><td> <%= brep.getUsagecomment() %></td></tr>
        </table><br>
        <hr>
        
        <ul><li>Review of the building exterior</li></ul>
         <table>
            <tr><td>Roof</td><td></td><td> <%= brep.getRoofcomment() %></td></tr>
            <tr><td>Exterior Walls</td><td></td><td> <%= brep.getExtwallscomment() %></td></tr>
        </table><br>
        <hr>
         
        <ul><li>Conclusion</li></ul>
        <div>
            Structural analysis is made by
            <tr><td></td><td> <%= adm.getFirstname() + " "%><%=adm.getLastname() %></td></tr>
            from Polygon in cooperation with
            <tr><td></td><td> <%= brep.getBconmanager() %></td></tr>
            (Construction Manager).
        </div><br>
        <hr>
        
        <ul><li>The building is categorized as:</li></ul>
        <table>
                <tr><th>State</th><th>Description of the building</th><th>Condition grade</th></tr>
                <% if(brep.getGrade().equals("0")){ %>
                <tr><td>0</td><td>The building part is new and built</td></tr>
                <%}
                   if(brep.getGrade().equals("1")){ %>
                <tr><td>1</td><td>The building part is intact, but with the start of wear and visible damage(only cosmetic damage)</td></tr>
                <%}
                   if(brep.getGrade().equals("2")){ %>
                <tr><td>2</td><td>The building part is beginning to decay, with individual defective components</td></tr>
                <%}
                   if(brep.getGrade().equals("3")){ %>
                <tr><td>3</td><td>The building element is broken and must be replaced</td></tr>
                <%}%>
        </table><br>
        
        <input type="hidden" name="origin" value="breplist" />
        
        <br><tr><td></td><td><input type="submit" value="Back" /></td></tr>
        </form>
        
    </body>
</html>