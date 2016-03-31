package Entity;

import java.util.ArrayList;
import dataSource.*;
//=== hau

public class DomainFacade
{

    
    private DBFacade dbf;

    private DomainFacade()
    {
        
        dbf = DBFacade.getInstance();
    }

    public static DomainFacade getInstance()
    {
         return new DomainFacade();
    }
}