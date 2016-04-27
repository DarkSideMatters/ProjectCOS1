/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;
import Entity.Building;
import Entity.Floor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
/**
 *
 * @author Berkant
 */
public class FloorMapper {
     public void createFloor(Floor f,Connection con){
        try{
            Statement statement;
            statement = con.createStatement();
            String sql = "INSERT into floors (bid,fname) values (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, f.getBid());
            stmt.setString(2, f.getFname());
            stmt.executeUpdate();
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
     
     public void readFloors(Building b,Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "SELECT * FROM floors";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int bid = rs.getInt("bid");
                int fid = rs.getInt("fid");
                String fname = rs.getString("fname");
                b.addFloor(new Floor(bid,fid,fname));
            }

        } catch (ClassNotFoundException|SQLException|NullPointerException ex) {
            ex.printStackTrace();
              } 

    }
     
      public void updateFnameDamage(int fid,String newfname, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update floors set fname=? where fid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newfname);
            stmt.setInt(2,fid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
       
    public void deleteFloor(int fid, Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "delete from floors where fid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setInt(1,fid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
        
    
        }
    
}
