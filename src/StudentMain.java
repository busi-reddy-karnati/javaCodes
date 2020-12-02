import java.util.Scanner;

/*
Not able to make this public coz we can have only one public class in a file and that has the name of File
 */
class Student {
    int registrationId;
    void displayRegistrationId(){
        System.out.println("The Student registration id is "+registrationId);
    }
}

/*Do not put() after declaring a class
There can be classes without a main method
If the class is public, we can change the variables attached with that


Declare the file as the class that has main method


* */
class StudentMain{
    public static void main(String[] args){
        Student s1=new Student();
        //This is for showing typecasting
            /*char a='@';
            int k=a;*/


        /*int x=100;
        int y=x+=10;*/
        //increments x by 10 and then assigns to y
        s1.registrationId=1290;
        s1.displayRegistrationId();


        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s=sc.nextLine();//Next line takes all of the line. next would take only one word
        System.out.println(a+" "+s);

    }
}