package com.lti;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

/**
 * Created by busis on 2020-12-01.
 */
public class YearAlgo {
    void isleap(int num){
        if(num%400 ==0)
            System.out.println("Leap Year");
        else if(num%100==0)
            System.out.println("Century Year");
        else if(num%4==0)
            System.out.println("Leap Year");
        else
            System.out.println("Normal Year");

    }
    public static void main(String args[]){
        YearAlgo Inc = new YearAlgo();
        Scanner Sc=new Scanner(System.in);
        int num=Sc.nextInt();
        Inc.isleap(num);
    }
}
