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
    String brdate;
    String usagecomment;
    String roofcomment;
    String extwallscomment;
    String pemployee;
    String bconmanager;
    String grade;

    public BReport(int brepid, int bid, String brdate, String usagecomment, String roofcomment, String extwallscomment, String pemployee, String bconmanager, String grade) {
        this.brepid = brepid;
        this.bid = bid;
        this.brdate = brdate;
        this.usagecomment = usagecomment;
        this.roofcomment = roofcomment;
        this.extwallscomment = extwallscomment;
        this.pemployee = pemployee;
        this.bconmanager = bconmanager;
        this.grade = grade;
    }
    
    public BReport(int bid, String brdate, String usagecomment, String roofcomment, String extwallscomment, String pemployee, String bconmanager, String grade) {
        this.bid = bid;
        this.brdate = brdate;
        this.usagecomment = usagecomment;
        this.roofcomment = roofcomment;
        this.extwallscomment = extwallscomment;
        this.pemployee = pemployee;
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

    public String getBrdate() {
        return brdate;
    }

    public void setBrdate(String brdate) {
        this.brdate = brdate;
    }

    public String getUsagecomment() {
        if(usagecomment==null)
            return "No Comment";
        else
            return usagecomment;
    }

    public void setUsagecomment(String usagecomment) {
        this.usagecomment = usagecomment;
    }

    public String getRoofcomment() {
        if(usagecomment==null)
            return "No Comment";
        else
            return roofcomment;
    }

    public void setRoofcomment(String roofcomment) {
        this.roofcomment = roofcomment;
    }

    public String getExtwallscomment() {
        if(usagecomment==null)
            return "No Comment";
        else
            return extwallscomment;
    }

    public void setExtwallscomment(String extwallscomment) {
        this.extwallscomment = extwallscomment;
    }

    public String getPemployee() {
        return pemployee;
    }

    public void setPemployee(String pemployee) {
        this.pemployee = pemployee;
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
        return "BReport{" + "brepid=" + brepid + ", bid=" + bid + ", brdate=" + brdate + ", usagecomment=" + usagecomment + ", roofcomment=" + roofcomment + ", extwallscomment=" + extwallscomment + ",pemployee" + pemployee + ", bconmanager=" + bconmanager + ", grade=" + grade + '}';
    }

}
