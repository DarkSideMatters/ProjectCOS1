/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author Mircea
 */
public class Building {
    
    int cid;
    int bid;
    String bname;
    String city;
    String address;
    String zip;   
    String year;
    String size;
    ArrayList<Floor> floors = new ArrayList<>();
    ArrayList<BReport> reports = new ArrayList<>();
    
    public Building(int cid, int bid, String bname, String city, String address, String zip, String year, String size) {
        this.cid = cid;
        this.bid = bid;
        this.bname = bname;
        this.city = city;
        this.address = address;
        this.zip = zip;
        this.year = year;
        this.size = size;
    }
    
    public Building( String bname, String city, String address, String zip, String year, String size) {
        this.bname = bname;
        this.city = city;
        this.address = address;
        this.zip = zip;
        this.year = year;
        this.size = size;
    }
    
    public Building( int cid,String bname, String city, String address, String zip, String year, String size) {
        this.cid = cid;
        this.bname = bname;
        this.city = city;
        this.address = address;
        this.zip = zip;
        this.year = year;
        this.size = size;
    }

    public Building() {
    }

    
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public void addFloor(Floor Floor) {
        floors.add(Floor);
    }

    public ArrayList<BReport> getReports() {
        return reports;
    }

    public void addReport(BReport report) {
        reports.add(report);
    }
    
    public void reinitFloors(){
        floors = new ArrayList<>();
    }
    
    public void reinitReports(){
        reports = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Building{" + "cid=" + cid + ", bid=" + bid + ", bname=" + bname + ", city=" + city + ", address=" + address + ", zip=" + zip + ", year=" + year + ", size=" + size +  '}';
    }

    
}