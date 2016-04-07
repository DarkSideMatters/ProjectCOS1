/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Entity.Customer;

/**
 *
 * @author Mircea
 */
public class Tester {
    public static void main(String[] args) {
    DBFacade dbf = new DBFacade(TestDBConnector.getTestInstance().getTestConnection());
        Customer ct = new Customer();
        String name = "Henrik";
        String email = "henrik@genericmail.dk";
        String tel = "52222222";
        String address = "The strasse";
        dbf.addCustomer(name, email, tel, address);
        ct = dbf.getCustomer(name);
        System.out.println(ct);
    }
        
}
