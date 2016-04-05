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
/**
 *
 * @author Plamen
 */
public class DBFacade {

    
    
    
    public DBFacade(){
            con = DBConnector.getInstance().getConnection();
	  }
    
    public static DBFacade getInstance()
	  {
		  if(instance == null)
			  instance = new DBFacade();
		  return instance;
	  }
    
    private final Connection con;
    private static DBFacade instance;
    
   public void addBuilding(String name, String address, int pno, String size){
       System.out.println(name + address + pno + size);
       try { 	
            Statement statement;
            statement = con.createStatement();
            String sql = "INSERT into buildings (name,address,pno,size) values (?,?,?,?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, address);
            stmt.setInt(3, pno);
            stmt.setString(4, size);
            stmt.execute();
        }catch (SQLException ex){}
        
    }

    public void addCustomer(String cname, String email, String telephone, String caddress){
        System.out.println(cname + email + telephone + caddress);
        try{
            Statement statement1;
            statement1 = con.createStatement();
            String sqlC = "INSERT into customers (cname,email,telephone,caddress) values (?,?,?,?);";
            PreparedStatement stmtC = con.prepareStatement(sqlC);
            stmtC.setString(1,cname);
            stmtC.setString(2,email);
            stmtC.setString(3,telephone);
            stmtC.setString(4,caddress);
            stmtC.execute();
        } catch (SQLException ex){}
        
    }

    public void addReport(String reportno, String rdate, String bname, String baddress, String postno, String rcomment) {
        System.out.println(reportno + rdate + bname + baddress + postno + rcomment);
        try{
            Statement statement2;
            statement2 = con.createStatement();
            String sqlR = "INSERT into reports (reportno,rdate,bname,baddress,postno,rcomment) values (?,?,?,?,?,?);";
            PreparedStatement stmtR = con.prepareStatement(sqlR);
            stmtR.setString(1,reportno);
            stmtR.setString(2,rdate );
            stmtR.setString(3,bname );
            stmtR.setString(4,baddress );
            stmtR.setString(5,postno );
            stmtR.setString(6,rcomment );
            stmtR.execute();
        }catch (SQLException ex){}
    }
}
    

