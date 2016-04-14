/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import Entity.Building;
import Entity.Customer;
import Entity.Report;

/**
 *
 * @author Mircea
 */
public class Tester {
    public static void main(String[] args) {
    DBFacade dbf = new DBFacade(TestDBConnector.getTestInstance().getTestConnection());
        Building bd = new Building();
        String name = "The Building";
        String address = "The strasse";
        int pno = 52222222;
        String size = "big";
        String cname = "Henrik";
        System.out.println(bd);
    }
        
}
