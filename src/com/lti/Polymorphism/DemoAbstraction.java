package com.lti.Polymorphism;


/**
 * Created by busis on 2020-12-02.
 */
class Animal{
    Animal(){
        System.out.println("Animal");
    }
    void whoAmI(){
        System.out.println("animal");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog");
    }
    void whoAmI(){
        super.whoAmI();
        System.out.println("dog");
    }
}
class SnakeCat{}
public class DemoAbstraction {
    public static void main(String[] args) {
        //call WhoAm
        //with Animal a = cat,dog,snake
        //works cos overridden
        //For bank and applyFD cannot be accessed like this coz it isnt overridden method
        Dog dog = new Dog();
        //dog.whoAmI();

        XExtend.print();
        System.out.println(X.s);
        System.out.println(InFace.x);
    }
}
class X{
    static int s=10;
    static void print(){
        System.out.println("Viola");
    }

}
abstract class AbsClass{
    void myMethod(){
        System.out.println("Test Abstract");
    }
}
class AbsImplementation extends AbsClass{
    void myMethod(){
        super.myMethod();
        System.out.println("Test Abstract Impl");
    }
}
class XExtend extends X{
    static void print(){
        System.out.println("Viola Sub Class");
    }
}
interface InFace{
    int x=100;
}