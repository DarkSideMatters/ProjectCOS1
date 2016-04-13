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
public class Rimages {
    int riid;
    int rid;
    String ripath;

    public Rimages(int riid, int rid, String ripath) {
        this.riid = riid;
        this.rid = rid;
        this.ripath = ripath;
    }

    public Rimages() {
    }

    public int getRiid() {
        return riid;
    }

    public void setRiid(int riid) {
        this.riid = riid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRipath() {
        return ripath;
    }

    public void setRipath(String ripath) {
        this.ripath = ripath;
    }
    
    @Override
    public String toString() {
        return "RepImages{" + "riid=" + riid + ", rid=" + rid + ", ripath=" + ripath + '}';
    }
}
