package com.lti.CaseStudy.CaseStudy2;

import com.lti.CaseStudy.CaseStudyPlan.Course;
import com.lti.CaseStudy.CaseStudyPlan.Student;

import java.time.LocalDate;

/**
 * Created by busis on 2020-12-04.
 */
public class Enroll {
    private Student student;
    private Course course;
    private LocalDate enrollmentDate;

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

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}
