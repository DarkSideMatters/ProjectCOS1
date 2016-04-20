/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;
import Entity.Floor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
/**
 *
 * @author Berkant
 */
public class FloorMapper {
     public void createFloor(Floor f,Connection con){
        try{
            Statement statement;
            statement = con.createStatement();
            String sql = "INSERT into floors (fid,bid,fname,fppath) values (?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, f.getFid());
            stmt.setInt(2, f.getBid());
            stmt.setString(3, f.getFname());
            stmt.setString(4, f.getFppath());
            stmt.executeUpdate();
            con.close();
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
     public void updateBIDDamage(Floor f,int bid,int newbid, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update floors set bid=? where bid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setInt(1, newbid);
            stmt.setInt(2,bid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
      public void updateFnameDamage(Floor f,int bid,String newfname, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update floors set fname=? where bid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newfname);
            stmt.setInt(2,bid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
       public void updateFpathDamage(Floor f,int bid,String newfpath, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update floors set fpath=? where bid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newfpath);
            stmt.setInt(2,bid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
           public void deleteFloor(Floor f,int bid, Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "delete from floors where bid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setInt(1,bid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
        
    
        }
    
}
