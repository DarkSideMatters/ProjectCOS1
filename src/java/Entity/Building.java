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
    Boolean roof;
    String usagecomment;
    ArrayList<Documents> documents;
    ArrayList<Bimages> bimages;
    ArrayList<Floor> floors;
    ArrayList<Report> reports;
    
    public Building(int cid, int bid, String bname, String city, String address, String zip, String year, String size, Boolean roof, String usagecomment) {
        this.cid = cid;
        this.bid = bid;
        this.bname = bname;
        this.city = city;
        this.address = address;
        this.zip = zip;
        this.year = year;
        this.size = size;
        this.roof = roof;
        this.usagecomment = usagecomment;
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

    public Boolean getRoof() {
        return roof;
    }

    public void setRoof(Boolean roof) {
        this.roof = roof;
    }

    public String getUsagecomment() {
        return usagecomment;
    }

    public void setUsagecomment(String usagecomment) {
        this.usagecomment = usagecomment;
    }

    public ArrayList<Documents> getDocuments() {
        return documents;
    }

    public void addDocuments(Documents document) {
        documents.add(document);
    }

    public ArrayList<Bimages> getBimages() {
        return bimages;
    }

    public void addBimages(Bimages bimage) {
        bimages.add(bimage);
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public void addFloors(Floor Floor) {
        floors.add(Floor);
    }

    public ArrayList<Report> getReports() {
        return reports;
    }

    public void addReports(Report report) {
        reports.add(report);
    }

    @Override
    public String toString() {
        return "Building{" + "cid=" + cid + ", bid=" + bid + ", bname=" + bname + ", city=" + city + ", address=" + address + ", zip=" + zip + ", year=" + year + ", size=" + size + ", roof=" + roof + ", usagecomment=" + usagecomment + ", documents=" + documents + ", bimages=" + bimages + ", floors=" + floors + ", reports=" + reports + '}';
    }

    
}