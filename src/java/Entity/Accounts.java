/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author Berkant
 */
public class Accounts {
    ArrayList<Admin> admins;
    ArrayList<Customer> customers;

    public Accounts() {
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void addAdmins(Admin admin) {
        admins.add(admin);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomers(Customer customer) {
        customers.add(customer);
    }

    @Override
    public String toString() {
        return "Accounts{" + "admins=" + admins + ", customers=" + customers + '}';
    }
    
    
}
