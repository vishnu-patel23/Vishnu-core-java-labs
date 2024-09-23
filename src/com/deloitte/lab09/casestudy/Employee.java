package com.deloitte.lab09.casestudy;

import java.time.LocalDate;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate hireDate;
    private String designation;
    private double salary;
    private Integer managerId;
    private Department department;

    public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber,
                    LocalDate hireDate, String designation, double salary, Integer managerId, Department department) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.designation = designation;
        this.salary = salary;
        this.managerId = managerId;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public Department getDepartment() {
        return department;
    }
}