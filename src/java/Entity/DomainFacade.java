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

    

    public void addAdmin(String ausrn, String apwd, String afn, String aln, String aemail, String atel) {
        Admin ad = new Admin(ausrn,apwd,afn,aln,aemail,atel);
        dbf.addAdmin(ad);
                
    }

    public void readAdmins(Accounts acc) {
        dbf.readAdmins(acc);
    }
    
}
