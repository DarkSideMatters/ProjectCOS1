<%-- 
    Document   : editbreport
    Created on : Apr 27, 2016, 2:42:14 PM
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
           <h2>-Building Report Edit-</h2>
           <h2>-All fields left blank will not be modified-</h2>
           
           <% Building bld = (Building)request.getSession().getAttribute("currentbuilding");
              Admin adm = (Admin)request.getSession().getAttribute("currentadmin");
              int bnum = bld.getReports().size()+1;
           %>
        <form name="Form2" action="UIServlet" method="post">
        <table id="tabel1">
            <tr><td>ReportNo:</td><td> <%= "The Report Number will be generated and will show up in the View Report Option" %></td></tr>    
            <tr><td>Date:</td><td> <input type="text" name="date" value="" /></td></tr>
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
            <tr><td>What the building has been used for:</td><td> <input type="text" name="usagecomment" value="" /></td></tr>
        </table><br>
        <hr>
        
        <ul><li>Review of the building exterior</li></ul>
         <table>
            <tr><td>Roof</td><td></td><td> <input type="text" name="roofcomment" value="" /></td></tr>
            <tr><td>Exterior Walls</td><td></td><td> <input type="text" name="extwallscomment" value="" /></td></tr>
        </table><br>
        <hr>
         
        <ul><li>Conclusion</li></ul>
        <div>
            Structural analysis is made by
            <tr><td></td><td> <%= adm.getFirstname() + " "%><%=adm.getLastname() %></td></tr>
            from Polygon in cooperation with
            <tr><td></td><td> <input type="text" name="conmanager" value="" /></td></tr>
            (Construction Manager).
        </div><br>
        <hr>
        
        <ul><li>The building is categorized as:</li></ul>
        <table>
                <tr><th>State</th><th>Description of the building</th><th>Condition grade</th></tr>
                <tr><td>0</td><td>The building part is new and built</td><td><input type="radio" name="grade" value="0" /></td></tr>
                <tr><td>1</td><td>The building part is intact, but with the start of wear and visible damage(only cosmetic damage)</td><td><input type="radio" name="grade" value="1" /></td></tr>
                <tr><td>2</td><td>The building part is beginning to decay, with individual defective components</td><td><input type="radio" name="grade" value="2" /></td></tr>
                <tr><td>3</td><td>The building element is broken and must be replaced</td><td><input type="radio" name="grade" value="3" /></td></tr>
        </table><br>
        
        <input type="hidden" name="origin" value="editbreport" />
        
        <br><tr><td></td><td><input type="submit" value="Submit" /></td></tr>
        </form>
        
    </body>
</html>