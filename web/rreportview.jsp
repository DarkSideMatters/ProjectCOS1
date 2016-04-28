<%-- 
    Document   : rreportview
    Created on : Apr 27, 2016, 10:46:31 PM
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
            RReport rrep = (RReport)request.getSession().getAttribute("currentrreport");
            %>
        
        <h1>Polygon</h1>
        <h2>-Room Report-</h2>
        
        <table id="tabel1">
            <tr><td>Room:</td><td> <%= rm.getRname() %></td></tr>    
            <tr><td>Date:</td><td> <%= rrep.getRrepdate() %></td></tr>
            <tr><td>Name of building:</td><td> <%= bld.getBname() %></td></tr>
            <tr><td>Room size(square meters):</td><td> <%= rm.getRsize() %></td></tr>
        </table><br>
        <hr>
        
        <li>Room Comment:</li> <%= rrep.getRcomm() %>
        
        
        <ul><li>Damage and repair</li></ul>
        <table>
        <div>
            There has been damage in the room:
            
            <% 
                if(rrep.isDmg()){%>
                Yes
            <%}
                else{%>
               No
            <%}%>
            
        </div>
        <% if(rrep.isDmg()){%>
            <tr><td>Damage Comment:</td><td> <%= rrep.getDmgcom() %></td></tr><br>
        <div>
            What damage:
            
            <%
                if(rrep.isMoist()){%>
                    Moisture<input type="checkbox" name="moist" value="ski" checked />
            <%}
                else{%>
                    Moisture<input type="checkbox" name="moist" value="ski" />
            <%}%>
            <%
                if(rrep.isRot()){%>
                    &nbsp;&nbsp;Rot<input type="checkbox" name="rot" value="skate" checked />
            <%}
                else{%>
                    &nbsp;&nbsp;Rot<input type="checkbox" name="rot" value="skate" />
            <%}%>
            <%
                if(rrep.isMold()){%>
                    &nbsp;&nbsp;Mold<input type="checkbox" name="mold" value="ski" checked />
            <%}
                else{%>
                    &nbsp;&nbsp;Mold<input type="checkbox" name="mold" value="ski" />
            <%}%>
            <%
                if(rrep.isFire()){%>
                    &nbsp;&nbsp;Fire<input type="checkbox" name="fire" value="skate" checked />
            <%}
                else{%>
                    &nbsp;&nbsp;Fire<input type="checkbox" name="fire" value="skate" />
            <%}%>
            <%
                if(rrep.isOther()){%>
                    &nbsp;&nbsp;Other damage<input type="checkbox" name="other" value="skate" checked />
            <%}
                else{%>
                    &nbsp;&nbsp;Other damage<input type="checkbox" name="other" value="skate" />
            <%}%>
        </div>
        </table><br>
        <hr>
        
        <ul><li>Reviewing</li></ul> 
        <table>
            <tr><td>Walls</td><td></td><td> <%= rrep.getWallscom() %></td></tr>
            <tr><td>Ceiling</td><td></td><td> <%= rrep.getCeilingcom() %></td></tr>
            <tr><td>Floor</td><td></td><td> <%= rrep.getFloorcom() %></td></tr>
            <tr><td>Windows/Doors</td><td></td><td> <%= rrep.getWindoorcom() %></td></tr>
         </table><br>
         <%}%>
         <hr>
         <div>
        <ul><li>Moisture Scanning</li></ul>
            <% 
                if(rrep.isMoistscan()){%>
                Yes
            <%}
                else{%>
                No
            <%}%>
         </div>
         
        <%if(rrep.isMoistscan()){%>    
        <tr><td>Moisture point:</td><td> <%= rrep.getMoistpoint() %></td></tr><br>
        <%}%>
        
        <hr>
        
        <ul><li>Conclusion</li></ul>
         <table>
             <tr><th>Recommandations</th><th> <%= rrep.getRecom() %></th></tr>
         </table><br> 
        <div>
            Structural analysis is made by
            <tr><td></td><td> <%= adm.getFirstname() + " " %><%= adm.getLastname() %></td></tr>
            from Polygon in cooperation with
            <tr><td></td><td> <%= rrep.getRconmng() %></td></tr>
            (Construction Manager).
        </div><br>
        
        <form name="Form2" action="UIServlet" method="post">
        <input type="hidden" name="origin" value="rreplist" />
        <br><input type="submit" value="Back" />
        </form>
            
    </body>
</html>