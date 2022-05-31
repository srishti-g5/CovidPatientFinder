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
public class DoctorDetail {
    private String serialNo;
    private String name;
    private int treatedPatient;
    private int experienceYear;

    public DoctorDetail() {
    }
    

    public DoctorDetail(String serialNo, String name, int treatedPatient, int experienceYear) {
        this.serialNo = serialNo;
        this.name = name;
        this.treatedPatient = treatedPatient;
        this.experienceYear = experienceYear;
    }

    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTreatedPatient() {
        return treatedPatient;
    }

    public void setTreatedPatient(int treatedPatient) {
        this.treatedPatient = treatedPatient;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
}
