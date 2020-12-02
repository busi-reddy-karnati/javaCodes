package com.lti.Abstraction;

/**
 * Created by busis on 2020-12-02.
 */

abstract class Animal{//if we have atleast one class, we need to make this class abstract
    abstract void add();//we either need to add the body or need to make it abstract
    abstract void subtract();
}

class Dog extends Animal{
    /*
    * Here we need to implement both add and subtract else we should make this to abstract class*/

    @Override //This is an annotation and tells the compiler not to search for any other in parent class
    void add(){

    }
    @Override //This is annotation
    void subtract(){

    }
}
public class AbstractDemo {
    public static void main(String[] args) {

    }
}
