package com.lti;

/**
 * Created by busis on 2020-12-01.
 */
public class MyMain {
    public static void main(String args[]){
        Square s=new Square();
        int side=20;
        s.setSide(side);
        System.out.println("Area of Square with side "+side+" is "+s.calculateArea(side));
    }
    public static void main1(String[] args){
        Employee e=new Employee();
        e.setAge(22);
        e.setEmpNo(1);
        e.setName("Busi Reddy Karnati");
        System.out.println("Name: " + e.getName());
        System.out.println("Emp No: "+e.getEmpNo());
        System.out.println("Age: "+e.getAge());
    }

}
