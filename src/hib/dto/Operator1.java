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
public class Operator1 {
    private String name;
    private String id;
    
    public Operator1(){}
    public Operator1(String name, String id){
        this.name=name;
        this.id=id;
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    }

