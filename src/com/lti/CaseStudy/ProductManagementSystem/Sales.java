package com.lti.CaseStudy.ProductManagementSystem;

import java.sql.*;

/**
 * Created by busis on 2020-12-07.
 */
public class Sales {
    public void addSales(int productId, int quantity){
        Connection con = new Connector().createConnection();
        int billNo;
        PreparedStatement preparedStatement;
        int qtypresent;
        Statement stmnt = null;
        try {
            stmnt = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            ResultSet rs = stmnt.executeQuery("SELECT IFNULL(MAX(billno),0) from sales");
            if(rs.next())
            billNo=rs.getInt(1);
            else
            billNo=0;
            billNo+=1;
            //billNo works fine
            preparedStatement = con.prepareStatement("SELECT Qty from product where prodId=?");
            preparedStatement.setInt(1,productId);
            rs = preparedStatement.executeQuery();
            if(rs.next())
            qtypresent = rs.getInt(1);
            else {
                System.out.println("That productId doesn't exist in the table");
                return;
            }
            preparedStatement=con.prepareStatement("SELECT price from product where ProdId=?");
            preparedStatement.setInt(1,productId);
            rs = preparedStatement.executeQuery();
            int price;
            if(rs.next())
            price=rs.getInt(1);
            else{
                System.out.println("Check the product Id. and try again");
                return;
            }

            if(qtypresent<quantity){
                System.out.println("Quantity Number Error");
                return;
            }
            preparedStatement = con.prepareStatement("UPDATE product set Qty = Qty-? where ProdId = ? ");
            preparedStatement.setInt(1,quantity);
            preparedStatement.setInt(2,productId);
            preparedStatement.executeUpdate();
            preparedStatement = con.prepareStatement("INSERT INTO sales values(?,?,?,?)");
            preparedStatement.setInt(1,billNo);
            preparedStatement.setInt(2,productId);
            preparedStatement.setInt(3,quantity);
            preparedStatement.setInt(4,quantity*price);
            preparedStatement.executeUpdate();
            System.out.println("Inserted into Sales Table");


        } catch (SQLException e) {
            System.out.println();
            e.printStackTrace();
        }


    }
}
