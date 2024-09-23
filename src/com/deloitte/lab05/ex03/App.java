package com.deloitte.lab05.ex03;

/*
 * Exercise 3:  Create an Exception class named as “EmployeeException”(User defined Exception) in a 
 * package named as “com.cg.eis.exception” and throw an exception if salary of an employee is below than 3000. 
 * Use Exception Handling mechanism to handle exception properly.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        
        Employee employee = new Employee(name, salary);
        scanner.close();
        try {
            employee.validateSalary();
            System.out.println("Employee " + employee.getName() + " has a valid salary: " + employee.getSalary());
        } catch (EmployeeException e) {
            System.out.println("Invalid salary: " + e.getMessage());
        }
    }
}
