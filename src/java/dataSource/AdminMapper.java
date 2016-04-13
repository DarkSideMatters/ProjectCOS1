/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;
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
 * @author Plamen
 */
public class AdminMapper{
    
    public void createAdmin(Admin a,Connection con){
        try{
            Statement statement;
            statement = con.createStatement();
            String sql = "INSERT into admins (aid,usrn,pwd,fn,ln,mail,tel) values (?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, a.getAid());
            stmt.setString(2, a.getUsername());
            stmt.setString(3, a.getPassword());
            stmt.setString(4, a.getFirstname());
            stmt.setString(5, a.getLastname());
            stmt.setString(6, a.getMail());
            stmt.setString(7, a.getTel());
            stmt.executeUpdate();
            con.close();
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
            
    public List<Admin> readAdmin(Admin a,Connection con){
        List<Admin> admins = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "SELECT * FROM admins;";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int aid = rs.getInt("aid");
                String username = rs.getString("usrn");
                String pwd = rs.getString("pwd");
                String firstname = rs.getString("fn");
                String lastname = rs.getString("ln");
                String mail = rs.getString("mail");
                String telephone = rs.getString("tel");
                admins.add(new Admin(aid,username, pwd, firstname, lastname, mail, telephone));
            }
            con.close();

        } catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              } 
        return admins;

    }
        
    
    public void updatePwdAdmin(Admin a,String newpassword, Connection con) throws SQLException{
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update admins set pwd=?, where aid=?";
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

            String sqlString = "update admins set mail=?, where aid=?";
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

            String sqlString = "update admins set tel=?, where aid=?";
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

