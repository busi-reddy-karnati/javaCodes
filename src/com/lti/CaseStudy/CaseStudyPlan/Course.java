package com.lti.CaseStudy.CaseStudyPlan;

/**
 * Created by busis on 2020-12-04.
 */
public class Course {
    private int id;
    private String name;
    private int duration;

    public Course(int id, String name, int duration, int fees) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.fees = fees;
    }

    private int fees;

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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}
