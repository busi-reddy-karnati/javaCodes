package com.lti.CaseStudy.CaseStudyPlan;

import com.lti.CaseStudy.CaseStudy2.Enroll;

/**
 * Created by busis on 2020-12-04.
 */
public class Info {
    public void display(Student student){
        System.out.println("Student Name: "+student.getName());
        System.out.println("Student id: "+student.getId());
        System.out.println("Student Date of Birth: "+student.getDateOfBirth());
    }
    //overloading methods
    public void display(Course course){
        System.out.println("Course Name : "+course.getName());
        System.out.println("Course id: "+course.getId());
        System.out.println("Course Fees: "+course.getFees());
        System.out.println("Course Duration: "+course.getDuration());

    }
    public void display(Enroll enroll){
        System.out.println("Course Name: "+enroll.getCourse().getName());
        System.out.println("Student Name: "+enroll.getStudent().getName());
        System.out.println("Enrollment Date: "+enroll.getEnrollmentDate());
    }
}
