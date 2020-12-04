package com.lti.CaseStudy.Application;

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
        System.out.println("Welcome to SMS(Student Mgmt. System) v1.0");
        System.out.println("Tell us who you are : \n1. Student\n2. Admin");
        System.out.println("Enter your choice ( 1 or 2 ) : ");
        Scanner scanner = new Scanner(System.in);
        int op = Integer.parseInt(scanner.nextLine());

        switch(op){
            case 1:
                showStudentScreen();
                break;
            case 2:
                showAdminScreen();
                break;
        }
    }

    @Override
    public void showStudentScreen() {

    }

    @Override
    public void showAdminScreen() {

    }

    @Override
    public void showAllStudentsScreen() {

    }

    @Override
    public void showStudentRegistrationScreen() {

    }

    @Override
    public void introduceNewCourseScreen() {

    }

    @Override
    public void showAllCoursesScreen() {

    }
}
