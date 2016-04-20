/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;
import Entity.Accounts;
import Entity.Admin;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Berkant
 */
public class AdminMapper{
    
    public void createAdmin(Admin a,Connection con){
        try{
            Statement statement;
            statement = con.createStatement();
            String sql = "INSERT into admins (usrn,pwd,fn,ln,mail,tel) values (?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, a.getUsername());
            stmt.setString(2, a.getPassword());
            stmt.setString(3, a.getFirstname());
            stmt.setString(4, a.getLastname());
            stmt.setString(5, a.getMail());
            stmt.setString(6, a.getTel());
            stmt.executeUpdate();
            con.close();
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
            
    public void readAdmins(Accounts acc,Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "SELECT * FROM admins;";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int aid = rs.getInt("cid");
                String usrn = rs.getString("usrn");
                String pwd = rs.getString("pwd");
                String fn = rs.getString("fn");
                String ln = rs.getString("ln");
                String mail = rs.getString("mail");
                String tel = rs.getString("tel");
                
                Admin ad = new Admin(aid,usrn,pwd,fn,ln,mail,tel);
                if(ad==null)
                    System.out.println("AD must be there");
                else
                    System.out.println(ad.toString());
                acc.addAdmin(ad);
            }

        } catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
        
    
    public void updatePwdAdmin(Admin a,String newpassword, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update admins set pwd=? where aid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newpassword);
            stmt.setInt(2,a.getAid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    public void updateMailAdmin(Admin a,String newmail, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update admins set mail=? where aid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newmail);
            stmt.setInt(2,a.getAid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
public void updateTelAdmin(Admin a,String newtel, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update admins set tel=? where aid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newtel);
            stmt.setInt(2,a.getAid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    public void deleteAdmin(Admin a, Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "delete from admins where aid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setInt(1,a.getAid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
        
    
        }
}

