package com.lti.Wrappers;
/*
Normal     Wrapper
==================
int         Integer
char        Character
for the rest, make CapitalCase(boolean->Boolean)


 */

public class WrapperDemo {
    public static void main(String[] args) {
        int num=10;//Primitive datatype
        Integer num1=new Integer(num);//This became an object
        System.out.println(num1.MAX_VALUE);//This is the maximum value that can be stored in num1
        //Use num1.toString() to get num1 in string
        System.out.println(num1.toString());
        char c ='a';
        Character cc = new Character(c);
        System.out.println(Character.isDigit(c));//First c is converted to wrapper class
        //and then  the methods associated with it
        String s="hello";
        s.charAt(1);//This gives the character at index 1


        //String to Integer
        String n1="100";
        int x = Integer.parseInt(n1);

        //Integer to String
        n1=Integer.toString(x);

        /*
        Add tow values in character
         */
        char n12='5';
        char n13 = '4';
        int sum=0;
        sum=Integer.parseInt(Character.toString(n12))+Integer.parseInt(Character.toString(n13));
        //String s1=n12+"";
        //String.valueOf(n12);
        //Character.getNumericValue(n12);

        System.out.println(sum);

    }
}
