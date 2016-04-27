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
import java.sql.ResultSet;

/**
 *
 * @author Plamen
 */
public class DBFacade {
    public CustomerMapper cs;
    public BuildingMapper bm;
    public AdminMapper am;
    public BReportMapper brm;
    public FloorMapper fm;
    public RoomMapper rm;
    public DBConnector dbc;
    
    
    
    public DBFacade(){
            con = dbc.getInstance().getConnection();  //DBConnector.getInstance().getConnection();
            cs = new CustomerMapper();
            bm = new BuildingMapper();
            am = new AdminMapper();
            brm = new BReportMapper();
            fm = new FloorMapper();
            rm = new RoomMapper();
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

    public void addFloor(Floor f){
        fm.createFloor(f,con);
    }
    
    public void readFloors(Building b){
        fm.readFloors(b, con);
    }
    
    public void updateFnameFloor(int fid, String fname) {
        fm.updateFnameDamage(fid, fname, con);
    }
    
    public void deleteFloor(int fid){
        fm.deleteFloor(fid, con);
    }

    ///////////////////////////////////// ROOM
    
    public void addRoom(Room r){
        rm.createRoom(r, con);
    }
    
    public void updateRnameRoom(int rid, String rname) {
        rm.updateRnameRoom(rid, rname, con);
    }

    public void updateSizeRoom(int rid, String size) {
        rm.updateSizeRoom(rid, size, con);
    }
    
    public void deleteRoom(int rid){
        rm.deleteRoom(rid, con);
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
        cs.updateUsrnCustomer(cid, username, con);
    }

    public void updatePassCustomer(int cid, String password) {
        cs.updatePwdCustomer(cid, password, con);
    }

    public void updateFNCustomer(int cid, String firstname) {
        cs.updateFNCustomer(cid, firstname, con);
    }

    public void updateLNCustomer(int cid, String lastname) {
        cs.updateLNCustomer(cid, lastname, con);
    }

    public void updateMailCustomer(int cid, String mail) {
        cs.updateMailCustomer(cid, mail, con);
    }

    public void updateTelCustomer(int cid, String tel) {
        cs.updateTelCustomer(cid, tel, con);
    }

    public void updateCityCustomer(int cid, String city) {
        cs.updateCityCustomer(cid, city, con);
    }

    public void updateZipCustomer(int cid, String zip) {
        cs.updateZipCustomer(cid, zip, con);
    }

    public void updateAddressCustomer(int cid, String address) {
        cs.updateAddressCustomer(cid, address, con);
    }
    
    public void deleteCustomer(int cid){
        cs.deleteCustomer(cid, con);
    }
 /////////////////////////////////////////////// ADMIN
    
    public void addAdmin(Admin ad) {
        am.createAdmin(ad, con);
    }

    public void readAdmins(Accounts acc) {
        am.readAdmins(acc, con);
    }
    
    public void updateUsernameAdmin(int aid, String username) {
        am.updateUsrnAdmin(aid, username, con);
    }

    public void updatePassAdmin(int aid, String password) {
        am.updatePwdAdmin(aid, password, con);
    }

    public void updateFNAdmin(int aid, String firstname) {
        am.updateFNAdmin(aid, firstname, con);
    }

    public void updateLNAdmin(int aid, String lastname) {
        am.updateLNAdmin(aid, lastname, con);
    }

    public void updateMailAdmin(int aid, String mail) {
        am.updateMailAdmin(aid, mail, con);
    }

    public void updateTelAdmin(int aid, String tel) {
        am.updateTelAdmin(aid, tel, con);
    }
    
    public void deleteAdmin(int aid){
        am.deleteAdmin(aid, con);
    }
//////////////////////////////////////// BUILDING REPORT
    
    public void addBReport(BReport br){
        brm.createBReport(br, con);
    }
    
    public void readBReports(Building b){
        brm.readBReports(b, con);
    }
    
    public void deleteBReport(int brepid){
        brm.deleteBReport(brepid, con);
    }
    
    public void updateBrdateBReport(int brepid, String brdate) {
        brm.updateBrdateReport(brepid, brdate, con);
    }

    public void updateUsagecBReport(int brepid, String usagec) {
        brm.updateUsagecommentReport(brepid, usagec, con);
    }
    
    public void updateRoofBReport(int brepid, String roofc) {
        brm.updateRoofcommentReport(brepid, roofc, con);
    }

    public void updateExtwallsBReport(int brepid, String extwalls) {
        brm.updateExtwallscommentReport(brepid, extwalls, con);
    }

    public void updatePemployeeBReport(int brepid, String pemployee){
        brm.updatePemployeeReport(brepid, pemployee, con);
    }
    
    public void updateBconManagerBReport(int brepid, String bconmanager) {
        brm.updateBconmanagerReport(brepid, bconmanager, con);
    }

    public void updateGradeBReport(int brepid, String grade) {
        brm.updateGradeReport(brepid, grade, con);
    }

    ////////////////////////////////////// ROOM REPORT
    
    public void updateRrepnumRReport(int rrepid, String rrepnum) {
        
    }

    public void updateRRdateRReport(int rrepid, String rrdate) {
        
    }

    public void updateDamageRReport(int rrepid, boolean damage) {
        
    }

    public void updateMoistRReport(int rrepid, boolean rmoist) {
        
    }

    public void updateRotRReport(int rrepid, boolean rrot) {
        
    }

    public void updateMouldRReport(int rrepid, boolean rmould) {
        
    }

    public void updateFireRReport(int rrepid, boolean rfire) {
        
    }

    public void updateOtherDMGRReport(int rrepid, boolean rother) {
        
    }

    public void updateWindoorRReport(int rrepid, String windoor) {
        
    }

    public void updateMoistScanRReport(int rrepid, String moistscan) {
        
    }

    public void updateMoistPointRReport(int rrepid, String moistpoint) {
        
    }

    public void updateRecommendationRReport(int rrepid, String recommendation) {
        
    }

    public void updateRConManagerRReport(int rrepid, String rconmanager) {
        
    }
    

}
    

