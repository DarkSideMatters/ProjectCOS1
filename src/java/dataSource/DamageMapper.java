/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;
import Entity.Damage;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
/**
 *
 * @author Berkant
 */
public class DamageMapper {
    public void createDamage(Damage dmg,Connection con){
        boolean moist;
        try{
            Statement statement;
            statement = con.createStatement();
            String sql = "INSERT into damage (damid,rid,descr,dtype,moist,moistpoint,wall,ceiling,floor,windoor,recommendation) values (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, dmg.getDamid());
            stmt.setInt(2, dmg.getRid());
            stmt.setString(3, dmg.getDescr());
            stmt.setString(4, dmg.getDtype());
            if (dmg.getMoisture())
               stmt.setString(5,"yes");
            else
               stmt.setString(5,"no");
            stmt.setString(6, dmg.getMoisturepoint());
            stmt.setString(7, dmg.getWalls());
            stmt.setString(8, dmg.getCeiling());
            stmt.setString(9, dmg.getFloor());
            stmt.setString(10, dmg.getWindoor());
            stmt.setString(11, dmg.getRecommendation());
            stmt.executeUpdate();
            con.close();
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
     public Damage readDamage(Damage dmg, int rid, Connection con){
       boolean moist;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "SELECT * FROM damage where rid=?;";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setInt(1, rid);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int damid = rs.getInt("aid");
                String descr = rs.getString("descr");
                String dtype = rs.getString("dtype");                    
                if(rs.getString("moist").equals("yes"))
                    moist = true;
                else
                    moist = false;

                String moistpoint = rs.getString("moistpoint");
                String wall = rs.getString("wall");
                String ceiling = rs.getString("ceiling");
                String floor = rs.getString("floor");
                String windoor = rs.getString("windoor");
                String recommendation = rs.getString("recommendation");
                dmg = new Damage(damid,rid,descr,dtype,moist,moistpoint,wall,ceiling,floor,windoor,recommendation);
            }
            con.close();

        } catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              } 
        return dmg;

    }
     public void updateDescrDamage(Damage dmg,int rid,String newdescr, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update damages set descr=? where rid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newdescr);
            stmt.setInt(2,rid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
     public void updateDTypeDamage(Damage dmg,int rid,String newdtype, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update damages set dtype=? where rid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newdtype);
            stmt.setInt(2,rid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
     public void updateMoistDamage(Damage dmg,int rid,Boolean newmoist, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update damages set moist=? where rid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            if (dmg.getMoisture())
               stmt.setString(1,"yes");
            else
               stmt.setString(1,"no");
            stmt.setInt(2,rid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
     public void updateMoistPointDamage(Damage dmg,int rid,String newmoistpoint, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update damages set moistpoint=? where rid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newmoistpoint);
            stmt.setInt(2,rid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
       public void updateCeilingDamage(Damage dmg,int rid,String newceiling, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update damages set ceiling=? where rid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newceiling);
            stmt.setInt(2,rid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
         public void updateWallDamage(Damage dmg,int rid,String newwall, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update damages set wall=? where rid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newwall);
            stmt.setInt(2,rid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
           public void updateFloorDamage(Damage dmg,int rid,String newfloor, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update damages set floor=? where rid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newfloor);
            stmt.setInt(2,rid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
             public void updateWindoorDamage(Damage dmg,int rid,String newwindoor, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update damages set windoor=? where rid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newwindoor);
            stmt.setInt(2,rid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
               public void updateRecommendationDamage(Damage dmg,int rid,String newrecommendation, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update damages set recommendation=? where rid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newrecommendation);
            stmt.setInt(2,rid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
     public void deleteDamage(Damage dmg,int rid, Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "delete from damage where rid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setInt(1,rid);
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
        
    
        }
    
}
