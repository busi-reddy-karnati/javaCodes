package com.lti;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

/**
 * Created by busis on 2020-12-01.
 */
public class Increasing {
    Boolean isincreasing(int num){
        if(num<10)
            return true;
        while(num>10){
            int d=num%10;
            num=num/10;
            int dd=num%10;
            if(dd>=d)
                return false;

        }
        return true;
    }
    public static void main(String args[]){
        Increasing Inc = new Increasing();
        Scanner Sc=new Scanner(System.in);
        int num=Sc.nextInt();
        System.out.print(Inc.isincreasing(num));
    }
}
