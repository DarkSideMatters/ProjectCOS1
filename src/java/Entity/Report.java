/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Mircea
 */
public class Report {
    int reportno;
    String rdate;
    String bname;
    String rcomment;

    public Report(int reportno, String rdate, String bname, String rcomment) {
        this.reportno = reportno;
        this.rdate = rdate;
        this.bname = bname;
        this.rcomment = rcomment;
    }
    
    public Report() {
    }

    public int getReportno() {
        return reportno;
    }

    public void setReportno(int reportno) {
        this.reportno = reportno;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    


    public String getRcomment() {
        return rcomment;
    }

    public void setRcomment(String rcomment) {
        this.rcomment = rcomment;
    }

    @Override
    public String toString() {
        return "Report{" + "reportno=" + reportno + ", rdate=" + rdate + ", bname=" + bname + ", rcomment=" + rcomment + '}';
    }
    
    
}
