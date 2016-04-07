/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Entity.Building;
import Entity.Customer;
import Entity.Report;
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
    public void testBuilding() {
        Customer ct = new Customer();
        String name = "Henrik";
        String email = "henrik@genericmail.dk";
        int tel = 52222222;
        String address = "The strasse";
        dbf.addCustomer(name, email, tel, address);
        
        Building bd = new Building();
        String bname = "Kommune";
        String baddress = "Noname Boulevard 64";
        int pno = 2000;
        String size = "Big";
        String cname = "Henrik";
        dbf.addBuilding(bname, baddress, pno, size, cname);
        bd = dbf.getBuilding(bname);
        System.out.println(bd.getName());
        assertTrue(bname.equals(bd.getName()));
        
    }

    @Test
    public void testCustomer() {
        Customer ct = new Customer();
        String name = "Henrik";
        String email = "henrik@genericmail.dk";
        int tel = 52222222;
        String address = "The strasse";
        dbf.addCustomer(name, email, tel, address);
        ct = dbf.getCustomer(name);
        System.out.println(ct.getCuname());
        assertTrue(name.equals(ct.getCuname()));
    }
    
    @Test
    public void testReport() {
        Customer ct = new Customer();
        String cuname = "Henrik";
        String email = "henrik@genericmail.dk";
        int tel = 52222222;
        String address = "The strasse";
        dbf.addCustomer(cuname, email, tel, address);
        
        Building bd = new Building();
        String name = "Kommune";
        String baddress = "Noname Boulevard 64";
        int pno = 2000;
        String size = "Big";
        String cname = "Henrik";
        dbf.addBuilding(name, baddress, pno, size, cname);
        
        Report rp = new Report();
        int reportno = 1;
        String rdate = "today";
        String bname = "Kommune";
        String rcomment = "A very nice building indeed";
        dbf.addReport(reportno, rdate, bname, rcomment);
        rp = dbf.getReport(reportno);
        System.out.println(rp);
        assertTrue(reportno == rp.getReportno());
    }
    
}
