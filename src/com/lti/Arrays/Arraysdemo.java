package com.lti.Arrays;
import java.util.Scanner;

class Employee{
    int EmpNo;
    String EmpName;
    Employee(int EmpNo,String EmpName){
        this.EmpName=EmpName;
        this.EmpNo=EmpNo;
    }
}
public class Arraysdemo {
    //Always give in method
    void main2(){
        Scanner sc=new Scanner(System.in);
        int arr[];
        arr=new int[10];
        int sum=0;
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
        System.out.println("The sum is: "+sum);
    }
    public static void main(String[] args) {
        //One way of init
        int arr[]={1,2,3,4,5};

        //Another way
        int[] a;
        a=new int[10];
        System.out.println(a[3]);
        //Array of objects
        Employee[] employees;
        employees=new Employee[4];

        for (int anArr : arr) {
            System.out.println(anArr);
        }
        employees[0]=new Employee(1,"Sachin");
        employees[1]=new Employee(2,"Sehwag");
        employees[2]=new Employee(3,"Dravid");
        employees[3]=new Employee(4,"Laxman");
        for (Employee employee : employees) {
            System.out.println(employee.EmpNo + " " + employee.EmpName);
        }
        Arraysdemo aa = new Arraysdemo();
        aa.main2();
    }


}
