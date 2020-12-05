package com.lti.CaseStudy.CaseStudy2;

import com.lti.CaseStudy.CaseStudyPlan.Course;
import com.lti.CaseStudy.CaseStudyPlan.Student;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by busis on 2020-12-04.
 */
public class Enroll {
    private Student student;
    private Course course;
    private Date enrollmentDate;

    public Enroll(Student student, Course course, Date enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}
