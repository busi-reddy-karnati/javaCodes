package com.lti.ExceptionHandling;

class AgeException extends Exception{//Defining user defined exceptions
    public AgeException(String message){
        super(message);//super class is exception class
    }
}
class VerifyAge{
    void ageVerification(int age) throws AgeException {
        if(age<18)
            throw new AgeException("Invalid Age");//Creates a new class AgeException and passes the message
        System.out.println("Age Verified");
    }
}
public class UDEDemo {
    public static void main(String[] args) {
        VerifyAge verifyAge = new VerifyAge();
        try{
            verifyAge.ageVerification(112);//We do not know if this will throw an exception.
            //It goes to the method which says throws exception and if that particular exception comes, return back.
            //Note this is user defined exception
        }
        catch(AgeException e){//Here all the exceptions that may be thrown from the child class
            System.out.println(e.getMessage());
        }
    }
}
