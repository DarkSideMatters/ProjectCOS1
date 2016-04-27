/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Entity.Room;
import Entity.Floor;
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
public class RoomMapper {
    
    public void createRoom(Room r,Connection con){
        try{
            Statement statement;
            statement = con.createStatement();
            String sql = "INSERT into rooms (rid,fid,rname,size) values (?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, r.getRid());
            stmt.setInt(2, r.getFid());
            stmt.setString(3, r.getRname());
            stmt.setString(4, r.getSize());
            stmt.executeUpdate();
            
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
            
    public void readRooms(Floor f,Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "SELECT * FROM rooms;";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int rid = rs.getInt("rid");
                int fid = rs.getInt("fid");
                String rname = rs.getString("rname");
                String size = rs.getString("size");
                f.addRoom(new Room(rid, fid, rname, size));
            }
            

        } catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              } 
    }
        
    
    public void updateRnameRoom(int rid,String newrname, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update rooms set rname=? where rid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newrname);
            stmt.setInt(2,rid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateSizeRoom(int rid, String newsize, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update rooms set size=? where rid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newsize);
            stmt.setInt(2, rid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    
    
    public void deleteRoom(int rid, Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "delete from rooms where rid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setInt(1, rid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
        
    
        }
}
