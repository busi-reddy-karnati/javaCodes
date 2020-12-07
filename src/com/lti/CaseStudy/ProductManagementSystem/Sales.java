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
            billNo=rs.getInt(1)+1;
            rs = stmnt.executeQuery("SELECT Qty from sales where ProId="+productId+";");
            qtypresent = rs.getInt(1);
            rs = stmnt.executeQuery("SELECT price from sales where ProId="+productId+";");
            int price=rs.getInt(1);
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



        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
