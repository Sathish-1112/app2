package com.application.appliaction.model;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
//@Entity
//@Table(name="studenttt")
public class Student {
    private int id;
    private String name;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
