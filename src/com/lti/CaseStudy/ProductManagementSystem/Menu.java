package com.lti.CaseStudy.ProductManagementSystem;

import java.util.Scanner;

/**
 * Created by busis on 2020-12-07.
 */
public class Menu {
    public static void main(String[] args) {
        System.out.println("Welcome to Management System");
        while(true){
            System.out.println("1: Product");
            System.out.println("2: Stock");
            System.out.println("3: Exit");
            int option;
            Scanner scanner = new Scanner(System.in);
            option=scanner.nextInt();
            if(option==1)
                productScreen();
            else if(option==2)
                stockScreen();
            else if(option==3)
                System.exit(0);
            else
                System.out.println("Invalid Option entered, Try Again!");


        }
    }

    private static void productScreen() {
        System.out.println("1: Add product");
        System.out.println("2. Delete Product");
        System.out.println("3. Update Stock ");
        int option;
        Scanner scanner = new Scanner(System.in);
        option=scanner.nextInt();
        if(option==1){
            System.out.println("Give ProdId, ProductName, Price, Quantity");
            int prodId,price,quantity;
            String productName;
            prodId=scanner.nextInt();
            productName=scanner.next();
            price=scanner.nextInt();
            quantity=scanner.nextInt();
            Product product=new Product();
            product.addProduct(prodId, productName, price, quantity);
        }
        else if(option ==2){
            System.out.println("Give ProdId");
            int productId;
            productId=scanner.nextInt();
            new Product().removeProduct(productId);

        }
        else if(option==3){
            int quantity;
            int productId;
            System.out.println("Give product id, quantity");
            productId=scanner.nextInt();
            quantity=scanner.nextInt();
            new Product().updateStock(productId,quantity);
        }
        else{
            System.out.println("invalid Option Entered");
        }


    }


    private static void stockScreen(){
        System.out.println("1: Add sales");
        int option;
        Scanner scanner=new Scanner(System.in);
        option=scanner.nextInt();
        if(option==1){
            System.out.println("Give Product ID, Quantity");
            int productId=scanner.nextInt();
            int quantity=scanner.nextInt();
            new Sales().addSales(productId,quantity);
            System.out.println("Sales Added");
        }
        else{
            System.out.println("Invalid option. Try again!");
        }

    }
}
