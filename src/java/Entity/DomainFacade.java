package Entity;

import java.util.ArrayList;
import dataSource.*;
import java.sql.SQLException;
//=== hau

public class DomainFacade{

    
    public DBConnector dbc;
    public BuildingMapper bm;

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
    
}