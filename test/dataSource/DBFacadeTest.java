/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Entity.*;
import dataSource.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mircea
 */
public class DBFacadeTest {
    
    DomainFacade df;
    TestDBConnector dbc;
    DBFacade dbf;
    Accounts acc;
    String username;
    String password;
    String fn;
    String ln;
    String email;
    String tel;
    String city;
    String address;
    String zip;
    int i;
    
    @Before
    public void setUp() {
        
    }



    @Test
    public void testCustomer() {
        Customer ct = new Customer();
        dbf = new DBFacade(dbc.getTestInstance().getTestConnection());
        df = new DomainFacade();
        acc = new Accounts();
        username = "Customerusrn";
        password = "pass";
        fn = "Henrik";
        ln = "Goddag";
        email = "henrik@genericmail.dk";
        tel = "52222222";
        city = "Copenhagenen";
        address = "The strasse";
        zip = "2016";
        df.addCustomer(username, password, fn, ln, email, tel, city, address, zip);
        acc.reinitCustomers();
        df.readCustomers(acc);
        for(i = 0; i< acc.getCustomers().size(); i++);
        ct = acc.getCustomers().get(i-1);
        System.out.println(ct);
        assertTrue(username.equals(ct.getUsername()));
        assertTrue(password.equals(ct.getPassword()));
        assertTrue(fn.equals(ct.getFirstname()));
        assertTrue(ln.equals(ct.getLastname()));
        assertTrue(email.equals(ct.getMail()));
        assertTrue(tel.equals(ct.getTel()));
        assertTrue(city.equals(ct.getCity()));
        assertTrue(address.equals(ct.getAddress()));
        assertTrue(zip.equals(ct.getZip()));
    }
    

    
}
