/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Entity.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Plamen
 */
public class DBFacade {

    public static DBFacade getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private DataMapper dm; 
    private Connection con;
    
    private static DBFacade instance;
    
    private DBFacade(){
                  dm = new DataMapper();
		  con 	= DBConnector.getInstance().getConnection();
                  DBFacade facade = new DBFacade();
    }
    
   private void addBuilding(Building building){
    }
}
    

