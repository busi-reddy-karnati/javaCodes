package com.lti.CaseStudy.Employee;

import java.util.List;
import java.util.Scanner;

/**
 * Created by busis on 2020-12-04.
 */
public class Employee {
    private int employeeNumber;
    private String employeeName;
    private String departmentName;

    public Employee setEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Employee Number, Name, DeptName");
        int eNo = sc.nextInt();
        String eName = sc.next();
        String dName = sc.next();
        Employee employee = new Employee();
        employee.setEmployeeNumber(eNo);
        employee.setEmployeeName(eName);
        employee.setDepartmentName(dName);
        return employee;
    }
    public void displayEmployees(List<Employee> employeeList){
        for(Employee employee:employeeList){
            System.out.println(employee.employeeNumber+" "+employee.employeeName+" "+employee.departmentName);
        }
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
