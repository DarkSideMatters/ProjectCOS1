/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Entity.Accounts;
import Entity.Building;
import Entity.Customer;
import Entity.Report;
import java.util.ArrayList;

/**
 *
 * @author Mircea
 */
public class Tester {
    public static void main(String[] args) {
    CustomerMapper cm = new CustomerMapper();    
        
    DBConnector dbc;
    dbc = DBConnector.getInstance();
    
    Accounts acc = new Accounts();
    
    cm.readCustomers(acc, dbc.getConnection());
    }
        
}
