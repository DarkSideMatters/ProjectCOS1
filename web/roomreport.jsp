<%-- 
    Document   : room rep
    Created on : Apr 20, 2016, 4:32:15 AM
    Author     : Radu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        
        <h1>Polygon</h1>
        <h2>-Room Report-</h2>
        <table id="tabel1">
            <tr><td>RoomNo:</td><td> <input type="text" name="roomno" value="" /></td></tr>    
            <tr><td>Date:</td><td> <input type="text" name="date" value="" /></td></tr>
            <tr><td>Name of building:</td><td> <input type="text" name="buildingname" value="" /></td></tr>
            <tr><td>Room size(square meters):</td><td> <input type="text" name="size" value="" /></td></tr>
            <input type="hidden" name="origin" value="report" />
        </table><br>
        <hr>
        
        <ul><li>Damage and repair</li></ul>
        <table>
        <div>
            There has been damage in the room:
            Yes<input type="radio" name="damage" value="yes" />
            No<input type="radio" name="damage" value="no" />
        </div>
            <tr><td>When and what happened:</td><td> <input type="text" name="whencomment" value="" /></td></tr><br>
            <tr><td>Where and what happened:</td><td> <input type="text" name="wherecomment" value="" /></td></tr>
        <div>
            What damage:
            Moisture<input type="checkbox" name="checkMoisture" value="ski" />
            &nbsp;&nbsp;Rot<input type="checkbox" name="checkRot" value="skate" />
            &nbsp;&nbsp;Mould<input type="checkbox" name="checkMould" value="ski" />
            &nbsp;&nbsp;Fire<input type="checkbox" name="checkFire" value="skate" />
            &nbsp;&nbsp; Other damage<input type="checkbox" name="checkOtherDamage" value="skate" />
        </div>
        </table><br>
        <hr>
        
        <ul><li>Reviewing</li></ul> 
        <table>
            <tr><td>Walls</td><td></td><td> <input type="text" name="intwallscomment" value="" /></td></tr>
            <tr><td>Ceiling</td><td></td><td> <input type="text" name="ceilingcomment" value="" /></td></tr>
            <tr><td>Floor</td><td></td><td> <input type="text" name="floorcomment" value="" /></td></tr>
            <tr><td>Windows/Doors</td><td></td><td> <input type="text" name="wdcomment" value="" /></td></tr>
         </table><br>
         <hr>
         
        <ul><li>Moisture Scanning</li></ul> 
        <tr><td>Moisture point:</td><td> <input type="text" name="moisturepoint" value="" /></td></tr><br>
        <hr>
        
        <ul><li>Conclusion</li></ul>
         <table>
            <tr><th>Recommandations</th></tr>
            <tr><th><textarea></textarea></th></tr>
         </table><br> 
        <div>
            Structural analysis is made by
            <tr><td></td><td> <input type="text" name="conmang" value="" /></td></tr>
            from Polygon in cooperation with
            <tr><td></td><td> <input type="text" name="consmanger" value="" /></td></tr>
            (Construction Manager).
        </div><br>
        <br><input type="submit" value="Submit" name="submit" />
    </body>
</html>
