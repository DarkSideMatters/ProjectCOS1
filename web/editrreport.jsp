<%-- 
    Document   : editrreport
    Created on : Apr 27, 2016, 10:45:28 PM
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
             text-align:center;}
       #tabel1{}
        
        </style>
    </head> 
    <body>
        
        <%  Admin adm = (Admin)request.getSession().getAttribute("currentadmin");
            Building bld = (Building)request.getSession().getAttribute("currentbuilding");
            Room rm = (Room)request.getSession().getAttribute("currentroom");
            %>
        
        <h1>Polygon</h1>
        <h2>-Room Report-</h2>
        
        <form name="Form2" action="UIServlet" method="post">
        <table id="tabel1">
            <tr><td>Room:</td><td> <%= rm.getRname() %></td></tr>    
            <tr><td>Date:</td><td> <input type="text" name="date" value="" /></td></tr>
            <tr><td>Name of building:</td><td> <%= bld.getBname() %></td></tr>
            <tr><td>Room size(square meters):</td><td> <%= rm.getRsize() %></td></tr>
        </table><br>
        <hr>
        
        <ui><li>Room Comment:</li></ui>
        <ui><li><input type="text" name="rcomm" value="" /></li></ui>        
        
        <ul><li>Damage and repair</li></ul>
        <table>
        <div>
            There has been damage in the room:
            Yes<input type="radio" name="damage" value="yes" />
            No<input type="radio" name="damage" value="no" />
        </div>
            <tr><td>Damage Comment:</td><td> <input type="text" name="dmgcom" value="" /></td></tr><br>
        <div>
            What damage:
            Moisture<input type="checkbox" name="moist" value="ski" />
            &nbsp;&nbsp;Rot<input type="checkbox" name="rot" value="skate" />
            &nbsp;&nbsp;Mold<input type="checkbox" name="mold" value="ski" />
            &nbsp;&nbsp;Fire<input type="checkbox" name="fire" value="skate" />
            &nbsp;&nbsp; Other damage<input type="checkbox" name="other" value="skate" />
        </div>
        </table><br>
        <hr>
        
        <ul><li>Reviewing</li></ul> 
        <table>
            <tr><td>Walls</td><td></td><td> <input type="text" name="walls" value="" /></td></tr>
            <tr><td>Ceiling</td><td></td><td> <input type="text" name="ceiling" value="" /></td></tr>
            <tr><td>Floor</td><td></td><td> <input type="text" name="floor" value="" /></td></tr>
            <tr><td>Windows/Doors</td><td></td><td> <input type="text" name="windoor" value="" /></td></tr>
         </table><br>
         <hr>
         
        <ul><li>Moisture Scanning</li></ul>
            Yes<input type="radio" name="moistscan" value="yes" />
            No<input type="radio" name="moistscan" value="no" />
        <tr><td>Moisture point:</td><td> <input type="text" name="moistpoint" value="" /></td></tr><br>
        <hr>
        
        <ul><li>Conclusion</li></ul>
         <table>
             <tr><th>Recommandations</th><th><input type="text" name="recom"/></th></tr>
         </table><br> 
        <div>
            Structural analysis is made by
            <tr><td></td><td> <%= adm.getFirstname() + " " %><%= adm.getLastname() %></td></tr>
            from Polygon in cooperation with
            <tr><td></td><td> <input type="text" name="conmng" value="" /></td></tr>
            (Construction Manager).
        </div><br>
        <input type="hidden" name="origin" value="editrreport" />
        <br><input type="submit" value="Submit" />
        </form>
            
    </body>
</html>
