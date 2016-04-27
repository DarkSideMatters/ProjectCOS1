/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Entity.BReport;
import Entity.Building;
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
public class BReportMapper {
 
    public void createBReport(BReport brp ,Connection con){
        
        try{
            Statement statement;
            statement = con.createStatement();
            String sql = "INSERT into buildingreports (bid,brdate,usagecomment,roofcomment,extwallscomment,pemployee,bconmanager,grade) values (?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, brp.getBid());
            stmt.setString(2, brp.getBrdate());
            stmt.setString(3, brp.getUsagecomment());
            stmt.setString(4, brp.getRoofcomment());
            stmt.setString(5, brp.getExtwallscomment());
            stmt.setString(6, brp.getBconmanager());
            stmt.setString(7, brp.getPemployee());
            stmt.setString(8, brp.getGrade());
            stmt.executeUpdate();
            
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
            
    public void readBReports(Building b ,Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "SELECT * FROM buildingreports where bid=?;";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setInt(1, b.getBid());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int brepid = rs.getInt("brepid");
                int bid = b.getBid();
                String brdate = rs.getString("brdate");
                String usagecomment = rs.getString("usagecomment");
                String roofcomment = rs.getString("roofcomment");
                String extwallscomment = rs.getString("extwallscomment");
                String pemployee = rs.getString("pemployee");
                String bconmanager = rs.getString("bconmanager");
                String grade = rs.getString("grade");
                b.addReport(new BReport(brepid, bid, brdate, usagecomment,roofcomment, extwallscomment, pemployee, bconmanager, grade));
            }
        } catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              } 
    }
        
   
    public void updateBrdateReport(int brepid, String newbrdate, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update buildingreports set brdate=? where brepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newbrdate);
            stmt.setInt(2,brepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateUsagecommentReport(int brepid, String newusagecomment, Connection con) {
    try {
            Class.forName("con.mysql.jdbc.Driver");
            
            String sqlString = "update buildingreports set usagecomment=? where brepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newusagecomment);
            stmt.setInt(2,brepid);
            stmt.executeUpdate();
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateRoofcommentReport(int brepid, String newroofcomment, Connection con) {
    try {
            Class.forName("con.mysql.jdbc.Driver");
            
            String sqlString = "update buildingreports set roofcomment=? where brepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newroofcomment);
            stmt.setInt(2,brepid);
            stmt.executeUpdate();
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateExtwallscommentReport(int brepid, String newextwallscomment, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update buildingreports set extwallscomment=? where brepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newextwallscomment);
            stmt.setInt(2,brepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updatePemployeeReport(int brepid, String newpemployee, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update buildingreports set pemployee=? where brepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newpemployee);
            stmt.setInt(2,brepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateBconmanagerReport(int brepid, String newbconmanager, Connection con) {
    try {
            Class.forName("con.mysql.jdbc.Driver");
            
            String sqlString = "update buildingreports set bconmanager=? where brepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newbconmanager);
            stmt.setInt(2,brepid);
            stmt.executeUpdate();
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateGradeReport(int brepid, String newgrade, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update buildingreports set grade=? where brepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newgrade);
            stmt.setInt(2, brepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void deleteBReport(int brepid, Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "delete from buildingreports where brepid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setInt(1,brepid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
        }
}
