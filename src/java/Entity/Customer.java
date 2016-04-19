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
public class Customer {
    int cid;
    String username;
    String password;
    String firstname;
    String lastname;
    String mail;
    String tel;
    String city;
    String address;
    String zip;
    ArrayList<Building> buildings = new ArrayList<>();

    public Customer( String username, String password, String firstname, String lastname, String mail, String tel, String city, String address, String zip) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mail = mail;
        this.tel = tel;
        this.city = city;
        this.address = address;
        this.zip = zip;
    }
    
    public Customer( int cid, String username, String password, String firstname, String lastname, String mail, String tel, String city, String address, String zip) {
        this.cid = cid;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mail = mail;
        this.tel = tel;
        this.city = city;
        this.address = address;
        this.zip = zip;
    }

    public Customer() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void add(Building building) {
        buildings.add(building);
    }

    @Override
    public String toString() {
        return "Customer{" + "cid=" + cid + ", username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname=" + lastname + ", mail=" + mail + ", tel=" + tel + ", city=" + city + ", address=" + address + ", zip=" + zip + '}';
    }

    
}
