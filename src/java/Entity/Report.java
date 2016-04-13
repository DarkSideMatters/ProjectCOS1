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
public class Report {
    int repid;
    int bid;
    String repname;
    String rdate;
    int damid;
    String conmanager;
    String grade;

    public Report(int repid, int bid, String repname, String rdate, int damid, String conmanager, String grade) {
        this.repid = repid;
        this.bid = bid;
        this.repname = repname;
        this.rdate = rdate;
        this.damid = damid;
        this.conmanager = conmanager;
        this.grade = grade;
    }

    public Report() {
    }

    public int getRepid() {
        return repid;
    }

    public void setRepid(int repid) {
        this.repid = repid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getRepname() {
        return repname;
    }

    public void setRepname(String repname) {
        this.repname = repname;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    public int getDamid() {
        return damid;
    }

    public void setDamid(int damid) {
        this.damid = damid;
    }

    public String getConmanager() {
        return conmanager;
    }

    public void setConmanager(String conmanager) {
        this.conmanager = conmanager;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "Report{" + "repid=" + repid + ", bid=" + bid + ", repname=" + repname + ", rdate=" + rdate + ", damid=" + damid + ", conmanager=" + conmanager + ", grade=" + grade + '}';
    }
    

}
