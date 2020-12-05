package com.lti.JDBCT;
import java.sql.*;
import java.util.Scanner;

/**
 * Created by busis on 2020-12-05.
 *
 *
 */
/*
File->projectStructure->dependencies->add
 */
public class JDBCDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        //Load the driver. We have different drivers for different Databases types
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lti","root","tuningfork1212");


            Statement stmnt = con.createStatement();


            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            String s = sc.next();
            int res = stmnt.executeUpdate("Insert into test values ("+a+","+s+");");
            //THis is one way to insert into the table
            //But this is complex, so we will have to use preparedStatements to pass parameters
            ResultSet rs = stmnt.executeQuery("SELECT * from test");
            //This is the query executes
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
