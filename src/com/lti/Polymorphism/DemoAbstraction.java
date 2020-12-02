package com.lti.Polymorphism;


/**
 * Created by busis on 2020-12-02.
 */
class Animal{
    void whoAmI(){

    }
}
class Dog extends Animal{
    void whoAmI(){}
}
class SnakeCat{}
public class DemoAbstraction {
    public static void main(String[] args) {
        //call WhoAm
        //with Animal a = cat,dog,snake
        //works cos overridden
        //For bank and applyFD cannot be accessed like this coz it isnt overridden method
    }
}
