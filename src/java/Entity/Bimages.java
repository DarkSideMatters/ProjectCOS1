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
public class Bimages {
    int biid;
    int bid;
    String bipath;

    public Bimages(int biid, int bid, String bipath) {
        this.biid = biid;
        this.bid = bid;
        this.bipath = bipath;
    }
    public Bimages() {
    }
    
    public int getBiid() {
        return biid;
    }

    public void setBiid(int biid) {
        this.biid = biid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBipath() {
        return bipath;
    }

    public void setBipath(String bipath) {
        this.bipath = bipath;
    }
    
    @Override
    public String toString() {
        return "Bimages{" + "biid=" + biid + ", bid=" + bid + ", bipath=" + bipath + '}';
    }
    
}
