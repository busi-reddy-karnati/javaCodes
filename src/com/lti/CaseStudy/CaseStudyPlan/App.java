package com.lti.CaseStudy.CaseStudyPlan;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by busis on 2020-12-04.
 */
public class App {
    public void scenario1(){

    }
    public void scenario2(){
        List<Student> students = new ArrayList<Student>();
        for(Student student : students){
            new Info().display(student);
        }
    }
    public void scenario3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        int id=sc.nextInt();
        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("DOB: ");
        String dob = sc.next();


    }
    public static void main(String[] args) {

    }

}
