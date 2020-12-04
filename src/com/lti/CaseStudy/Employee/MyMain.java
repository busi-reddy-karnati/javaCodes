package com.lti.CaseStudy.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by busis on 2020-12-04.
 */
public class MyMain {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        while(true){
            System.out.println("1: Insert an Employee");
            System.out.println("2: show Employees");
            System.out.println("3:Exit");
            Scanner scanner = new Scanner(System.in);
            int option;
            option = scanner.nextInt();
            switch(option){
                case 1:
                    employeeList.add(new Employee().setEmployee());
                    break;
                case 2:
                    new Employee().displayEmployees(employeeList);
                    break;
                case 3:
                    System.exit(0);

                    default:
                        System.out.println("Invalid Option");
            }
        }
    }
}
