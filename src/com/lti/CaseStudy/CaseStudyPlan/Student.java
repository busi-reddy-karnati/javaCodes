package com.lti.CaseStudy.CaseStudyPlan;

import java.util.Date;

/**
 * Created by busis on 2020-12-04.
 */
public class Student {
    private int id;
    private String name;
    private String dateOfBirth;

    Student(int id,String name, String dateOfBirth){
        this.id=id;
        this.name=name;
        this.dateOfBirth=dateOfBirth;
    }

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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
