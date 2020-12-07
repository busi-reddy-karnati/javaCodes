package com.lti.LambdaDemo;

/**
 * Created by busis on 2020-12-07.
 */
interface MyInterface{
    void myMethod();
}
class MyClass  implements MyInterface{

    @Override
    public void myMethod() {
        System.out.println("Interface Implemented");
    }
}
public class LambdaDemo {
    public static void main(String[] args) {
        MyClass myClass= new MyClass();
        myClass.myMethod();//This is heavy

        //We can also do it otherwise
        MyInterface myInterface = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("Interface");
            }
        };
        myClass.myMethod();//This is another implementation
        //This is also a bit heavy
    }
}
