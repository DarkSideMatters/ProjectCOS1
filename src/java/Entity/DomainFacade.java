package Entity;

import java.util.ArrayList;
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
    
    public void addBuilding(String name, String address, int pno, String size){
        dbf.addBuilding(name,address,pno,size);
    }
}