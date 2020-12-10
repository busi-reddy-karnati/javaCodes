package com.lti.CaseStudy.ComplaintManagement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by busis on 2020-12-08.
 */
public class FileToDataBase {
    public static void main(String[] args) {
        new FileToDataBase().addDataBase();
    }
    Connection con=null;
    PreparedStatement ps =null;
    public  void addIntoForeignTable(Set<String> set, String tableName){
        try{
            con=new Connector().createConnection();
            if(tableName.equals("issues"))
                ps=con.prepareStatement("Insert into issues values (?,?)");
            else if(tableName.equals("responses"))
                ps=con.prepareStatement("Insert into responses values (?,?)");
            else if(tableName.equals("companies"))
                ps=con.prepareStatement("Insert into companies values (?,?)");
            else
                ps=con.prepareStatement("INSERT INTO products VALUES (?,?)");
            int ind=1;
            for(String s: set){
                ps.setInt(1,ind);
                ps.setString(2, s);
                ps.executeUpdate();
                ind++;
            }
        } catch (SQLException e) {
            System.out.println("6");
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertIntoComplaints(String dateReceived, String product, String issue,
                                     String company, String dateSent, String response,
                                     String timelyResponse, int complaintId){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try{
            connection=new Connector().createConnection();
            preparedStatement=connection.prepareStatement("INSERT INTO complaints values (?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1,dateReceived);
            preparedStatement.setInt(2,new FileToDataBase().getProductId(product));
            preparedStatement.setInt(3,new FileToDataBase().getIssueId(issue));
            preparedStatement.setInt(4,new FileToDataBase().getCompanyId(company));
            preparedStatement.setString(5,dateSent);
            preparedStatement.setInt(6,new FileToDataBase().getResponseId(response));
            preparedStatement.setString(7,timelyResponse);
            preparedStatement.setInt(8, complaintId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("5");
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public int getResponseId(String response){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try{
            connection=new Connector().createConnection();
            preparedStatement=connection.prepareStatement("Select responseId from responses where response=?");
            preparedStatement.setString(1,response);
            resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("4");
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public int getProductId(String product){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try{
            connection=new Connector().createConnection();
            preparedStatement=connection.prepareStatement("Select productId from products where product=?");
            preparedStatement.setString(1,product);
            resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("1");
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public int getIssueId(String issue){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try{
            connection=new Connector().createConnection();
            preparedStatement=connection.prepareStatement("Select issueId from issues where issue=?");
            preparedStatement.setString(1,issue);
            resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("2");
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public int getCompanyId(String company){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try{
            connection=new Connector().createConnection();
            preparedStatement=connection.prepareStatement("Select companyId from companies where company=?");
            preparedStatement.setString(1,company);
            resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("3");
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void addDataBase(){
        /*
        This is based on optimized table structure
         */
        String csvUrl="C:\\Users\\busis\\Desktop\\LTI\\Java Projects\\HelloWorld\\src\\com\\lti\\CaseStudy\\ComplaintManagement\\data.csv";
        String line="";
        String splitBy=",";
        int n=0;
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(csvUrl));
            Set<String> productSet = new HashSet<String>();
            Set<String> responseSet = new HashSet<String>();
            Set<String> companySet = new HashSet<String>();
            Set<String> issueSet = new HashSet<String>();
            while ((line=bufferedReader.readLine())!=null){

                String[] entries = line.split(splitBy);
                int complaintId = Integer.parseInt(entries[8]);
                new FileToDataBase().insertIntoComplaints(entries[0],entries[1],
                        entries[2],entries[3],entries[4],entries[5],entries[6],complaintId);
               if(!productSet.contains(entries[1]))
                    productSet.add(entries[1]);
                if(!responseSet.contains(entries[5]))
                    responseSet.add(entries[5]);
                if(!companySet.contains(entries[3]))
                    companySet.add(entries[3]);
                if(!issueSet.contains(entries[2]))
                    issueSet.add(entries[2]);
                //This is used for making tables of issues, responses, products, companies

            }
            addIntoForeignTable(companySet,"companies");
            addIntoForeignTable(issueSet,"issues");
            addIntoForeignTable(productSet,"products");
            addIntoForeignTable(responseSet,"responses");
            //This is also used for creating foreign tables

        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
