/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hib.dto;

import java.util.Date;

/**
 *
 * @author sgsri
 */
public class Patient1 extends Operator1 {
 private String pName;
 private int pId;
 private int room;
 private int bedNo;
 private String treatment;
 private String doc;
 private String history;
 private String contact;
 private String admitDate;
 private String dischargeDate;

 public Patient1(){
     
 }

 public Patient1(String name, String id, String pName, int pId, int room, int bedNo, String treatment, String doc, String history, String contact, String admitDate, String dischargeDate) {
        super(name,id);
        this.pName = pName;
        this.pId = pId;
        this.room = room;
        this.bedNo = bedNo;
        this.treatment = treatment;
        this.doc = doc;
        this.history = history;
        this.contact = contact;
        this.admitDate = admitDate;
        this.dischargeDate = dischargeDate;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getBedNo() {
        return bedNo;
    }

    public void setBedNo(int bedNo) {
        this.bedNo = bedNo;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(String admitDate) {
        this.admitDate = admitDate;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }
 
}
