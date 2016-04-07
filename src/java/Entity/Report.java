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
    String reportno;
    String rdate;
    String bname;
    String baddress;
    String postno;
    String rcomment;

    public Report(String reportno, String rdate, String bname, String baddress, String postno, String rcomment) {
        this.reportno = reportno;
        this.rdate = rdate;
        this.bname = bname;
        this.baddress = baddress;
        this.postno = postno;
        this.rcomment = rcomment;
    }

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
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

    public String getBaddress() {
        return baddress;
    }

    public void setBaddress(String baddress) {
        this.baddress = baddress;
    }

    public String getPostno() {
        return postno;
    }

    public void setPostno(String postno) {
        this.postno = postno;
    }

    public String getRcomment() {
        return rcomment;
    }

    public void setRcomment(String rcomment) {
        this.rcomment = rcomment;
    }
    
    
}
