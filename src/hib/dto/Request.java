/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hib.dto;


public class Request {
    private String userId;
    private String patientName;
    private int patientAge;
    private String gender;

    public Request() {
    }
    

    public Request(String userId,String patientName, int patientAge, String gender) {
       this.userId=userId;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.gender = gender;
    }
    

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
   
    
}
