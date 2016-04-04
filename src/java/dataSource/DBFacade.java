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
}
    

