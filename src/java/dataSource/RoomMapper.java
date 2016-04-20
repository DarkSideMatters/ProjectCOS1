/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

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
public class RoomMapper {
    
    public void createRoom(Room r,Connection con){
        boolean dam;
        try{
            Statement statement;
            statement = con.createStatement();
            String sql = "INSERT into rooms (rid,fid,rname,dam) values (?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, r.getRid());
            stmt.setInt(2, r.getFid());
            stmt.setString(3, r.getRname());
            if(r.getDam())
                stmt.setString(4,"yes");
            else
                stmt.setString(4,"no"); 
    
            stmt.executeUpdate();
            con.close();
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
            
    public List<Room> readRooms(Room r,Connection con){
        List<Room> rooms = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "SELECT * FROM rooms;";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int rid = rs.getInt("rid");
                int fid = rs.getInt("fid");
                String rname = rs.getString("rname");
                boolean dam;
                if(rs.getString("dam").equals("yes"))
                    dam = true;
                else 
                    dam = false;
                rooms.add(new Room(rid, fid, rname, dam));
            }
            con.close();

        } catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              } 
        return rooms;

    }
        
    
    public void updateRnameRoom(Room r,String newrname, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update rooms set rname=? where rid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newrname);
            stmt.setInt(2,r.getRid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    public void updateDamRoom(Room r, Boolean dam, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update rooms set dam=? where rid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            if(r.getDam())
                stmt.setString(1,"yes");
            else
                stmt.setString(1,"no");
            stmt.setInt(2, r.getRid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    
    
    public void deleteRoom(Room r, Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "delete from rooms where rid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setInt(1, r.getRid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
        
    
        }
}
