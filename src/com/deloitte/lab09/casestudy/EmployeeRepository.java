package com.deloitte.lab09.casestudy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private List<Employee> employees;

    public EmployeeRepository() {
        this.employees = new ArrayList<>();
        populateData();
    }

    private void populateData() {
        Department sales = new Department(1, "Sales", 100);
        Department hr = new Department(2, "HR", 101);

        employees.add(new Employee(1, "Ram", "Charan", "ram@example.com", "1234567890",
                LocalDate.of(2020, 1, 15), "Manager", 60000, null, sales));
        employees.add(new Employee(2, "Rahul", "Jain", "jain@example.com", "0987654321",
                LocalDate.of(2019, 6, 20), "Executive", 40000, 1, sales));
        employees.add(new Employee(3, "Sonu", "Sol", "sonu@example.com", "1122334455",
                LocalDate.of(2021, 3, 25), "Executive", 45000, 1, hr));
        employees.add(new Employee(4, "Tony", "tony", "tony@example.com", "2233445566",
                LocalDate.of(2022, 7, 10), "Analyst", 38000, 2, null));
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
