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
    ArrayList<Admin> admins = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();

    public Accounts() {
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void addAdmin(Admin admin) {
        admins.add(admin);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    public void reinitCustomers(){
        customers = new ArrayList<>();
    }
    
    public void reinitAdmins(){
        admins = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Accounts{" + "admins=" + admins + ", customers=" + customers + '}';
    }
    
    
}
