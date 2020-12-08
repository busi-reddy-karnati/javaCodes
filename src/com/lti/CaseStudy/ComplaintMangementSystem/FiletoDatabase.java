package com.lti.CaseStudy.ComplaintMangementSystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by busis on 2020-12-08.
 */
public class FiletoDatabase {
    public static void addToDatabase() {
        //We can still optimise the number of columns and do a normalization
        Connection connection=new Connector().createConnection();
        PreparedStatement preparedStatement = null;
        BufferedReader br = null;
        String line="";
        String cvSplit=",";
        try{
            preparedStatement=connection.prepareStatement("Insert into complaints VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            br=new BufferedReader(new FileReader("complaints1.csv"));
            if((line=br.readLine())!=null){
                System.out.println("Took the row with column name");
            }
            while((line=br.readLine())!=null){
                String[] input = line.split(cvSplit);
                preparedStatement.setInt(14,Integer.parseInt(input[13]));
                preparedStatement.setString(1,input[0]);
                preparedStatement.setString(2,input[1]);
                preparedStatement.setString(3,input[2]);
                preparedStatement.setString(4,input[3]);
                preparedStatement.setString(5,input[4]);
                preparedStatement.setString(6,input[5]);
                preparedStatement.setString(7,input[6]);
                preparedStatement.setString(8,input[7]);
                preparedStatement.setString(9,input[8]);
                preparedStatement.setString(10,input[9]);
                preparedStatement.setString(11,input[10]);
                preparedStatement.setString(12,input[11]);
                preparedStatement.setString(13,input[12]);
                preparedStatement.executeUpdate();
            }

        }
        catch (FileNotFoundException f){
            System.out.println("File Unavailable");

        }
        catch (SQLException e){
            System.out.println("Exception occured with SQL");
        } catch (IOException e) {
            System.out.println("IO Exception");
            e.printStackTrace();
        }

    }
}
