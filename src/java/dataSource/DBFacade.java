/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;


import Entity.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import Entity.Report;
import java.sql.ResultSet;

/**
 *
 * @author Plamen
 */
public class DBFacade {
    public CustomerMapper cs;
    public BuildingMapper bm;
    public DBConnector dbc;
    
    
    
    public DBFacade(){
            con = dbc.getInstance().getConnection();  //DBConnector.getInstance().getConnection();
            cs = new CustomerMapper();
            bm = new BuildingMapper();
	  }
    

    
    public static DBFacade getInstance()
	  {
		  if(instance == null)
			  instance = new DBFacade();
		  return instance;
          }
    
    private final Connection con;
    private static DBFacade instance;


    public void addCustomer(Customer ct){
        System.out.println(ct.toString());
        cs.createCustomer(ct,con);
        
    }
    
    public void readCustomers(Accounts acc){
        cs.readCustomers(acc, con);
    }
    
    public void addBuilding(Building bd){
        bm.createBuilding(bd,con);
    }
    
    public void readBuildings(Customer c){
        bm.readBuildings(c, con);
    }
    
    public void deleteBuilding(int bid){
        bm.deleteBuilding(bid, con);
    }

    public void updateBnameBuilding(int bid, String newbname) throws SQLException{
        bm.updateBnameBuilding(bid, newbname, con);
    }
    
    public void updateSizeBuilding(int bid, String newsize) throws SQLException{
        bm.updateSizeBuilding(bid, newsize, con);
    }        
    
    public void updateRoofBuilding(int bid, String newroof) throws SQLException{
        bm.updateRoofBuilding(bid, newroof, con);
    }      
    
    public void updateExtwallsBuilding(int bid, String newextwalls) throws SQLException{
        bm.updateExtwallsBuilding(bid, newextwalls, con);
    }     
    
    public void updateUsagecommentBuilding(int bid, String newusagecomment) throws SQLException{
        bm.updateUsagecommentBuilding(bid, newusagecomment, con);
    }    
    
    public void updateYearBuilding(int bid, String newyear) throws SQLException{
        bm.updateYearBuilding(bid, newyear, con);
    }   
    
    public void updateCityBuilding(int bid, String newcity) throws SQLException{
        bm.updateCityBuilding(bid, newcity, con);
    }                
    public void updateAddressBuilding(int bid, String newaddress) throws SQLException{
        bm.updateAddressBuilding(bid, newaddress, con);
    }        
}
    

