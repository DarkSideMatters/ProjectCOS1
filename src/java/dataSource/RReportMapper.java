/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Entity.RReport;
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
            String sql = "INSERT into roomreports () values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, rrp.getRrepid());
            stmt.setInt(2, rrp.getRid());
            stmt.setString(3, rrp.getRrepnum());
            stmt.setString(4, rrp.getRrepdate());
            stmt.setString(5, rrp.getRcomment());
            if(rrp.getDmg())
                stmt.setString(6, "yes");
            else
                stmt.setString(6, "no");
            if(rrp.getMoist())
                stmt.setString(7, "yes");
            else
                stmt.setString(7, "no");
            if(rrp.getRot())
                stmt.setString(8, "yes");
            else
                stmt.setString(8, "no");
            if(rrp.getMould())
                stmt.setString(9, "yes");
            else
                stmt.setString(9, "no");
            if(rrp.getFire())
                stmt.setString(10, "yes");
            else
                stmt.setString(10, "no");
            if(rrp.getOther())
                stmt.setString(11, "yes");
            else
                stmt.setString(11, "no");
            stmt.setString(12, rrp.getDmgcomment());
            stmt.setString(13, rrp.getWalls());
            stmt.setString(14, rrp.getCeiling());
            stmt.setString(15, rrp.getFloor());
            stmt.setString(16, rrp.getWindoor());
            stmt.setString(17, rrp.getMoistscan());
            stmt.setString(18, rrp.getMoistpoint());
            stmt.setString(19, rrp.getRecommendation());
            stmt.setString(20, rrp.getRconmanager());
            stmt.executeUpdate();
            
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
            
    public List<RReport> readRReports(RReport rrp ,Connection con){
        List<RReport> rreports = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "SELECT * FROM roomreports;";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int rrepid = rs.getInt("rrepid");
                int rid = rs.getInt("rid");
                String rrepnum = rs.getString("rrepnum");
                String rrepdate = rs.getString("rrepdate");
                String rcomment = rs.getString("rcomment");
                Boolean dmg;
                if(rs.getString("dmg").equals("yes"))
                    dmg = true;
                else
                    dmg = false;
                Boolean moist;
                if(rs.getString("moist").equals("yes"))
                    moist = true;
                else
                    moist = false;
                Boolean rot;
                if(rs.getString("rot").equals("rot"))
                    rot = true;
                else
                    rot = false;
                Boolean mould;
                if(rs.getString("mould").equals("yes"))
                    mould = true;
                else
                    mould = false;
                Boolean fire;
                if(rs.getString("fire").equals("yes"))
                    fire = true;
                else
                    fire = false;
                Boolean other;
                if(rs.getString("other").equals("yes"))
                    other = true;
                else
                    other = false;
                String dmgcomment = rs.getString("dmgcomment");
                String walls = rs.getString("walls");
                String ceiling = rs.getString("ceiling");
                String floor = rs.getString("floor");
                String windoor = rs.getString("windoor");
                String moistscan = rs.getString("moistscan");
                String moistpoint = rs.getString("moistpoint");
                String recommendation = rs.getString("recommendation");
                String rconmanager = rs.getString("rconmanager");
                rreports.add(new RReport(rrepid, rid, rrepnum, rrepdate, rcomment, dmg, moist, rot, mould, fire, other, dmgcomment, walls, ceiling, floor, windoor, moistscan, moistpoint, recommendation, rconmanager));
            }
            

        } catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              } 
        return rreports;

    }
        
    
    public void updateRrepnumReport(int rrepid, String newrrepnum, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set rrepnum=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newrrepnum);
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateRrepdateReport(int rrepid, String newrrepdate, Connection con) throws SQLException{
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
    public void updateRcommentReport(int rrepid, String newrcomment, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set rrepcomment=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newrcomment);
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateDmgReport(int rrepid, Boolean newdmg, Connection con) throws SQLException{
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
    public void updateMoistReport(int rrepid, Boolean newmoist, Connection con) throws SQLException{
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
    public void updateRotReport(int rrepid, Boolean newrot, Connection con) throws SQLException{
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
    public void updateMouldReport(int rrepid, Boolean newmould, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set mould=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            if(newmould == true)
                stmt.setString(1, "yes");
            else
                stmt.setString(1, "no");
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateFireReport(int rrepid, Boolean newfire, Connection con) throws SQLException{
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
    public void updateOtherReport(int rrepid, Boolean newother, Connection con) throws SQLException{
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
    public void updateDmgcommentReport(int rrepid, String newdmgcomment, Connection con) throws SQLException{
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
    public void updateWallsReport(int rrepid, String newwalls, Connection con) throws SQLException{
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
    public void updateCeilingReport(int rrepid, String newceiling, Connection con) throws SQLException{
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
    public void updateFloorReport(int rrepid, String newfloor, Connection con) throws SQLException{
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
    public void updateWindoorReport(int rrepid, String newwindoor, Connection con) throws SQLException{
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
    public void updateMoistscanReport(int rrepid, String newmoistscan, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update roomreports set moistscan=? where rrepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newmoistscan);
            stmt.setInt(2, rrepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateMoistpointReport(int rrepid, String newmoistpoint, Connection con) throws SQLException{
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
    public void updateRecommendationReport(int rrepid, String newrecommendation, Connection con) throws SQLException{
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
    public void updateRconmanageReport(int rrepid, String newrconmanager, Connection con) throws SQLException{
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

