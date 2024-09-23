package com.deloitte.lab04.ex02.com.cg.eis.service;


import com.deloitte.lab04.ex02.com.cg.eis.bean.Employee;

import java.util.Scanner;


public class EmployeeServiceImp implements EmployeeService {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Employee getEmployeeDetails() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Employee Designation: ");
        String designation = scanner.nextLine();
        return new Employee(id, name, salary, designation);
    }

    @Override
    public void displayEmployeeDetails(Employee employee) {
        System.out.println(employee.displayDetails());
    }
}