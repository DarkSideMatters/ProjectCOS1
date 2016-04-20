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
public class BReport {
    int brepid;
    int bid;
    String brepnum;
    String brdate;
    String usagecomment;
    String roofcomment;
    String extwallscomment;
    String bconmanager;
    String grade;

    public BReport(int brepid, int bid, String brepnum, String brdate, String usagecomment, String roofcomment, String extwallscomment, String bconmanager, String grade) {
        this.brepid = brepid;
        this.bid = bid;
        this.brepnum = brepnum;
        this.brdate = brdate;
        this.usagecomment = usagecomment;
        this.roofcomment = roofcomment;
        this.extwallscomment = extwallscomment;
        this.bconmanager = bconmanager;
        this.grade = grade;
    }

    public BReport() {
    }

    public int getBrepid() {
        return brepid;
    }

    public void setBrepid(int brepid) {
        this.brepid = brepid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBrepnum() {
        return brepnum;
    }

    public void setBrepnum(String brepnum) {
        this.brepnum = brepnum;
    }

    public String getBrdate() {
        return brdate;
    }

    public void setBrdate(String brdate) {
        this.brdate = brdate;
    }

    public String getUsagecomment() {
        return usagecomment;
    }

    public void setUsagecomment(String usagecomment) {
        this.usagecomment = usagecomment;
    }

    public String getRoofcomment() {
        return roofcomment;
    }

    public void setRoofcomment(String roofcomment) {
        this.roofcomment = roofcomment;
    }

    public String getExtwallscomment() {
        return extwallscomment;
    }

    public void setExtwallscomment(String extwallscomment) {
        this.extwallscomment = extwallscomment;
    }

    public String getBconmanager() {
        return bconmanager;
    }

    public void setBconmanager(String bconmanager) {
        this.bconmanager = bconmanager;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "BReport{" + "brepid=" + brepid + ", bid=" + bid + ", brepnum=" + brepnum + ", brdate=" + brdate + ", usagecomment=" + usagecomment + ", roofcomment=" + roofcomment + ", extwallscomment=" + extwallscomment + ", bconmanager=" + bconmanager + ", grade=" + grade + '}';
    }

}
