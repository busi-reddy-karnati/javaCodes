package com.lti.CaseStudy.ComplaintManagement;

import java.util.Scanner;

/**
 * Created by busis on 2020-12-08.
 */
public class MainPage {
    public static void main(String[] args) {
        //Call the FileToDataBase main method's constituents to build the database
        //Since I have already done that , I won't be doing that again

        //new FileToDatabase.addDataBase();
        System.out.println("Welcome To Complaints Portal");
        while (true){
            System.out.println("1: Display by year");
            System.out.println("2: Display by Bank Name");
            System.out.println("3: Display by complaint ID");
            System.out.println("4: Display number of days the bank took");
            System.out.println("5: Display closed complaints");
            System.out.println("6: Display complaints received timely response");
            System.out.println("7: Take a New Complaint");
            System.out.println("0: Exit");
            int option;
            Scanner scanner=new Scanner(System.in);
            option=scanner.nextInt();
            switch (option){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    new DisplayPage().displayByYear();
                    break;
                case 2:
                    new DisplayPage().displayByBankName();
                    break;
                case 3:
                    new DisplayPage().displayByComplaintId();
                    break;
                case 4:
                    new DisplayPage().displayNumberOfDaysBankTook();
                    break;
                case 5:
                    new DisplayPage().displayClosedComplaints();
                    break;
                case 6:
                    new DisplayPage().displayComplaintsReceivedTimelyResponse();
                    break;
                case 7:
                    new InputComplaint().takeComplaintInfo();
                    break;
                default:
                    System.out.println("Seems you have entered a wrong number. Try again");
            }
        }
    }
}
