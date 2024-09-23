package com.deloitte.lab04.ex02.com.cg.eis.bean;


public class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    // Constructor
    public Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = determineInsuranceScheme(salary, designation);
    }

    // Method to determine insurance scheme
    private String determineInsuranceScheme(double salary, String designation) {
        if (salary < 30000) {
            return "No Insurance";
        } else if (salary >= 30000 && salary < 60000) {
            return "Scheme A";
        } else {
            return "Scheme B";
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }

    // Method to display employee details
    public String displayDetails() {
        return "Employee ID: " + id + "\n" +
               "Name: " + name + "\n" +
               "Salary: " + salary + "\n" +
               "Designation: " + designation + "\n" +
               "Insurance Scheme: " + insuranceScheme;
    }
}
