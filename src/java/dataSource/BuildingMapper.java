/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Entity.Building;
import Entity.Customer;
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
public class BuildingMapper {
    
    public void createBuilding(Building bd,Connection con){
        try{
            Statement statement;
            statement = con.createStatement();
            String sql = "INSERT into buildings (cid, bname, city, address, zip, year, size) values (?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, bd.getCid());
            stmt.setString(2,bd.getBname());
            stmt.setString(3, bd.getCity());
            stmt.setString(4,bd.getAddress());
            stmt.setString(5, bd.getZip());
            stmt.setString(6, bd.getYear());
            stmt.setString(7, bd.getSize());
            stmt.executeUpdate();
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void readBuildings(Customer c,Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "SELECT * FROM buildings";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int bid = rs.getInt("bid");
                int cid = rs.getInt("cid");
                String bname = rs.getString("bname");
                String size = rs.getString("size");
                String roof = rs.getString("roof");
                String extwalls = rs.getString("extwalls");
                String usagecomment = rs.getString("usagecomment");
                String year = rs.getString("year");
                String city = rs.getString("city");
                String address = rs.getString("address");
                String zip = rs.getString("zip");
                c.add(new Building(cid,bid,bname,city,address,zip,year,size,roof,extwalls,usagecomment));
            }

        } catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              } 

    }
    
    public void updateBnameBuilding(Building bd,String newbname, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update buildings set bname=?, where bid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newbname);
            stmt.setInt(2,bd.getBid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    public void updateSizeBuilding(Building bd,String newsize, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update buildings set size=?, where bid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newsize);
            stmt.setInt(2,bd.getBid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    public void updateRoofBuilding(Building bd, String newroof, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update buildings set roof=?, where bid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newroof);
            stmt.setInt(2,bd.getBid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    public void updateExtwallsBuilding(Building bd,String newextwalls, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update buildings set extwalls=?, where bid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newextwalls);
            stmt.setInt(2,bd.getBid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    public void updateUsagecommentBuilding(Building bd,String newusagecomment, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update buildings set ussagecomment=?, where bid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newusagecomment);
            stmt.setInt(2,bd.getBid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    public void updateYearBuilding(Building bd,String newyear, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update buildings set year=?, where bid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newyear);
            stmt.setInt(2,bd.getBid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    public void updateCityBuilding(Building bd,String newcity, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update buildings set city=?, where bid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newcity);
            stmt.setInt(2,bd.getBid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    
    public void updateAddressBuilding(Building bd,String newaddress, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update buildings set address=?, where bid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newaddress);
            stmt.setInt(2,bd.getBid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    
    public void updateZipBuilding(Building bd,String newzip, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update buildings set zip=?, where bid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newzip);
            stmt.setInt(2,bd.getBid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    
    public void deleteBuilding(Building bd, Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "delete from buildings where bid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setInt(1,bd.getBid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
        
    
        }
    
    
}
