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
public class Damage {
    int damid;
    int rid;
    String descr;
    String dtype;
    Boolean moisture;
    String moisturepoint;
    String walls;
    String ceiling;
    String floor;
    String windoor;
    String recommendation;

    public Damage(int damid, int rid, String descr, String dtype, Boolean moisture, String moisturepoint, String walls, String ceiling, String floor, String windoor, String recommendation) {
        this.damid = damid;
        this.rid = rid;
        this.descr = descr;
        this.dtype = dtype;
        this.moisture = moisture;
        this.moisturepoint = moisturepoint;
        this.walls = walls;
        this.ceiling = ceiling;
        this.floor = floor;
        this.windoor = windoor;
        this.recommendation = recommendation;
    }

    public Damage() {
    }

    public int getDamid() {
        return damid;
    }

    public void setDamid(int damid) {
        this.damid = damid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public Boolean getMoisture() {
        return moisture;
    }

    public void setMoisture(Boolean moisture) {
        this.moisture = moisture;
    }

    public String getMoisturepoint() {
        return moisturepoint;
    }

    public void setMoisturepoint(String moisturepoint) {
        this.moisturepoint = moisturepoint;
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

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    @Override
    public String toString() {
        return "Damage{" + "damid=" + damid + ", rid=" + rid + ", descr=" + descr + ", dtype=" + dtype + ", moisture=" + moisture + ", moisturepoint=" + moisturepoint + ", walls=" + walls + ", ceiling=" + ceiling + ", floor=" + floor + ", windoor=" + windoor + ", recommendation=" + recommendation + '}';
    }
    
    
}
