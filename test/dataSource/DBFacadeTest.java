/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Entity.Building;
import Entity.Customer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mircea
 */
public class DBFacadeTest {
    
    DBFacade dbf;
    
    @Before
    public void setUp() {
        dbf = new DBFacade(TestDBConnector.getTestInstance().getTestConnection());
    }

    @Test
    public void testAddBuilding() {
        Building bd = new Building();
        String bname = "Kommune";
        String baddress = "Noname Boulevard 64";
        int pno = 2000;
        String size = "Big";
        dbf.addBuilding(bname, baddress, pno, size);
        bd = dbf.getBuilding(bname);
        System.out.println(bd.getName());
        assertTrue(bname.equals(bd.getName()));
        
    }

    @Test
    public void testAddCustomer() {
        Customer ct = new Customer();
        String name = "Henrik";
        String email = "henrik@genericmail.dk";
        String tel = "52222222";
        String address = "The strasse";
        dbf.addCustomer(name, email, tel, address);
        ct = dbf.getCustomer(name);
        System.out.println(ct.getCname());
        assertTrue(name.equals(ct.getCname()));
    }
    
}
