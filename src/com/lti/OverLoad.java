package com.lti;

/**
 * Created by busis on 2020-12-01.
 */
public class OverLoad {
    int max(int a, int b){
        if(a>b)
            return a;
        return b;
    }
    double max(double a,double b){
        System.out.println("AAA");
        if(a>b)
            return a;
        return b;
    }
    double max(double a,int b){
        if(a>b)
            return a;
        return b;
    }
    public static void main(String[] args){
        OverLoad o = new OverLoad();
        System.out.println(o.max(1, 2));
        System.out.println(o.max(1.1, 2));
        System.out.println(o.max(1, 2.1));//This goes for double double coz no int double present
    }
}














