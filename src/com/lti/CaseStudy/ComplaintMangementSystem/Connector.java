package com.lti.CaseStudy.ComplaintMangementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by busis on 2020-12-07.
 */
public class Connector {
    public Connection createConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Connection Unsuccessful");
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lti", "root", "tuningfork1212");
        } catch (SQLException e) {
            System.out.println("Error with SQL");
            e.printStackTrace();
        }
        return con;
    }
}
