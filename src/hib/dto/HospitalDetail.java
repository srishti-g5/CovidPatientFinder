/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hib.dto;

/**
 *
 * @author sgsri
 */
public class HospitalDetail {
    private int serialNo;
    private int totalBed;
    private int availableBed;
    private int totalRequest;

    public HospitalDetail(){}

    public HospitalDetail(int serialNo, int totalBed, int availableBed, int totalRequest) {
        this.serialNo = serialNo;
        this.totalBed = totalBed;
        this.availableBed = availableBed;
        this.totalRequest = totalRequest;
    }
    
    public int getTotalBed() {
        return totalBed;
    }

    public void setTotalBed(int totalBed) {
        this.totalBed = totalBed;
    }

    public int getAvailableBed() {
        return availableBed;
    }

    public void setAvailableBed(int availableBed) {
        this.availableBed = availableBed;
    }

    public int getTotalRequest() {
        return totalRequest;
    }

    public void setTotalRequest(int totalRequest) {
        this.totalRequest = totalRequest;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    
}
