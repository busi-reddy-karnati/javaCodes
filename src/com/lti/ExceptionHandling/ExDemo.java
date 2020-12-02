package com.lti.ExceptionHandling;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by busis on 2020-12-02.
 */
public class ExDemo {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        int x=arr[2]/0;//This is an exception
        int u=arr[12]/3;//This is also an exception
        System.out.println(u);
        System.out.println(x);
    }
}

class ExDemo2{
    void connectMe() throws SQLException{
        Connection connection;
    }

    public static void main(String[] args) {
        try {
            new ExDemo2().connectMe();
        }
        catch (SQLException e){
            e.printStackTrace();//To understand the exception further
        }
    }
}