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
public class Documents {
    int did;
    int bid;
    String dpath;

    public Documents(int did, int bid, String dpath) {
        this.did = did;
        this.bid = bid;
        this.dpath = dpath;
    }

    public Documents() {
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getDpath() {
        return dpath;
    }

    public void setDpath(String dpath) {
        this.dpath = dpath;
    }
    
    @Override
    public String toString() {
        return "Documents{" + "did=" + did + ", bid=" + bid + ", dpath=" + dpath + '}';
    }
}
