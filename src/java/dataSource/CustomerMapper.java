/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Entity.Customer;
import Entity.Accounts;
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
public class CustomerMapper {
    
    public void createCustomer(Customer c,Connection con){
        try{
            Statement statement;
            statement = con.createStatement();
            String sql = "INSERT into customers (usrn, pwd, fn, ln, mail, tel, city, address, zip) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, c.getUsername());
            stmt.setString(2, c.getPassword());
            stmt.setString(3, c.getFirstname());
            stmt.setString(4, c.getLastname());
            stmt.setString(5, c.getMail());
            stmt.setString(6, c.getTel());
            stmt.setString(7, c.getCity());
            stmt.setString(8, c.getAddress());
            stmt.setString(9, c.getZip());
            System.out.println(c.toString());
            stmt.executeUpdate();
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void readCustomers(Accounts acc,Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "SELECT * FROM customers;";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int cid = rs.getInt("cid");
                String usrn = rs.getString("usrn");
                String pwd = rs.getString("pwd");
                String fn = rs.getString("fn");
                String ln = rs.getString("ln");
                String mail = rs.getString("mail");
                String tel = rs.getString("tel");
                String city = rs.getString("city");
                String address = rs.getString("address");
                String zip = rs.getString("zip");
                Customer ex = new Customer(cid,usrn,pwd,fn,ln,mail,tel,city,address,zip);
                if(ex==null)
                    System.out.println("EX IS NULL IDIOT");
                else
                    System.out.println(ex.toString());
                acc.addCustomer(ex);
            }

        } catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    
    public void updateUsrnCustomer(Customer c,String newusrn, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update customers set usrn=?, where cid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newusrn);
            stmt.setInt(2,c.getCid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    
    public void updatePwdCustomer(Customer c,String newpwd, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update customers set pwd=?, where cid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newpwd);
            stmt.setInt(2,c.getCid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    
    public void updateFNCustomer(Customer c,String newfn, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update customers set fn=?, where cid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newfn);
            stmt.setInt(2,c.getCid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    
    public void updateLNCustomer(Customer c,String newln, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update customers set ln=?, where cid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newln);
            stmt.setInt(2,c.getCid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    
    public void updateMailCustomer(Customer c,String newmail, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update customers set mail=?, where cid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newmail);
            stmt.setInt(2,c.getCid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    
    public void updateTelCustomer(Customer c,String newtel, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update customers set tel=?, where cid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newtel);
            stmt.setInt(2,c.getCid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    
    public void updateCityCustomer(Customer c,String newcity, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update customers set city=?, where cid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newcity);
            stmt.setInt(2,c.getCid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    
    public void updateAddressCustomer(Customer c,String newaddress, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update customers set address=?, where cid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newaddress);
            stmt.setInt(2,c.getCid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
}
    
    public void updateZipCustomer(Customer c,String newzip, Connection con) {
    try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "update customers set zip=?, where cid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setString(1, newzip);
            stmt.setInt(2,c.getCid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
    }
    
    public void deleteCustomer(Customer c, Connection con){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sqlString = "delete from customers where cid=?";
            PreparedStatement stmt = con.prepareStatement(sqlString);
            stmt.setInt(1,c.getCid());
            stmt.executeUpdate();
        
    }catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
              }
        
    
        }
    
}
