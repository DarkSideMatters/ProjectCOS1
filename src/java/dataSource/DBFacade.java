/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import Entity.Building;
import Entity.Customer;
import Entity.Report;
import java.sql.ResultSet;
/**
 *
 * @author Plamen
 */
public class DBFacade {

    
    
    
    public DBFacade(java.sql.Connection con){
            this.con = con;  //DBConnector.getInstance().getConnection();
	  }
    
    public static DBFacade getInstance()
	  {
		  if(instance == null)
			  instance = new DBFacade(DBConnector.getInstance().getConnection());
		  return instance;
	  }
    
    public static DBFacade getTestInstance()
    {
            instance = new DBFacade(TestDBConnector.getTestInstance().getTestConnection());
            return instance;
    }
    
    private final Connection con;
    private static DBFacade instance;
    
   public void addBuilding(String name, String address, int pno, String size, String cname){
       System.out.println(name + address + pno + size + cname);
       try { 	
            Statement statement;
            statement = con.createStatement();
            String sql = "INSERT into buildings (name,address,pno,size) values (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, address);
            stmt.setInt(3, pno);
            stmt.setString(4, size);
            stmt.setString(5, cname);
            stmt.execute();
            
        }catch (SQLException ex){}
    }
   
    public Building getBuilding(String bname){
        Building bd = new Building();
        try{
            Statement statement;
            statement = con.createStatement();
            String sql = "SELECT name,address,pno,size from BUILDINGS where name = ? ";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,bname);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            bd.setName(rs.getString("name"));
            System.out.println(bd.getName());
            bd.setAddress(rs.getString("address"));
            bd.setPno(rs.getInt("pno"));
            bd.setSize(rs.getString("size"));
            bd.setCname(rs.getString("cname"));
            
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return bd;
    }

    public void addCustomer(String cuname, String email, int telephone, String caddress){
        System.out.println(cuname + email + telephone + caddress);
        try{
            Statement statement;
            statement = con.createStatement();
            String sql = "INSERT into customers (cname,email,telephone,caddress) values (?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,cuname);
            stmt.setString(2,email);
            stmt.setInt(3,telephone);
            stmt.setString(4,caddress);
            stmt.executeUpdate();
        } catch (SQLException ex){
        ex.printStackTrace();
                }
        
    }
    
    public Customer getCustomer(String cuname){
        Customer ct = new Customer();
        try{
            Statement statement;
            statement = con.createStatement();
            String sql = "SELECT cuname,email,telephone,caddress from CUSTOMERS where cuname = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,cuname);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            ct.setCuname(rs.getString("cuname"));
            System.out.println(ct.getCuname());
            ct.setEmail(rs.getString("email"));
            ct.setTelephone(rs.getInt("telephone"));
            ct.setCaddress(rs.getString("caddress"));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return ct;
    }

    public void addReport(int reportno, String rdate, String bname, String rcomment) {
        System.out.println(reportno + rdate + bname + rcomment);
        try{
            Statement statement2;
            statement2 = con.createStatement();
            String sqlR = "INSERT into reports (reportno,rdate,bname,baddress,postno,rcomment) values (?,?,?,?);";
            PreparedStatement stmtR = con.prepareStatement(sqlR);
            stmtR.setInt(1,reportno);
            stmtR.setString(2,rdate );
            stmtR.setString(3,bname );
            stmtR.setString(6,rcomment );
            stmtR.execute();
        }catch (SQLException ex){
        ex.printStackTrace();
        }
    }
    
    public Report getReport(String reportno){
        Report rp = new Report();
        try{
            Statement statement;
            statement = con.createStatement();
            String sql = "SELECT reportno,rdate,bname,baddress,postno,rcomment from REPORTS where reportno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,reportno);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            rp.setReportno(rs.getInt("reportno"));
            rp.setRdate(rs.getString("rdate"));
            rp.setBname(rs.getString("bname"));
            rp.setRcomment(rs.getString("rcomment"));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return rp;
    }

}
    

