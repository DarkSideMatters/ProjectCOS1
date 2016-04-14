package Entity;

import dataSource.*;
//=== hau

public class DomainFacade{

    
    public DBConnector dbc;
    public BuildingMapper bm;
    public AdminMapper am;
    public CustomerMapper cs;
    public DamageMapper dmg;
    public FloorMapper f;
    public ReportMapper r;
    public RoomMapper ro;

    public DomainFacade()
    {
    }

    public static DomainFacade getInstance()
    {
         return new DomainFacade();
    }
    
/////////////////////////////    
    
    public void addBuilding(int cid, int bid,String bname,String city,String address,String zip,String year,String size,boolean roof,String extwalls,String usagecomment){
        Building bd = new Building(cid,bid,bname,city,address,zip,year,size,roof,extwalls,usagecomment);
        bm.createBuilding(bd,dbc.getInstance().getConnection());
    }
    
/////////////////////////////    
    
    public void addAdmin(int aid, String username, String password, String firstname, String lastname, String mail, String tel){
        Admin ad = new Admin(aid,username,password,firstname,lastname,mail,tel);
        am.createAdmin(ad,dbc.getInstance().getConnection());
    }
    
////////////////////////////
    
    public void addCustomer(int cid, String username, String password, String firstname, String lastname, String mail, String tel, String city, String address, String zip){
        Customer ct = new Customer(cid, username, password, firstname, lastname, mail, tel, city, address, zip);
        cs.createCustomer(ct,dbc.getInstance().getConnection());
    }
    
////////////////////////////
    
    public void addDamage(int damid, int rid, String descr, String dtype, Boolean moisture, String moisturepoint, String walls, String ceiling, String floor, String windoor, String recommendation){
        Damage dg = new Damage(damid,rid,descr,dtype,moisture,moisturepoint,walls,ceiling,floor,windoor,recommendation);
        dmg.createDamage(dg,dbc.getInstance().getConnection());
    }

///////////////////////////
    
    public void addFloor(int fid, int bid, String fname, String fppath){
        Floor fl= new Floor(fid,bid,fname,fppath);
        f.createFloor(fl,dbc.getInstance().getConnection());
    }
    
///////////////////////////
    
    public void addReport(int repid, int bid, String repnum, String rdate, int damid, String conmanager, String grade){
        Report rt= new Report(repid,bid,repnum,rdate,damid,conmanager,grade);
        r.createReport(rt,dbc.getInstance().getConnection());
    }

///////////////////////////
    
    public void addRoom(int rid, int fid, String rname, boolean dam){
        Room rm= new Room(rid,fid,rname,dam);
        ro.createRoom(rm,dbc.getInstance().getConnection());
    }
    
///////////////////////////
}
