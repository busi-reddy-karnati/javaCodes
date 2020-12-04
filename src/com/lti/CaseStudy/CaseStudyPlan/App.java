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
        Student s1 = new Student(1,"Sachin","1973-04-24");
        Student s2 = new Student(2,"Sehwag","1978-10-20");
        Student s3 = new Student(3,"Ganguly","1972-07-08");
        Student s4 = new Student(4,"Laxman","1974-11-01");
    }
    public void scenario2(){
        List<Student> students = new ArrayList<Student>();
        //Student[] students = new Student[4];
        students.add(new Student(1,"Sachin2","1973-04-24"));
        students.add(new Student(2,"Sehwag2","1978-10-20"));
        students.add(new Student(3,"Ganguly2","1972-07-08"));
        students.add(new Student(4,"Laxman2","1974-11-01"));
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
        Student student = new Student(id,name,dob);

    }
    public static void main(String[] args) {

    }

}
