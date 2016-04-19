<%-- 
    Document   : ReportPage
    Created on : Apr 5, 2016, 3:10:08 AM
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
       #tabel1{}
  
            
        </style>
    </head>
    <body>
           <h1>Polygon</h1>
        <table id="tabel1">
            <tr><td>ReportNo:</td><td> <input type="text" name="reportno" value="" /></td></tr>    
            <tr><td>Date:</td><td> <input type="text" name="date" value="" /></td></tr>
            <tr><td>Name of building:</td><td> <input type="text" name="buildingname" value="" /></td></tr>
            <tr><td>Address:   </td><td> <input type="text" name="address" value="" /></td></tr>
            <tr><td>PostNo:</td><td> <input type="text" name="postno" value="" /></td></tr>
            <input type="hidden" name="origin" value="report" />
        </table><br>
        <hr>
        
        <ul><li>General information about the building</li></ul>
        <table>
            <tr><td>Year:</td><td> <input type="text" name="year" value="" /></td></tr>
            <tr><td>Floor space(square meters):</td><td> <input type="text" name="size" value="" /></td></tr>
            <tr><td>What the building has been used for:</td><td> <input type="text" name="usagecomment" value="" /></td></tr>
        </table><br>
        <hr>
        
        <ul><li>Review of the building exterior</li></ul>
         <table>
            <tr><th></th><th>Comment</th><th>No comment</th><th></th></tr>
            <tr><td>Roof</td><td><input type="radio" name="roofcomm" value="yes" /></td><td><input type="radio" name="roofcomm" value="no" /></td><td></td><td> <input type="text" name="roofcomment" value="" /></td></tr>
            <tr><td>Exterior Walls</td><td><input type="radio" name="wallscomm" value="yes" /></td><td><input type="radio" name="wallscomm" value="no" /></td><td></td><td> <input type="text" name="extwallscomment" value="" /></td></tr>
            <tr><td>Room</td><td><input type="radio" name="roomcomm" value="yes" /></td><td><input type="radio" name="roomcomm" value="no" /></td><td></td><td> <input type="text" name="roomcomment" value="" /></td></tr>
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
            &nbsp;&nbsp;Council and sponge<input type="checkbox" name="checkCouncil" value="skate" />
            &nbsp;&nbsp;Mould<input type="checkbox" name="checkMould" value="ski" />
            &nbsp;&nbsp;Fire<input type="checkbox" name="checkFire" value="skate" />
            &nbsp;&nbsp; Other damage<input type="checkbox" name="checkOtherDamage" value="skate" />
        </div>
        </table><br>
        <hr>
        
        <ul><li>Reviewing</li></ul> 
        <table>
            <tr><th></th><th>Comment</th><th>No comment</th><th></th></tr>
            <tr><td>Walls</td><td><input type="radio" name="intwallcomm" value="yes" /></td><td><input type="radio" name="intwallcomm" value="no" /></td><td></td><td> <input type="text" name="intwallscomment" value="" /></td></tr>
            <tr><td>Ceiling</td><td><input type="radio" name="ceilingcomm" value="yes" /></td><td><input type="radio" name="ceilingcomm" value="no" /></td><td></td><td> <input type="text" name="ceilingcomment" value="" /></td></tr>
            <tr><td>Floor</td><td><input type="radio" name="floorcomm" value="yes" /></td><td><input type="radio" name="floorcomm" value="no" /></td><td></td><td> <input type="text" name="floorcomment" value="" /></td></tr>
            <tr><td>Windows/Doors</td><td><input type="radio" name="wdcomm" value="yes" /></td><td><input type="radio" name="wdcomm" value="no" /></td><td></td><td> <input type="text" name="wdcomment" value="" /></td></tr>
         </table><br>
         <hr>
         
        <ul><li>Moisture Scanning</li></ul> 
        <div>
            Are there moisture scanning:
            Yes<input type="radio" name="moisture" value="yes" />
            No<input type="radio" name="moisture" value="no" />
        </div>
        <tr><td>Moisture point:</td><td> <input type="text" name="moisturepoint" value="" /></td></tr><br>
        <hr>
        
        <ul><li>Conclusion</li></ul>
        <table>
            <tr><th>Room</th><th>Recommandations</th></tr>
            <tr><td></td><td> <input type="text" name="roomnumber" value="" /></td><td></td><td> <input type="text" name="roomcomm" value="" /></td></tr>
        </table><br> 
        <div>
            Structural analysis is made by
            <tr><td></td><td> <input type="text" name="conmang" value="" /></td></tr>
            from Polygon in cooperation with
            <tr><td></td><td> <input type="text" name="consmanger" value="" /></td></tr>
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
        
        <br><tr><td></td><td><input type="submit" value="Submit" /></td></tr>
    </body>
</html>