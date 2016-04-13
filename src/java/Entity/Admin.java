/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Berkant
 */
public class Admin {
    int aid;
    String username;
    String password;
    String firstname;
    String lastname;
    String mail;
    String tel;
    
    public Admin(int aid, String username, String password, String firstname, String lastname, String mail, String tel) {
        this.aid = aid;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mail = mail;
        this.tel = tel;
        
    }

    public Admin() {
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    @Override
    public String toString() {
        return "Admin{" + "aid=" + aid + ", username=" + username + ", password=" + password + ", firstname=" + firstname + ", lsatname=" + lastname + ", mail=" + mail + ", tel=" + tel + '}';
    }
    
    
}

