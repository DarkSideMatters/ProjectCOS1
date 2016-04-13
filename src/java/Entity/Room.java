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
public class Room {
    int rid;
    int fid;
    String rname;
    Boolean dam;
    ArrayList<Rimages> Rimages;

    public Room(int rid, int fid, String rname, boolean dam) {
        this.rid = rid;
        this.fid = fid;
        this.rname = rname;
        this.dam = dam;
    }

    public Room() {
    }
    
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Boolean getDam() {
        return dam;
    }

    public void setDam(Boolean dam) {
        this.dam = dam;
    }

    public ArrayList<Rimages> getRimages() {
        return Rimages;
    }

    public void addRimages(Rimages Rimage) {
        Rimages.add(Rimage);
    }
    
    @Override
    public String toString() {
        return "Room{" + "rid=" + rid + ", fid=" + fid + ", rname=" + rname + "dam=" + dam + ", Rimages=" + Rimages + '}';
    }
}
