package Entity;

import dataSource.*;
//=== hau

public class DomainFacade{

    
    public DBFacade dbf;
    
    public DomainFacade()
    {
        dbf = DBFacade.getInstance();
    }

    public static DomainFacade getInstance()
    {
         return new DomainFacade();
    }
    
    
    public String checkCFields(String username, String password, String firstname, String lastname, String mail, String tel, String city, String address, String zip){
        String result = new String("The Fields: ");
        if(username.equals(""))
            result += "\n" + " Username ";
        if(password.equals(""))
            result += "\n" + " Password ";
        if(firstname.equals(""))
            result += "\n" + " Firstname ";
        if(lastname.equals(""))
            result += "\n" + " Lastname ";
        if(mail.equals(""))
            result += "\n" + " E-mail ";
        if(tel.equals(""))
            result += "\n" + " Telephone ";
        if(city.equals(""))
            result += "\n" + " City ";
        if(address.equals(""))
            result += "\n" + " Address ";
        if(zip.equals(""))
            result += "\n" + " Zip ";
        if(result.equals("The Fields: "))
            return null;
        else return result + "\n" + "have not been completed.";
    }
    
    public String checkBFields( String bname, String bcity, String baddress, String bzip, String year, String size){
        String result = new String("The Fields: ");
        if(bname.equals(""))
            result += "\n" + " Building Name ";
        if(bcity.equals(""))
            result += "\n" + " City ";
        if(baddress.equals(""))
            result += "\n" + " Address ";
        if(bzip.equals(""))
            result += "\n" + " Zip ";
        if(year.equals(""))
            result += "\n" + " Year ";
        if(size.equals(""))
            result += "\n" + " Size ";
        if(result.equals("The Fields: "))
            return null;
        else return result + "\n" + "have not been  completed";
    }
    public String checkAFields(String ausrn, String apwd, String afn, String aln, String aemail, String atel) {
        String result = new String("The Fields: ");
        if(ausrn.equals(""))
            result += "\n" + " Username ";
        if(apwd.equals(""))
            result += "\n" + " Password ";
        if(afn.equals(""))
            result += "\n" + " Firstname ";
        if(aln.equals(""))
            result += "\n" + " Lastname ";
        if(aemail.equals(""))
            result += "\n" + " E-mail ";
        if(atel.equals(""))
            result += "\n" + " Telephone ";
        if(result.equals("The Fields: "))
            return null;
        else return result + "\n" + "have not been completed.";
    }
    
    public String checkBRFields(String date, String usgcom, String roofcom, String extwallscom, String conmng, String grade){
        String result = new String("The Fields: ");
        if(date.equals(""))
            result += "\n" + " Date ";
        if(usgcom.equals(""))
            result += "\n" + " Usage Comment ";
        if(roofcom.equals(""))
            result += "\n" + " Roof Comment ";
        if(extwallscom.equals(""))
            result += "\n" + " External Walls Comment ";
        if(conmng.equals(""))
            result += "\n" + " Constructor Manager ";
        if(grade.equals(""))
            result += "\n" + " Grade ";
        if(result.equals("The Fields: "))
            return null;
        else return result + "\n" + "have not been completed.";
    }
    
    public String checkRFields(String rname, String rsize){
        String result = new String("The Fields: ");
        if(rname.equals(""))
            result += "\n" + " Room Name ";
        if(rsize.equals(""))
            result += "\n" + " Room Size ";
        if(result.equals("The Fields: "))
            return null;
        else return result + "\n" + "have not been completed.";
    }
    
    public String checkRRFields(String rrepdate,String rcomm,boolean dmg,boolean moist,boolean rot,boolean  mold,boolean fire,boolean other,String dmgcom,String wallscom,String ceilingcom,String floorcom,String windoorcom,boolean moistscan,String moistpoint,String recom,String rconmng){
        String result = new String("The Fields: ");
        if(rrepdate.equals(""))
            result += "\n" + " Report Date ";
        if(moistscan)
            if(moistpoint.equals(""))
                result += "\n" + " Moisture Point";
        if(recom.equals(""))
            result += "\n" + "Recommandations";
        if(rconmng.equals(""))
            result += "\n" + "Construction Manager";
        if(result.equals("The Fields: "))
            return null;
        else return result + "\n" + "have not been completed.";
    }
    
    public void addCustomer(String username, String password, String firstname, String lastname, String mail, String tel, String city, String address, String zip){
        Customer ct = new Customer( username, password, firstname, lastname, mail, tel, city, address, zip);
        dbf.addCustomer(ct);
    }
    
    public void readCustomers(Accounts acc){
        dbf.readCustomers(acc);
    }
    
    public void deleteCustomer(int cid){
        dbf.deleteCustomer(cid);
    }
    
    public void addBuilding(int cid, String bname, String bcity, String baddress, String bzip, String year, String size){
        Building bd = new Building (cid,bname,bcity,baddress,bzip,year,size);
        dbf.addBuilding(bd);
    }
    
    public void readBuildings(Customer c){
        dbf.readBuildings(c);
    }
    
    public void deleteBuilding(int bid){
        dbf.deleteBuilding(bid);
    }
    
    public void addAdmin(String ausrn, String apwd, String afn, String aln, String aemail, String atel) {
        Admin ad = new Admin(ausrn,apwd,afn,aln,aemail,atel);
        dbf.addAdmin(ad);
                
    }
    
    public void readAdmins(Accounts acc) {
        dbf.readAdmins(acc);
    }
    
    public void deleteAdmin(int aid){
        dbf.deleteAdmin(aid);
    }
    
    public void addBReport(int bid, String date, String usgcom, String roofcom, String extwallscom, String pemployee, String conmng, String grade){
        BReport br = new BReport(bid,date,usgcom,roofcom,extwallscom,pemployee,conmng,grade);
        dbf.addBReport(br);
    }
    
    public void readBReports(Building b){
        dbf.readBReports(b);
    }
    
    public void deleteBReport(int brepid){
        dbf.deleteBReport(brepid);
    }
    
    public void addFloor(int bid, String fname){
        Floor f = new Floor(bid,fname);
        dbf.addFloor(f);
    }
    
    public void readFloors(Building b){
        dbf.readFloors(b);
    }
    
    public void deleteFloor(int fid){
        dbf.deleteFloor(fid);
    }
    
    public void addRoom(int fid, String rname, String rsize){
        Room r = new Room(fid,rname,rsize);
        dbf.addRoom(r);
    }
    
    public void readRooms(Floor f){
        dbf.readRooms(f);
    }
    
    public void deleteRoom(int rid){
        dbf.deleteRoom(rid);
    }
    
    public void addRReport(int rid,String rrepdate,String rcomm,boolean dmg,boolean moist,boolean rot,boolean  mold,boolean fire,boolean other,
            String dmgcom,String wallscom,String ceilingcom,String floorcom,
            String windoorcom,boolean moistscan,String moistpoint,String recom,String rconmng){
        
        RReport rrep = new RReport(rid,rrepdate,rcomm,dmg,moist,rot,mold,fire,other,dmgcom,wallscom,ceilingcom,floorcom,windoorcom,moistscan,moistpoint,recom,rconmng);
        
        dbf.addRReport(rrep);
    }
    
    public void readRReports(Room r){
        dbf.readRReport(r);
    }
    
    public void deleteRReport(int rrepid){
        dbf.deleteRReport(rrepid);
    }
    
    public void editAdmin(int aid, String username, String password, String firstname, String lastname, String mail, String tel) {
        if(!username.equals(""))
            dbf.updateUsernameAdmin(aid,username);
        if(!password.equals(""))
            dbf.updatePassAdmin(aid,password);
        if(!firstname.equals(""))
            dbf.updateFNAdmin(aid,firstname);
        if(!lastname.equals(""))
            dbf.updateLNAdmin(aid,lastname);
        if(!mail.equals(""))
            dbf.updateMailAdmin(aid,mail);
        if(!tel.equals(""))
            dbf.updateTelAdmin(aid,tel);
            }
    
    public void editCustomer(int cid, String username, String password, String firstname, String lastname, String mail, String tel, String city, String address, String zip) {
        if(!username.equals(""))
            dbf.updateUsernameCustomer(cid,username);
        if(!password.equals(""))
            dbf.updatePassCustomer(cid,password);
        if(!firstname.equals(""))
            dbf.updateFNCustomer(cid,firstname);
        if(!lastname.equals(""))
            dbf.updateLNCustomer(cid,lastname);
        if(!mail.equals(""))
            dbf.updateMailCustomer(cid,mail);
        if(!tel.equals(""))
            dbf.updateTelCustomer(cid,tel);
        if(!city.equals(""))
            dbf.updateCityCustomer(cid,city);
        if(!address.equals(""))
            dbf.updateAddressCustomer(cid,address);
        if(!zip.equals(""))
            dbf.updateZipCustomer(cid, zip);
            
    }    
    public void editBuilding(int bid, String bname, String bcity, String baddress, String bzip, String year, String size) {
        if(!bname.equals(""))
            dbf.updateBnameBuilding(bid,bname);
        if(!bcity.equals(""))
            dbf.updateCityBuilding(bid,bcity);
        if(!baddress.equals(""))
            dbf.updateAddressBuilding(bid,baddress);
        if(!bzip.equals(""))
            dbf.updateZipBuilding(bid,bzip);
        if(!year.equals(""))
            dbf.updateYearBuilding(bid,year);
        if(!size.equals(""))
            dbf.updateSizeBuilding(bid,size);
    }
    
    public void editFloor(int fid, String fname) {
        if(!fname.equals(""))
            dbf.updateFnameFloor(fid,fname);
    }
    
    public void editRoom(int rid, String rname, String size) {
        if(!rname.equals(""))
            dbf.updateRnameRoom(rid,rname);
        if(!size.equals(""))
            dbf.updateSizeRoom(rid,size);       
    }

    public void editBReport(int brepid, String brdate, String usagec, String roofc, String extwalls, String pemployee,String bconmanager, String grade){
        if(!brdate.equals(""))
            dbf.updateBrdateBReport(brepid,brdate);
        if(!usagec.equals(""))
            dbf.updateUsagecBReport(brepid,usagec);
        if(!roofc.equals(""))
            dbf.updateRoofBReport(brepid, roofc);
        if(!extwalls.equals(""))
            dbf.updateExtwallsBReport(brepid,extwalls);
        if(!pemployee.equals(""))
            dbf.updatePemployeeBReport(brepid,pemployee);
        if(!bconmanager.equals(""))
            dbf.updateBconManagerBReport(brepid,bconmanager);
        if(grade==null)
            dbf.updateGradeBReport(brepid,grade);
    }

    public void editRReport(int rrepid, String rrdate, String roomc, boolean dmg, boolean moist, boolean rot, boolean mold, boolean fire, boolean other, String dmgcom, String wallscom, String ceilingcom, String floorcom, String windoorcom, boolean moistscan, String moistpoint, String recommendation, String rconmanager ){
        if(!rrdate.equals(""))
            dbf.updateRRdateRReport(rrepid,rrdate);
        if(!roomc.equals(""))
            dbf.updateRoomComReport(rrepid,roomc);
        if(dmg)
                dbf.updateDamageRReport(rrepid,dmg);
        else
                dbf.updateDamageRReport(rrepid,dmg);
        if(moist)
                dbf.updateMoistRReport(rrepid,moist);
        else
                dbf.updateMoistRReport(rrepid,moist);
        if(rot)
                dbf.updateRotRReport(rrepid,rot);
        else
                dbf.updateRotRReport(rrepid,rot);
        if(mold)
                dbf.updateMoldRReport(rrepid,mold);
        else
                dbf.updateMoldRReport(rrepid,mold);
        if(fire)
                dbf.updateFireRReport(rrepid,fire);
        else
                dbf.updateFireRReport(rrepid,fire);
        if(other)
                dbf.updateOtherDMGRReport(rrepid,other);
        else
                dbf.updateOtherDMGRReport(rrepid,other);
        if(!dmgcom.equals(""))
            dbf.updateDmgComRReport(rrepid,dmgcom);
        if(!wallscom.equals(""))
            dbf.updateWallsComRReport(rrepid, wallscom);
        if(!ceilingcom.equals(""))
            dbf.updateCeilingComRReport(rrepid,ceilingcom);
        if(!floorcom.equals(""))
            dbf.updateFloorComRReport(rrepid,floorcom);
        if(!windoorcom.equals(""))
            dbf.updateWindoorRReport(rrepid,windoorcom);
        if(moistscan)
            dbf.updateMoistScanRReport(rrepid,moistscan);
        else
            dbf.updateMoistScanRReport(rrepid,moistscan);
        if(!moistpoint.equals(""))
            dbf.updateMoistPointRReport(rrepid,moistpoint);
        if(!recommendation.equals(""))
            dbf.updateRecommendationRReport(rrepid,recommendation);
        if(!rconmanager.equals(""))
            dbf.updateRConManagerRReport(rrepid,rconmanager);
    }    

    
}
