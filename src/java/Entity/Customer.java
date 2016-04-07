/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Mircea
 */
public class Customer {
    String cname;
    String email;
    String telephone;
    String caddress;

    public Customer(String cname, String email, String telephone, String caddress) {
        this.cname = cname;
        this.email = email;
        this.telephone = telephone;
        this.caddress = caddress;
    }

    public Customer() {
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    @Override
    public String toString() {
        return "Customer{" + "cname=" + cname + ", email=" + email + ", telephone=" + telephone + ", caddress=" + caddress + '}';
    }
    
    
}
