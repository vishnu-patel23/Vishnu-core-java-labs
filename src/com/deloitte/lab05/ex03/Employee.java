package com.deloitte.lab05.ex03;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void validateSalary() throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary must be at least 3000.");
        }
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}