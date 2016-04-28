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
    String rrepdate;
    String rcomm;
    boolean dmg;
    boolean moist;
    boolean rot;
    boolean mold;
    boolean fire;
    boolean other;
    String dmgcom;
    String wallscom;
    String ceilingcom;
    String floorcom;
    String windoorcom;
    boolean moistscan;
    String moistpoint;
    String recom;
    String rconmng;

    public RReport(int rrepid, int rid, String rrepdate, String rcomm, boolean dmg, boolean moist, boolean rot, boolean mold, boolean fire, boolean other, String dmgcom, String wallscom, String ceilingcom, String floorcom, String windoorcom, boolean moistscan, String moistpoint, String recom, String rconmng) {
        this.rrepid = rrepid;
        this.rid = rid;
        this.rrepdate = rrepdate;
        this.rcomm = rcomm;
        this.dmg = dmg;
        this.moist = moist;
        this.rot = rot;
        this.mold = mold;
        this.fire = fire;
        this.other = other;
        this.dmgcom = dmgcom;
        this.wallscom = wallscom;
        this.ceilingcom = ceilingcom;
        this.floorcom = floorcom;
        this.windoorcom = windoorcom;
        this.moistscan = moistscan;
        this.moistpoint = moistpoint;
        this.recom = recom;
        this.rconmng = rconmng;
    }

    public RReport(int rid, String rrepdate, String rcomm, boolean dmg, boolean moist, boolean rot, boolean mold, boolean fire, boolean other, String dmgcom, String wallscom, String ceilingcom, String floorcom, String windoorcom, boolean moistscan, String moistpoint, String recom, String rconmng) {
        this.rid = rid;
        this.rrepdate = rrepdate;
        this.rcomm = rcomm;
        this.dmg = dmg;
        this.moist = moist;
        this.rot = rot;
        this.mold = mold;
        this.fire = fire;
        this.other = other;
        this.dmgcom = dmgcom;
        this.wallscom = wallscom;
        this.ceilingcom = ceilingcom;
        this.floorcom = floorcom;
        this.windoorcom = windoorcom;
        this.moistscan = moistscan;
        this.moistpoint = moistpoint;
        this.recom = recom;
        this.rconmng = rconmng;
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

    public String getRrepdate() {
        return rrepdate;
    }

    public void setRrepdate(String rrepdate) {
        this.rrepdate = rrepdate;
    }

    public String getRcomm() {
        return rcomm;
    }

    public void setRcomm(String rcomm) {
        this.rcomm = rcomm;
    }

    public boolean isDmg() {
        return dmg;
    }

    public void setDmg(boolean dmg) {
        this.dmg = dmg;
    }

    public boolean isMoist() {
        return moist;
    }

    public void setMoist(boolean moist) {
        this.moist = moist;
    }

    public boolean isRot() {
        return rot;
    }

    public void setRot(boolean rot) {
        this.rot = rot;
    }

    public boolean isMold() {
        return mold;
    }

    public void setMould(boolean mold) {
        this.mold = mold;
    }

    public boolean isFire() {
        return fire;
    }

    public void setFire(boolean fire) {
        this.fire = fire;
    }

    public boolean isOther() {
        return other;
    }

    public void setOther(boolean other) {
        this.other = other;
    }

    public String getDmgcom() {
        return dmgcom;
    }

    public void setDmgcom(String dmgcom) {
        this.dmgcom = dmgcom;
    }

    public String getWallscom() {
        return wallscom;
    }

    public void setWallscom(String wallscom) {
        this.wallscom = wallscom;
    }

    public String getCeilingcom() {
        return ceilingcom;
    }

    public void setCeilingcom(String ceilingcom) {
        this.ceilingcom = ceilingcom;
    }

    public String getFloorcom() {
        return floorcom;
    }

    public void setFloorcom(String floorcom) {
        this.floorcom = floorcom;
    }

    public String getWindoorcom() {
        return windoorcom;
    }

    public void setWindoorcom(String windoorcom) {
        this.windoorcom = windoorcom;
    }

    public boolean isMoistscan() {
        return moistscan;
    }

    public void setMoistscan(boolean moistscan) {
        this.moistscan = moistscan;
    }

    public String getMoistpoint() {
        return moistpoint;
    }

    public void setMoistpoint(String moistpoint) {
        this.moistpoint = moistpoint;
    }

    public String getRecom() {
        return recom;
    }

    public void setRecom(String recom) {
        this.recom = recom;
    }

    public String getRconmng() {
        return rconmng;
    }

    public void setRconmng(String rconmng) {
        this.rconmng = rconmng;
    }

    @Override
    public String toString() {
        return "RReport{" + "rrepid=" + rrepid + ", rid=" + rid + ", rrepdate=" + rrepdate + ", rcomm=" + rcomm + ", dmg=" + dmg + ", moist=" + moist + ", rot=" + rot + ", mold=" + mold + ", fire=" + fire + ", other=" + other + ", dmgcom=" + dmgcom + ", wallscom=" + wallscom + ", ceilingcom=" + ceilingcom + ", floorcom=" + floorcom + ", windoorcom=" + windoorcom + ", moistscan=" + moistscan + ", moistpoint=" + moistpoint + ", recom=" + recom + ", rconmng=" + rconmng + '}';
    }

}
