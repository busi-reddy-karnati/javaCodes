package com.lti.JDBCT;
import java.sql.*;
/**
 * Created by busis on 2020-12-05.
 *
 *
 */
/*
File->projectStructure->dependencies->add
 */
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        //Load the driver. We have different drivers for different Databases types
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lti","root","tuningfork1212");
            //This establishes a connection


            Statement stmnt = con.createStatement();
            //This creates a statement


            ResultSet rs = stmnt.executeQuery("SELECT * from test");
            //This is the query executes


            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            int n=1;
            String s="Sehwag";
            String SQL = "INSERT INTO Test values (3,\"Sehwag\")";
            PreparedStatement psmt = con.prepareStatement(SQL);
            int affr = psmt.executeUpdate();
            //Prepared statement is used for updates
            //All the DML should use Prepared statement

            rs = stmnt.executeQuery("SELECT * from test");
            //This is the query executes
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
}
