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
public class Room {
    int rid;
    int fid;
    String rname;
    String size;

    public Room(int rid, int fid, String rname, String size) {
        this.rid = rid;
        this.fid = fid;
        this.rname = rname;
        this.size = size;
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
    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Room{" + "rid=" + rid + ", fid=" + fid + ", rname=" + rname + ", size=" + size + '}';
    }
    

}
