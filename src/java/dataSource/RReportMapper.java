/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Entity.RReport;
import Entity.Room;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Berkant
 */
public class RReportMapper {
 
    public void createRReport(RReport rrp ,Connection con){
        
        try{
            Statement statement;
            statement = con.createStatement();
            String sql = "INSERT into roomreports (rid,rrepdate,rcomment,dmg,moist,rot"
                    + ",mold,fire,other,dmgcomment,walls,ceiling,floor"
                    + ",windoor,moistscan,moistpoint,recommendation,rconmanager)"
                    + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, rrp.getRid());
            stmt.setString(2, rrp.getRrepdate());
            stmt.setString(3, rrp.getRcomm());
            if(rrp.isDmg())
                stmt.setString(4, "yes");
            else
                stmt.setString(4, "no");
            if(rrp.isMoist())
                stmt.setString(5, "yes");
            else
                stmt.setString(5, "no");
            if(rrp.isRot())
                stmt.setString(6, "yes");
            else
                stmt.setString(6, "no");
            if(rrp.isMold())
                stmt.setString(7, "yes");
            else
                stmt.setString(7, "no");
            if(rrp.isFire())
                stmt.setString(8, "yes");
            else
                stmt.setString(8, "no");
            if(rrp.isOther())
                stmt.setString(9, "yes");
            else
                stmt.setString(9, "no");
            stmt.setString(10, rrp.getDmgcom());
            stmt.setString(11, rrp.getWallscom());
            stmt.setString(12, rrp.getCeilingcom());
            stmt.setString(13, rrp.getFloorcom());
            stmt.setString(14, rrp.getWindoorcom());
            if(rrp.isMoist())
                stmt.setString(15, "yes");
            else
                stmt.setString(15, "no");
            stmt.setString(16, rrp.getMoistpoint());
            stmt.setString(17, rrp.getRecom());
            stmt.setString(18, rrp.getRconmng());
            stmt.executeUpdate();
            
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
            
    public void readRReports(Room r,Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "SELECT * FROM roomreports;";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int rrepid = rs.getInt("rrepid");
                int rid = rs.getInt("rid");
                String rrepdate = rs.getString("rrepdate");
                String rcomment = rs.getString("rcomment");
                boolean dmg;
                if(rs.getString("dmg").equals("yes"))
                    dmg = true;
                else
                    dmg = false;
                boolean moist;
                if(rs.getString("moist").equals("yes"))
                    moist = true;
                else
                    moist = false;
                boolean rot;
                if(rs.getString("rot").equals("rot"))
                    rot = true;
                else
                    rot = false;
                boolean mold;
                if(rs.getString("mold").equals("yes"))
                    mold = true;
                else
                    mold = false;
                boolean fire;
                if(rs.getString("fire").equals("yes"))
                    fire = true;
                else
                    fire = false;
                boolean other;
                if(rs.getString("other").equals("yes"))
                    other = true;
                else
                    other = false;
                String dmgcomment = rs.getString("dmgcomment");
                String walls = rs.getString("walls");
                String ceiling = rs.getString("ceiling");
                String floor = rs.getString("floor");
                String windoor = rs.getString("windoor");
                boolean moistscan;
                if(rs.getString("moistscan").equals("yes"))
                    moistscan = true;
                else
                    moistscan = false;
                String moistpoint = rs.getString("moistpoint");
                String recommendation = rs.getString("recommendation");
                String rconmanager = rs.getString("rconmanager");
                RReport rrep = new RReport(rrepid, rid, rrepdate, rcomment, dmg, moist, rot, mold, fire, other, dmgcomment, walls, ceiling, floor, windoor, moistscan, moistpoint, recommendation, rconmanager);
                r.addReport(rrep);
            }
            

        } catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              } 
    }
        
    

    public void updateRrepdateReport(int rrepid, String newrrepdate, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set rrepdate=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newrrepdate);
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateRcommentReport(int rrepid, String newrcomment, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set rcomment=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newrcomment);
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateDmgReport(int rrepid, boolean newdmg, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set dmg=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            if(newdmg == true)
                stmt.setString(1, "yes");
            else
                stmt.setString(1, "no");
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateMoistReport(int rrepid, boolean newmoist, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set moist=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            if(newmoist == true)
                stmt.setString(1, "yes");
            else
                stmt.setString(1, "no");
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateRotReport(int rrepid, boolean newrot, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set rot=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            if(newrot == true)
                stmt.setString(1, "yes");
            else
                stmt.setString(1, "no");
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateMoldReport(int rrepid, boolean newmold, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set mold=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            if(newmold == true)
                stmt.setString(1, "yes");
            else
                stmt.setString(1, "no");
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateFireReport(int rrepid, boolean newfire, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set fire=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            if(newfire == true)
                stmt.setString(1, "yes");
            else
                stmt.setString(1, "no");
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateOtherReport(int rrepid, boolean newother, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set other=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            if(newother == true)
                stmt.setString(1, "yes");
            else
                stmt.setString(1, "no");
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateDmgcommentReport(int rrepid, String newdmgcomment, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set dmgcomment=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newdmgcomment);
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateWallscommentReport(int rrepid, String newwalls, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set walls=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newwalls);
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateCeilingcommentReport(int rrepid, String newceiling, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set ceiling=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newceiling);
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateFloorcommentReport(int rrepid, String newfloor, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set floor=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newfloor);
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateWindoorcommentReport(int rrepid, String newwindoor, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set windoor=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newwindoor);
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateMoistscanReport(int rrepid, boolean newmoistscan, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set moistscan=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            if(newmoistscan)
                stmt.setString(1, "yes");
            else
                stmt.setString(1, "no");
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateMoistpointReport(int rrepid, String newmoistpoint, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set moistpoint=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newmoistpoint);
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateRecommendationReport(int rrepid, String newrecommendation, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set recommendation=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newrecommendation);
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateRconmanagerReport(int rrepid, String newrconmanager, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set rconmanager=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newrconmanager);
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void deleteReport(int rrepid, Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "delete from roomreports where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setInt(1, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
        }
}

