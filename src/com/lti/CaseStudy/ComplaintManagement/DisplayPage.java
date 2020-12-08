package com.lti.CaseStudy.ComplaintManagement;

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
public class DisplayPage {
    public void displayByYear() {
        System.out.println("Year:?");
        int year;
        Scanner scanner=new Scanner(System.in);
        year = scanner.nextInt();
        String likeString = "______"+Integer.toString(year);
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try{
            connection=new Connector().createConnection();
            preparedStatement=connection.prepareStatement("Select * from complaints where DateReceived like ?");
            preparedStatement.setString(1,likeString);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.print("Complaint ID: " + resultSet.getInt(8));
                System.out.print(" ProductID:" + resultSet.getInt(2));
                System.out.print("CompanyID: " + resultSet.getInt(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayByBankName() {
        System.out.println("Bank Name:?");
        String bank;
        Scanner scanner=new Scanner(System.in);
        bank = scanner.nextLine();
        //For refactor
        int bankId=0;
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try{
            connection=new Connector().createConnection();
            preparedStatement=connection.prepareStatement("Select * from complaints where company = ?");
            preparedStatement.setInt(1, bankId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.print("Complaint ID: " + resultSet.getInt(8));
                System.out.print(" ProductID:" + resultSet.getInt(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayByComplaintId() {
        System.out.println("Complaint Id:?");
        int id;
        Scanner scanner=new Scanner(System.in);
        id=scanner.nextInt();
        //For refactor
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try{
            connection=new Connector().createConnection();
            preparedStatement=connection.prepareStatement("Select * from complaints where complaintid = ?");
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.print("Complaint ID: " + resultSet.getInt(8));
                System.out.print(" ProductID:" + resultSet.getInt(2));
                System.out.print("CompanyID: " + resultSet.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayNumberOfDaysBankTook() {
        System.out.println("Bank Name:?");
        String bankName;
        Scanner scanner=new Scanner(System.in);
        bankName=scanner.nextLine();
        int bankId=0;
        //This is to be derived in revision-3

        Connection connection=null;
        ResultSet resultSet=null;
        PreparedStatement preparedStatement=null;
        try{
            connection=new Connector().createConnection();
            preparedStatement=connection.prepareStatement("Select datesent,DateReceived,complaintid from complaints WHERE company = ?");
            preparedStatement.setInt(1,bankId);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                long ans=new DisplayPage().differenceInDays(resultSet.getString(1),resultSet.getString(2));
                System.out.println("Complaint Id: "+resultSet.getInt(3)+" Days took to resolve: "+ans);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static long differenceInDays(String s1,String s2){
        s1=s1.replace('-','/');
        s2=s2.replace('-','/');
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
    public void displayClosedComplaints() {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try{
            connection=new Connector().createConnection();
            preparedStatement=connection.prepareStatement("Select * from complaints where companyresponse=0");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.print("Complaint ID: " + resultSet.getInt(8));
                System.out.print(" ProductID:" + resultSet.getInt(2));
                System.out.print("CompanyID: " + resultSet.getInt(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayComplaintsReceivedTimelyResponse() {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try{
            connection=new Connector().createConnection();
            //refactor it in rev3
            preparedStatement=connection.prepareStatement("Select * from complaints where timelyresponse=0 or timelyresponse=1");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.print("Complaint ID: " + resultSet.getInt(8));
                System.out.print(" ProductID:" + resultSet.getInt(2));
                System.out.print("CompanyID: " + resultSet.getInt(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
