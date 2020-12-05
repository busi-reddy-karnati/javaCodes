package com.lti.JDBCT;

        import java.sql.*;
        import java.util.Scanner;

/**
 * Created by busis on 2020-12-05.
 */
public class JDBCDemo2 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/lti","root","tuningfork1212");
            statement = connection.createStatement();
            CallableStatement callableStatement = connection.prepareCall("{ call stoPro()}");
            //We can use ? also in this
            callableStatement.execute();
        }
         catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
