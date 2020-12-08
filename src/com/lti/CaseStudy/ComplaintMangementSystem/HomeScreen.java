package com.lti.CaseStudy.ComplaintMangementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by busis on 2020-12-08.
 */
public class HomeScreen {
    public static void main(String[] args) {
        System.out.println("Welcome to Complaints Management");
        new FiletoDatabase().addToDatabase();
        while(true) {
            System.out.println("Press 1: Display complaints according to the year");
            System.out.println("2: Display complaints of the bank");
            System.out.println("3: Display complaints based on complaint Id");
            System.out.println("4: Display number of days took to resolve");
            System.out.println("5: Display all complaints closed/closed with explanation");
            System.out.println("6: Display all the complaints that received timely response");
            System.out.println("7: Add new Complaints");
            System.out.println("0:exit");
            Scanner scanner = new Scanner(System.in);
            int option;
            option = scanner.nextInt();
            switch (option){
                case 1:
                    displayAccordingToYear();
                    break;
                case 2:
                    displayAccordingToBank();
                    break;
                case 3:
                    displayAccordingToComplaintId();
                    break;
                case 4:
                    displayNumberOfDaysToResolve();
                    break;
                case 5:
                    displayComplaintsClosed();
                    break;
                case 6:
                    displayComplaintsTimelyResponse();
                    break;
                case 7:
                    addComplaint();
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option. Try Again");

            }
        }
    }

    //done
    private static void displayAccordingToYear() {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Give Year to search");
        year = scanner.nextInt();
        String yearString = Integer.toString(year);
        String likeString = "______"+yearString;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Connection connection=null;
        try {
            connection = new Connector().createConnection();
            preparedStatement = connection.prepareStatement("SELECT ComplaintId, company from complaints where Datesent like ?");
            preparedStatement.setString(1,likeString);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("Complaint ID: "+resultSet.getInt(1)+" Company: "+resultSet.getString(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    //Done
    private static void displayAccordingToBank(){
        System.out.println("Give name of the bank");
        Scanner scanner = new Scanner(System.in);
        String bankName = scanner.nextLine();
        Connection connection=new Connector().createConnection();
        PreparedStatement preparedStatement=null;
        try{
            preparedStatement=connection.prepareStatement("Select product,issue from complaints where company=?");
            preparedStatement.setString(1,bankName);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Results for the bank"+bankName);
            while(resultSet.next()){
                System.out.println("Product: "+resultSet.getString(1)+" Issue: "+resultSet.getString(2));
            }
        }
        catch (SQLException e) {
            System.out.println("SQL Exception");
            e.printStackTrace();
        }
    }


    //Done
    private static void displayAccordingToComplaintId(){
        System.out.println("Give Complaint Id");
        Scanner scanner = new Scanner(System.in);
        int complaintId = scanner.nextInt();
        Connection connection=new Connector().createConnection();
        PreparedStatement preparedStatement=null;
        try{
            preparedStatement=connection.prepareStatement("Select product,issue from complaints where ComplaintId=?");
            preparedStatement.setInt(1, complaintId);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Results for Complaint ID: "+complaintId);
            while(resultSet.next()){
                System.out.println("Product: "+resultSet.getString(1)+" Issue: "+resultSet.getString(2));
            }
        }
         catch (SQLException e) {
            System.out.println("SQL Exception");
            e.printStackTrace();
        }

    }

    //done
    private static void displayNumberOfDaysToResolve(){
        System.out.println("Give the Bank Name to know how many days they took to resolve");
        Scanner scanner=new Scanner(System.in);
        String bankName=scanner.nextLine();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        Connection connection=null;
        try{
            connection=new Connector().createConnection();
            preparedStatement=connection.prepareStatement("SELECT ComplaintId, Datesent, Daterecieved from complaints where company=?");
            preparedStatement.setString(1,bankName);
            resultSet=preparedStatement.executeQuery();
            System.out.println("The information of the Given bank");
            while (resultSet.next()){
                String s1=resultSet.getString(2);
                String s2 = resultSet.getString(3);
                long differenceInDays = differenceInDays(s1,s2);
                System.out.println("Complaint Id: "+resultSet.getInt(1)+" Days To resolve: "+differenceInDays);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static long differenceInDays(String s1,String s2){
        DateFormat format = new SimpleDateFormat("MM/DD/yyyy");
        long diff=100L;
        try {
            Date date1 = format.parse(s1);
            Date date2 = format.parse(s2);
            diff = date1.getTime()-date2.getTime();
            return (diff/(1000*3600*24))%365;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return diff;
    }


    //Done
    private static void displayComplaintsClosed(){
        System.out.println("These are the Complaints closed/ closes with explanation");
        Connection connection = null;
        ResultSet resultSet=null;
        PreparedStatement preparedStatement=null;
        try{
            connection=new Connector().createConnection();
            preparedStatement=connection.prepareStatement("Select product, issue, ComplaintId, company from complaints where companyresponse in (?,?)");
            preparedStatement.setString(1,"Closed");
            preparedStatement.setString(2,"Closed with explanation");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("product: "+resultSet.getString(1)+" Issue: "+resultSet.getString(2)+" Complaint id: "+resultSet.getInt(3)+" Company Name: "+resultSet.getString(4));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
            System.out.println("SQL Exception occured");
        }
    }


    //done
    private static void addComplaint(){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection=new Connector().createConnection();
            preparedStatement = connection.prepareStatement("Insert into complaints VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            System.out.println("Complaint ID:");
            int complaintId;
            Scanner scanner=new Scanner(System.in);
            complaintId=scanner.nextInt();
            preparedStatement.setInt(14,complaintId);
            String buffer;
            System.out.println("Date Received");
            buffer=scanner.next();
            preparedStatement.setString(2, buffer);
            System.out.println("product");
            buffer=scanner.nextLine();
            preparedStatement.setString(3, buffer);
            System.out.println("Sub Product");
            buffer=scanner.nextLine();
            preparedStatement.setString(4, buffer);
            System.out.println("Issue");
            buffer=scanner.nextLine();
            preparedStatement.setString(5, buffer);
            System.out.println("Sub Issue");
            buffer=scanner.nextLine();
            preparedStatement.setString(6, buffer);
            System.out.println("Company");
            buffer=scanner.nextLine();
            preparedStatement.setString(7, buffer);
            System.out.println("State");
            buffer=scanner.nextLine();
            preparedStatement.setString(8, buffer);
            System.out.println("ZipCode");
            buffer=scanner.nextLine();
            preparedStatement.setString(9, buffer);
            System.out.println("Submitted Via");
            buffer=scanner.nextLine();
            preparedStatement.setString(10,buffer);
            System.out.println("Date Sent");
            buffer=scanner.nextLine();
            preparedStatement.setString(11,buffer);
            System.out.println("Company Response");
            buffer=scanner.nextLine();
            preparedStatement.setString(12,buffer);
            System.out.println("Consumer Disputed");
            buffer=scanner.nextLine();
            preparedStatement.setString(13,buffer);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("SQL Exception");
            e.printStackTrace();
        }
    }


    //Done
    private static void displayComplaintsTimelyResponse(){
        System.out.println("These are the complaints that received a timely response");
        PreparedStatement preparedStatement=null;
        ResultSet resultSet = null;
        Connection connection=null;
        try{
            connection=new Connector().createConnection();
            preparedStatement = connection.prepareStatement("Select ComplaintId, company, issue from complaints where timelyresponse=?");
            preparedStatement.setString(1,"Yes");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println("Complaint id: "+resultSet.getInt(1)+" Company: "+resultSet.getString(2)+" Issue"+resultSet.getString(3));

            }


        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL Exception");
        }
    }



}
