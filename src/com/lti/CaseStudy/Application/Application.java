package com.lti.CaseStudy.Application;

import com.lti.CaseStudy.CaseStudy2.AppEngine;
import com.lti.CaseStudy.CaseStudyPlan.Course;
import com.lti.CaseStudy.CaseStudyPlan.Student;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by busis on 2020-12-04.
 */
public interface Application {
    public void showFirstScreen();
    public void showStudentScreen();
    public void showAdminScreen();
    public void showAllStudentsScreen();
    public void showStudentRegistrationScreen();
    public void introduceNewCourseScreen();
    public void showAllCoursesScreen();

}
class Implementation implements Application{

    @Override
    public void showFirstScreen() {
        System.out.println("Hello there!");
        System.out.println("Press 1: Admin Page");
        System.out.println("2: Student Page");
        int option;
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();
        switch (option){
            case 1:
                showStudentScreen();
                break;
            case 2:
                showAdminScreen();
                break;
            default:
                System.out.println("Invalid Entry. Please try again!");
        }
    }

    @Override
    public void showStudentScreen() {
        System.out.println("This is the Student Screen: No functionality as of now");
    }

    @Override
    public void showAdminScreen() {
        while(true){
            System.out.println("Press 1: Show all Courses");
            System.out.println("2: Show all Students");
            System.out.println("3: Register a Student");
            System.out.println("4: Introduce a course");
            System.out.println("0: EXIT");
            int option;
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            switch (option){
                case 1:
                    showAllCoursesScreen();
                    break;
                case 2:
                    showAllStudentsScreen();
                    break;
                case 3:
                    showStudentRegistrationScreen();
                    break;

                case 4:
                    introduceNewCourseScreen();
                    break;

                case 0:
                    System.exit(0);
                    default:
                        System.out.println("Invalid option entered. Try Again");
            }
        }
    }

    @Override
    public void showAllStudentsScreen() {
        AppEngine appEngine = new AppEngine();
        try {
            Student[] students = appEngine.listOfStudents();
            for(Student student:students){
                System.out.println("Name: "+student.getName());
                System.out.println("Id: "+student.getId());
                System.out.println("dob: "+student.getDateOfBirth());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }

    @Override
    public void showStudentRegistrationScreen() {
        Scanner sc=new Scanner(System.in);
        String name;
        int id;
        Date d =new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
        System.out.println("Give ID, Name, DOB(in DD-MM-YYYY FORMAT)");
        id=sc.nextInt();
        name = sc.next();
        String dob = sc.next();
        try {
            d=sdf.parse(dob);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Student student = new Student(id,name,d);
        AppEngine appEngine = new AppEngine();
        try {
            appEngine.register(student);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return;
    }

    @Override
    public void introduceNewCourseScreen() {
        Scanner sc = new Scanner(System.in);
        String courseName;
        int courseId, duration, fees;
        System.out.println("Give ID, Name, Duration, Fees for the course");
        courseId = sc.nextInt();
        courseName = sc.next();
        duration=sc.nextInt();
        fees=sc.nextInt();
        Course course = new Course(courseId,courseName,duration,fees);
        AppEngine appEngine = new AppEngine();
        try {
            appEngine.introduce(course);
        }
        catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showAllCoursesScreen() {
        AppEngine appEngine = new AppEngine();
        try {
            Course[] courses=appEngine.listOfCourses();
            for(Course course:courses){
                System.out.println("Name: "+course.getName());
                System.out.println("Id: "+course.getId());
                System.out.println("Fees: "+course.getFees());
                System.out.println("Duration: "+course.getDuration()+" months");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
