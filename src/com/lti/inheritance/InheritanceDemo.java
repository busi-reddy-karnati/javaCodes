package com.lti.inheritance;

class Parent{
    private int xfac=100;
    void google(){
        System.out.println("Google.com");
    }
    public int getXfac(){
        return xfac;
    }
}
class Child extends Parent{
    void yahoo(){
        System.out.println("Yahoo.com");
    }
    void google(){
        System.out.println("Google.com extended in child");//This is overridden method
        //Overloading is changing the signature. Overriding is not changing the signature but keeping it same in
        //Subclass
    }
}
public class InheritanceDemo {
    public static void main(String args[]){
        Child c=new Child();
        System.out.println(c.getXfac());//WE are able to access this because, although the variable is private,
        //The getter method is a public one. This also shows the concept of encapsulation
        c.google();
        c.yahoo();//The child class inherits all that is there
    }
}

class DemoforObjectClass{
    public static void main(String args[]){
        int num1=100;
        int num2=100;
        if(num1==num2){
            System.out.println("matching");//We will get the same for if int or string or new String(){This is a class};
        }
        else{
            System.out.println("Not matching");
        }
        int n=100;
        String s=new Integer(n).toString();
        //First we have made into an Integer object, which is called wrapper and then we convert to a string object
    }
}
