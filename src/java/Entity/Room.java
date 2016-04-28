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
    String rsize;
    ArrayList<RReport> reports = new ArrayList<>();

    public Room(int rid, int fid, String rname, String rsize) {
        this.rid = rid;
        this.fid = fid;
        this.rname = rname;
        this.rsize = rsize;
    }
    
    public Room(int fid, String rname, String rsize) {
        this.fid = fid;
        this.rname = rname;
        this.rsize = rsize;
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
    
    public String getRsize() {
        return rsize;
    }

    public void setRsize(String rsize) {
        this.rsize = rsize;
    }

    public ArrayList<RReport> getReports() {
        return reports;
    }

    public void setReports(ArrayList<RReport> reports) {
        this.reports = reports;
    }

    public void reinitReports(){
        reports = new ArrayList<>();
    }
    
    public void addReport(RReport rrep){
        reports.add(rrep);
    }
    
    @Override
    public String toString() {
        return "Room{" + "rid=" + rid + ", fid=" + fid + ", rname=" + rname + ", rsize=" + rsize + '}';
    }
    

}
