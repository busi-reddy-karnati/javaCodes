package com.lti.TestBed;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by busis on 2020-12-08.
 */
public class TestClass {
    public static void main(String[] args) {
        int num=-1%3;
        if(num<0)
            num=3+num;
        System.out.println(num);
    }
    public static void main2(String[] args) {
        int n=19;
        while (n>0){
            System.out.println(n%2);
            n=n>>1;
        }
    }
    public static void main1(String[] args) {
        System.out.println(differenceInDays("07/29/2010","07/26/2010"));
    }
    public static long differenceInDays(String s1,String s2){
        DateFormat format = new SimpleDateFormat("MM/DD/yyyy");
        long diff=100L;
        try {
            Date date1 = format.parse(s1);
            Date date2 = format.parse(s2);
            diff = date1.getTime()-date2.getTime();
            return (diff/(1000*3600*24))%365;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return diff;
    }
}
