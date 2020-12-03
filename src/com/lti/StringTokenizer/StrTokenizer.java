package com.lti.StringTokenizer;


import java.util.StringTokenizer;

public class StrTokenizer {
    public static void main(String[] args) {
        String fruits="Apple,Mango,Banana,Grapes,Kiwi,Peach";
        StringTokenizer stringTokenizer = new StringTokenizer(fruits,",");
        //make tokens based on comma


        /*
        * two methods. hasMoreTokens,nextToken
        * */
        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }




        //Accept a student marks as below and print the total
        String s = "Maths:90,English:87,Science:91";
        StringTokenizer stringTokenizer1 = new StringTokenizer(s,",");
        int totalMarks=0;
        while (stringTokenizer1.hasMoreTokens()){
            /*
            * We can also use String[] s1=stringTokenizer2.nextToken().split(":")
            * totalMarks+=Integer.parseInt(s1[1]);
            *
            * */
            String s1=stringTokenizer1.nextToken();
            StringTokenizer stringTokenizer2 = new StringTokenizer(s1,":");
            String sub =stringTokenizer2.nextToken();
            totalMarks+=Integer.parseInt(stringTokenizer2.nextToken());
        }
        System.out.println("Total Marks: "+totalMarks);




    }
}
