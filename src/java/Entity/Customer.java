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
    String cuname;
    String email;
    int telephone;
    String caddress;

    public Customer(String cuname, String email, int telephone, String caddress) {
        this.cuname = cuname;
        this.email = email;
        this.telephone = telephone;
        this.caddress = caddress;
    }

    public Customer() {
    }

    public String getCuname() {
        return cuname;
    }

    public void setCuname(String cuname) {
        this.cuname = cuname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
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
        return "Customer{" + "cuname=" + cuname + ", email=" + email + ", telephone=" + telephone + ", caddress=" + caddress + '}';
    }
    
    
}
