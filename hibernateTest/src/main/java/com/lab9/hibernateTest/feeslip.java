package com.lab9.hibernateTest;

import javax.persistence.*;

@Entity
@Table(name = "feeslip")
public class feeslip {
	@Column
    private String fname;
	@Column
	private String sname;
	@Id
	private int regnumber;
	@Column
	private String pass;
	@Column
	private String currentdate;
	@Column
	private String feemonth;
 
    public feeslip() {
    }
 
    public String getfname() {
        return fname;
    }
 
    public void setfname(String fname) {
        this.fname = fname;
    }
    
    public String getsname() {
        return sname;
    }
 
    public void setsname(String sname) {
        this.sname = sname;
    }
    
    
    public int getregnumber() {
        return regnumber;
    }
 
    public void setregnumber(int i) {
        this.regnumber= i;
    }    
 
    public String getpass() {
        return pass;
    }
 
    public void setpass(String pass) {
        this.pass = pass;
    }    

    public String getcurrentdate() {
        return currentdate;
    }
 
    public void setcurrentdate(String string) {
        this.currentdate = string;
    }
    
    public String getfeemonth() {
        return feemonth;
    }
 
    public void setfeemonth(String feemonth) {
        this.feemonth= feemonth;
    }
}