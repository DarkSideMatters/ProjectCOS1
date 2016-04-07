/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mircea
 */
public class TestDBConnector {
    
    private static String driver = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/testpolygon";
    private static String id = "root";			
    private static String pw = "Conciousn3ss";
    
    private Connection con;

    //-- Singleton ---- 
    private static TestDBConnector instance;
    private TestDBConnector()
    {
        try
        {
            Class.forName(driver);
            con = DriverManager.getConnection(URL, id, pw);   // The connection will be released upon program 
		  					      // termination	
        } catch (Exception e)
        {
            System.out.println("\n*** Remember to insert your Oracle ID and PW in the DBConnector class! ***\n");
            System.out.println("error in DBConnector.getConnection()");
            System.out.println(e);
        }
    }
    
    public static TestDBConnector getTestInstance()
    {
        if (instance == null)
            instance = new TestDBConnector();
        return instance;
    }
    //------------------
    
    public Connection getTestConnection()
    {
      return con;
    }
}
