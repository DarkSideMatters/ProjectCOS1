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
    public AdminMapper am;
    public DBConnector dbc;
    
    
    
    public DBFacade(){
            con = dbc.getInstance().getConnection();  //DBConnector.getInstance().getConnection();
            cs = new CustomerMapper();
            bm = new BuildingMapper();
            am = new AdminMapper();
	  }
    

    
    public static DBFacade getInstance()
	  {
		  if(instance == null)
			  instance = new DBFacade();
		  return instance;
          }
    
    private final Connection con;
    private static DBFacade instance;



 /////////////////////////////// BUILDING    
    public void addBuilding(Building bd){
        bm.createBuilding(bd,con);
    }
    
    public void readBuildings(Customer c){
        bm.readBuildings(c, con);
    }
    
    public void deleteBuilding(int bid){
        bm.deleteBuilding(bid, con);
    }

    public void updateBnameBuilding(int bid, String newbname) {
        bm.updateBnameBuilding(bid, newbname, con);
    }
    
    public void updateSizeBuilding(int bid, String newsize) {
        bm.updateSizeBuilding(bid, newsize, con);
    }        
    
    public void updateRoofBuilding(int bid, String newroof) {
        bm.updateRoofBuilding(bid, newroof, con);
    }      
    
    public void updateExtwallsBuilding(int bid, String newextwalls) {
        bm.updateExtwallsBuilding(bid, newextwalls, con);
    }     
    
    public void updateUsagecommentBuilding(int bid, String newusagecomment) {
        bm.updateUsagecommentBuilding(bid, newusagecomment, con);
    }    
    
    public void updateYearBuilding(int bid, String newyear) {
        bm.updateYearBuilding(bid, newyear, con);
    }   
    
    public void updateCityBuilding(int bid, String newcity) {
        bm.updateCityBuilding(bid, newcity, con);
    }                
    public void updateAddressBuilding(int bid, String newaddress) {
        bm.updateAddressBuilding(bid, newaddress, con);
    }      
    
    public void updateZipBuilding(int bid, String newzip) {
        bm.updateZipBuilding(bid, newzip, con);
    }   

 //////////////////////////////////////////////////////   FLOOR

    public void updateFnameFloor(int fid, String fname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateFpathFloor(int fid, String fpath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    ///////////////////////////////////// ROOM
    public void updateRnameRoom(int rid, String rname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateSizeRoom(int rid, String size) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ////////////////////////////// CUSTOMER
        public void addCustomer(Customer ct){
        System.out.println(ct.toString());
        cs.createCustomer(ct,con);
        
    }
    
    public void readCustomers(Accounts acc){
        cs.readCustomers(acc, con);
    }
    public void updateUsernameCustomer(int cid, String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updatePassCustomer(int cid, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateFNCustomer(int cid, String firstname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateLNCustomer(int cid, String lastname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateMailCustomer(int cid, String mail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateTelCustomer(int cid, String tel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateCityCustomer(int cid, String city) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateZipCustomer(int cid, String zip) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateAddressCustomer(int cid, String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 /////////////////////////////////////////////// ADMIN
    
        public void addAdmin(Admin ad) {
        am.createAdmin(ad, con);
    }

    public void readAdmins(Accounts acc) {
        am.readAdmins(acc, con);
    }
    
    public void updateUsernameAdmin(int aid, String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updatePassAdmin(int aid, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateFNAdmin(int aid, String firstname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateLNAdmin(int aid, String lastname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateMailAdmin(int aid, String mail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateTelAdmin(int aid, String tel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//////////////////////////////////////// BUILDING REPORT
    public void updateBrepnumBReport(int brepid, String brepnum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateBrdateBReport(String brdate, String brepnum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateUsagecBReport(int brepid, String usagec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateExtwallsBReport(int brepid, String extwalls) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateBconManagerBReport(int brepid, String bconmanager) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateGradeBReport(int brepid, String grade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ////////////////////////////////////// ROOM REPORT
    
    public void updateRrepnumRReport(int rrepid, String rrepnum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateRRdateRReport(int rrepid, String rrdate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateDamageRReport(int rrepid, boolean damage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateMoistRReport(int rrepid, boolean rmoist) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateRotRReport(int rrepid, boolean rrot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateMouldRReport(int rrepid, boolean rmould) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateFireRReport(int rrepid, boolean rfire) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateOtherDMGRReport(int rrepid, boolean rother) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateWindoorRReport(int rrepid, String windoor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateMoistScanRReport(int rrepid, String moistscan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateMoistPointRReport(int rrepid, String moistpoint) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateRecommendationRReport(int rrepid, String recommendation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateRConManagerRReport(int rrepid, String rconmanager) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
    

