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
public class RReport {
    int rrepid;
    int rid;
    String rrepnum;
    String rrepdate;
    String rcomment;
    Boolean dmg;
    Boolean moist;
    Boolean rot;
    Boolean mould;
    Boolean fire;
    Boolean other;
    String dmgcomment;
    String walls;
    String ceiling;
    String floor;
    String windoor;
    String moistscan;
    String moistpoint;
    String recommendation;
    String rconmanager;

    public RReport(int rrepid, int rid, String rrepnum, String rrepdate, String rcomment, Boolean dmg, Boolean moist, Boolean rot, Boolean mould, Boolean fire, Boolean other, String dmgcomment, String walls, String ceiling, String floor, String windoor, String moistscan, String moistpoint, String recommendation, String rconmanager) {
        this.rrepid = rrepid;
        this.rid = rid;
        this.rrepnum = rrepnum;
        this.rrepdate = rrepdate;
        this.rcomment = rcomment;
        this.dmg = dmg;
        this.moist = moist;
        this.rot = rot;
        this.mould = mould;
        this.fire = fire;
        this.other = other;
        this.dmgcomment = dmgcomment;
        this.walls = walls;
        this.ceiling = ceiling;
        this.floor = floor;
        this.windoor = windoor;
        this.moistscan = moistscan;
        this.moistpoint = moistpoint;
        this.recommendation = recommendation;
        this.rconmanager = rconmanager;
    }

    public RReport() {
    }

    public int getRrepid() {
        return rrepid;
    }

    public void setRrepid(int rrepid) {
        this.rrepid = rrepid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRrepnum() {
        return rrepnum;
    }

    public void setRrepnum(String rrepnum) {
        this.rrepnum = rrepnum;
    }

    public String getRrepdate() {
        return rrepdate;
    }

    public void setRrepdate(String rrepdate) {
        this.rrepdate = rrepdate;
    }

    public String getRcomment() {
        return rcomment;
    }

    public void setRcomment(String rcomment) {
        this.rcomment = rcomment;
    }

    public Boolean getDmg() {
        return dmg;
    }

    public void setDmg(Boolean dmg) {
        this.dmg = dmg;
    }

    public Boolean getMoist() {
        return moist;
    }

    public void setMoist(Boolean moist) {
        this.moist = moist;
    }

    public Boolean getRot() {
        return rot;
    }

    public void setRot(Boolean rot) {
        this.rot = rot;
    }

    public Boolean getMould() {
        return mould;
    }

    public void setMould(Boolean mould) {
        this.mould = mould;
    }

    public Boolean getFire() {
        return fire;
    }

    public void setFire(Boolean fire) {
        this.fire = fire;
    }

    public Boolean getOther() {
        return other;
    }

    public void setOther(Boolean other) {
        this.other = other;
    }

    public String getDmgcomment() {
        return dmgcomment;
    }

    public void setDmgcomment(String dmgcomment) {
        this.dmgcomment = dmgcomment;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getCeiling() {
        return ceiling;
    }

    public void setCeiling(String ceiling) {
        this.ceiling = ceiling;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWindoor() {
        return windoor;
    }

    public void setWindoor(String windoor) {
        this.windoor = windoor;
    }

    public String getMoistscan() {
        return moistscan;
    }

    public void setMoistscan(String moistscan) {
        this.moistscan = moistscan;
    }

    public String getMoistpoint() {
        return moistpoint;
    }

    public void setMoistpoint(String moistpoint) {
        this.moistpoint = moistpoint;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getRconmanager() {
        return rconmanager;
    }

    public void setRconmanager(String rconmanager) {
        this.rconmanager = rconmanager;
    }

    @Override
    public String toString() {
        return "RReport{" + "rrepid=" + rrepid + ", rid=" + rid + ", rrepnum=" + rrepnum + ", rrepdate=" + rrepdate + ", rcomment=" + rcomment + ", dmg=" + dmg + ", moist=" + moist + ", rot=" + rot + ", mould=" + mould + ", fire=" + fire + ", other=" + other + ", dmgcomment=" + dmgcomment + ", walls=" + walls + ", ceiling=" + ceiling + ", floor=" + floor + ", windoor=" + windoor + ", moistscan=" + moistscan + ", moistpoint=" + moistpoint + ", recommendation=" + recommendation + ", rconmanager=" + rconmanager + '}';
    }
    
}
