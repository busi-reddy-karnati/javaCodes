package com.lti.ExceptionHandling;


class NumException extends Exception{
    NumException(String s){
        super(s);
    }
}
class RangePrint{
    void printRange(int a, int b) throws NumException {
        if(a<0 || b<0)
            throw new NumException("Invalid Range Entered");
        for(int i=a;i<=b;i++)
            System.out.println(i);
    }
}
public class UDEDemo2 {
    public static void main(String[] args) {
        try{
            int a=1,b=23;
            RangePrint rangePrint = new RangePrint();
            rangePrint.printRange(a,b);
        }
        catch (NumException n){
            System.out.println(n.getMessage());
        }
    }
}
