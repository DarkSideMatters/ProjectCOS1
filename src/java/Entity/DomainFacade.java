package Entity;

import dataSource.*;
//=== hau

public class DomainFacade{

    
    public DBConnector dbc;
    public BuildingMapper bm;
    public AdminMapper am;
    public CustomerMapper cs;
    public FloorMapper f;
    public ReportMapper r;
    public RoomMapper ro;
    public DBFacade dbf;
    
    public DomainFacade()
    {
        dbc = DBConnector.getInstance();
        dbf = DBFacade.getInstance();
    }

    public static DomainFacade getInstance()
    {
         return new DomainFacade();
    }
    
    
    public String checkCFields(String username, String password, String firstname, String lastname, String mail, String tel, String city, String address, String zip){
        String result = new String("The Fields: ");
        if(username.equals(""))
            result += "\n" + "Username";
        if(password.equals(""))
            result += "\n" + "Password";
        if(firstname.equals(""))
            result += "\n" + "Firstname ";
        if(lastname.equals(""))
            result += "\n" + "Lastname ";
        if(mail.equals(""))
            result += "\n" + "E-mail ";
        if(tel.equals(""))
            result += "\n" + "Telephone ";
        if(city.equals(""))
            result += "\n" + "City ";
        if(address.equals(""))
            result += "\n" + "Address ";
        if(zip.equals(""))
            result += "\n" + "Zip ";
        if(result.equals("The Fields: "))
            return null;
        else return result + "\n" + "have not been completed.";
    }
    
    public String checkBFields( String bname, String bcity, String baddress, String bzip, String year, String size){
        String result = new String("The Fields: ");
        if(bname.equals(""))
            result += "\n" + "Building Name";
        if(bcity.equals(""))
            result += "\n" + "City";
        if(baddress.equals(""))
            result += "\n" + "Address";
        if(bzip.equals(""))
            result += "\n" + "Zip";
        if(year.equals(""))
            result += "\n" + "Year";
        if(size.equals(""))
            result += "\n" + "Size";
        if(result.equals("The Fields: "))
            return null;
        else return result + "\n" + "have not been  completed";
    }
    public String checkAFields(String ausrn, String apwd, String afn, String aln, String aemail, String atel) {
        String result = new String("The Fields: ");
        if(ausrn.equals(""))
            result += "\n" + "Username";
        if(apwd.equals(""))
            result += "\n" + "Password";
        if(afn.equals(""))
            result += "\n" + "Firstname ";
        if(aln.equals(""))
            result += "\n" + "Lastname ";
        if(aemail.equals(""))
            result += "\n" + "E-mail ";
        if(atel.equals(""))
            result += "\n" + "Telephone ";
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

    
    public void editFloor(int fid, String fname, String fpath) {
        if(!fname.equals(""))
            dbf.updateFnameFloor(fid,fname);
        if(!fpath.equals(""))
            dbf.updateFpathFloor(fid,fpath);   
    }
    
    public void editRoom(int rid, String rname, String size) {
        if(!rname.equals(""))
            dbf.updateRnameRoom(rid,rname);
        if(!size.equals(""))
            dbf.updateSizeRoom(rid,size);       
    }

    public void editBReport(int brepid, String brepnum, String brdate, String usagec, String extwalls, String bconmanager, String grade){
        if(!brepnum.equals(""))
            dbf.updateBrepnumBReport(brepid,brepnum);
        if(!brdate.equals(""))
            dbf.updateBrdateBReport(brdate,brepnum);
        if(!usagec.equals(""))
            dbf.updateUsagecBReport(brepid,usagec);
        if(!extwalls.equals(""))
            dbf.updateExtwallsBReport(brepid,extwalls);
        if(!bconmanager.equals(""))
            dbf.updateBconManagerBReport(brepid,bconmanager);
        if(!grade.equals(""))
            dbf.updateGradeBReport(brepid,grade);
    }

    public void editRReport(int rrepid, String rrepnum, String rrdate, String roomc, String dmg, String moist, String rot, String mould, String fire, String other, String windoor, String moistscan, String moistpoint, String recommendation, String rconmanager ){
        if(!rrepnum.equals(""))
            dbf.updateRrepnumRReport(rrepid,rrepnum);
        if(!rrdate.equals(""))
            dbf.updateRRdateRReport(rrepid,rrdate);
        
        boolean damage;
        if(dmg.equals("yes")){
                damage=true;
                dbf.updateDamageRReport(rrepid,damage);
        }
        if(dmg.equals("no")){
                damage=false;
                dbf.updateDamageRReport(rrepid,damage);
        }
        boolean rmoist;
        if(moist.equals("yes")){
                rmoist=true;
                dbf.updateMoistRReport(rrepid,rmoist);
        }
        if(moist.equals("no")){
                rmoist=false;
                dbf.updateMoistRReport(rrepid,rmoist);
        }
        boolean rrot;
        if(rot.equals("yes")){
                rrot=true;
                dbf.updateRotRReport(rrepid,rrot);
        }
        if(rot.equals("no")){
                rrot=false;
                dbf.updateRotRReport(rrepid,rrot);
        }
        boolean rmould;
        if(mould.equals("yes")){
                rmould=true;
                dbf.updateMouldRReport(rrepid,rmould);
        }
        if(mould.equals("no")){
                rmould=false;
                dbf.updateMouldRReport(rrepid,rmould);
        }
        boolean rfire;
        if(fire.equals("yes")){
                rfire=true;
                dbf.updateFireRReport(rrepid,rfire);
        }
        if(fire.equals("no")){
                rfire=false;
                dbf.updateFireRReport(rrepid,rfire);
        }
        boolean rother;
        if(other.equals("yes")){
                rother=true;
                dbf.updateOtherDMGRReport(rrepid,rother);
        }
        if(dmg.equals("no")){
                rother=false;
                dbf.updateOtherDMGRReport(rrepid,rother);
        }
        if(!windoor.equals(""))
            dbf.updateWindoorRReport(rrepid,windoor);
        if(!moistscan.equals(""))
            dbf.updateMoistScanRReport(rrepid,moistscan);
        if(!moistpoint.equals(""))
            dbf.updateMoistPointRReport(rrepid,moistpoint);
        if(!recommendation.equals(""))
            dbf.updateRecommendationRReport(rrepid,recommendation);
        if(!rconmanager.equals(""))
            dbf.updateRConManagerRReport(rrepid,rconmanager);
        
        
    }    

    public void addAdmin(String ausrn, String apwd, String afn, String aln, String aemail, String atel) {
        Admin ad = new Admin(ausrn,apwd,afn,aln,aemail,atel);
        dbf.addAdmin(ad);
                
    }
    
    public void readAdmins(Accounts acc) {
        dbf.readAdmins(acc);
    }
    
}
