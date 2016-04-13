/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Entity.Report;
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
public class ReportMapper {
 
    public void createReport(Report rp ,Connection con){
        
        try{
            Statement statement;
            statement = con.createStatement();
            String sql = "INSERT into reports (repid,bid,repnum,rdate,damid,conmanager,grade) values (?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, rp.getRepid());
            stmt.setInt(2, rp.getBid());
            stmt.setString(3, rp.getRepnum());
            stmt.setString(4, rp.getRdate());
            stmt.setInt(5, rp.getDamid());
            stmt.setString(6, rp.getConmanager());
            stmt.setString(7, rp.getGrade());
            stmt.executeUpdate();
            con.close();
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
            
    public List<Report> readReports(Report rp ,Connection con){
        List<Report> reports = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "SELECT * FROM reports;";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int repid = rs.getInt("repid");
                int bid = rs.getInt("bid");
                String repnum = rs.getString("repnum");
                String rdate = rs.getString("rdate");
                int damid = rs.getInt("damid");
                String conmanager = rs.getString("conmanager");
                String grade = rs.getString("grade");
                reports.add(new Report(repid, bid, repnum, rdate, damid, conmanager, grade));
            }
            con.close();

        } catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              } 
        return reports;

    }
        
    
    public void updateRepnumReport(Report rp,String newrepnum, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update reports set repnum=?, where repid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newrepnum);
            stmt.setInt(2,rp.getRepid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateRdateReport(Report rp, String newrdate, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update reports set rdate=?, where repid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newrdate);
            stmt.setInt(2,rp.getRepid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    
   
    public void updateConmanagerReport(Report rp, String newconmanager, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update reports set conmanager=?, where repid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newconmanager);
            stmt.setInt(2,rp.getRepid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateGradeReport(Report rp, String newgrade, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update reports set grade=?, where repid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newgrade);
            stmt.setInt(2,rp.getRepid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void deleteReport(Report rp, Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "delete from reports where repid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setInt(1,rp.getRepid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
        }
}
