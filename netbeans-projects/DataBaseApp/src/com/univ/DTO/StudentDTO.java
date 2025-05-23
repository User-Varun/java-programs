/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univ.DTO;

// DTO means data transfer object 

/**
 *
 * @author Varun
 */
public class StudentDTO {
    int sid , mob , status;
    String sname , sadd , branch , unm , pw;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getMob() {
        return mob;
    }

    public void setMob(int mob) {
        this.mob = mob;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSadd() {
        return sadd;
    }

    public void setSadd(String sadd) {
        this.sadd = sadd;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getUnm() {
        return unm;
    }

    public void setUnm(String unm) {
        this.unm = unm;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
    
    
    
}
