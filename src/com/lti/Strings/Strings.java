package com.lti.Strings;

/**
 * Created by busis on 2020-12-03.
 */
public class Strings {
    public static void main(String[] args) {
        String s1="Hello";
        char ch[]={'a','b','c','d'};
        String s2=new String(ch);
        byte b[]={'b','i','l'};
        String s3=new String(b);
        String s4=new String(s3);
        System.out.println(s1+s2+s3+s4);
        System.out.println(s1.charAt(2));
        //character at 2


        System.out.println(s1.compareTo(s2));
        //Compares and returns int?

        System.out.println(s1.equalsIgnoreCase(s2));
        //bool whether equal

        System.out.println(s1.indexOf('l'));
        //char at index 1

        System.out.println(s1.length());
        //length of s1

        System.out.println(s1.concat(s2));
        //concat is temporary

        System.out.println(s1.substring(1));
        //From 1 till last


        System.out.println(s1.substring(1,4));
        //From 1 till 3[123]

        String tr="   hello    ";

        System.out.println(tr.trim().equalsIgnoreCase(s1));

        System.out.println(s1.replace("ll","k"));
        //Replace is a temporary
        //Both characters and strings are allowed for replace

        //Most of the methods form a new string

        String ss="hrhrh";
        System.out.println(ss.charAt(2));
        System.out.println(s1);
        //concat,replace,substring,trim are some other


        String test="ABC123";
        int ssum=0;
        for(int i=0;i<test.length();i++){
            if(Character.isDigit(test.charAt(i))){
                ssum+=Integer.parseInt(test.charAt(i)+"");
                //Or test.substring(i,i+1);
            }
        }
        System.out.println(ssum);

        //accept string including digits and print the max
        String test2="ABC123";
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<test.length();i++){
            if(Character.isDigit(test.charAt(i))){
                int nn4=Integer.parseInt(test.charAt(i)+"");
                if(nn4>ans)
                    ans=nn4;
            }
        }
        System.out.println(ans);
    }
}
