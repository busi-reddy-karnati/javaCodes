package com.lti.CaseStudy.ProductManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by busis on 2020-12-07.
 */
public class Product {
    public void addProduct(int productId, String productName, int price,int quantity){
        Connection con = new Connector().createConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement("Insert into product values (?,?,?,?)");
            preparedStatement.setInt(1,productId);
            preparedStatement.setString(2, productName);
            preparedStatement.setInt(3, price);
            preparedStatement.setInt(4,quantity);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error While adding product");
        }
        System.out.println("product Added");
    }
    public void removeProduct(int productId){
        Connection con = new Connector().createConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement("DELETE from product where ProdId=?");
            preparedStatement.setInt(1,productId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error while deleting product");
        }
        System.out.println("Product Deleted");
    }
    public void updateStock(int productId, int quantity){
        Connection con = new Connector().createConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement("UPDATE product set Qty = Qty+? where ProdId = ? ");
            preparedStatement.setInt(1,quantity);
            preparedStatement.setInt(2,productId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error while updating quantity");
        }
        System.out.println("Quantity added");
    }
}
