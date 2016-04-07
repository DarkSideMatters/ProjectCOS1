package Entity;

import java.util.ArrayList;
import dataSource.*;
import java.sql.SQLException;
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
    
    public void addBuilding(String name, String address, int pno, String size,String cname){
        dbf.addBuilding(name,address,pno,size,cname);
    }

    public void addCustomer(String cuname, String email, int telephone, String caddress) {
        dbf.addCustomer(cuname,email,telephone,caddress);
    }

    public void addReport(int reportno, String rdate, String bname, String rcomment) {
        dbf.addReport(reportno,rdate,bname,rcomment);
    }
}