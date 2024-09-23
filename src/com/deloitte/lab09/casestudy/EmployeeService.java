package com.deloitte.lab09.casestudy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {
    private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    // 1. Find the sum of salary of all employees
    public double sumOfSalaries() {
        return repository.getEmployees().stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }

    // 2. List out department names and count of employees in each department
    public Map<String, Long> countEmployeesInEachDepartment() {
        return repository.getEmployees().stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment() != null ? e.getDepartment().getDepartmentName() : "No Department", Collectors.counting()));
    }

    // 3. Find out the senior most employee of an organization
    public Employee seniorMostEmployee() {
        return repository.getEmployees().stream()
                .min(Comparator.comparing(Employee::getHireDate))
                .orElse(null);
    }

    // 4. List employee name and duration of their service in months and days
    public List<String> serviceDuration() {
        return repository.getEmployees().stream()
                .map(e -> e.getFirstName() + " " + e.getLastName() + " - " +
                        ChronoUnit.MONTHS.between(e.getHireDate(), LocalDate.now()) + " months " +
                        ChronoUnit.DAYS.between(e.getHireDate().plusMonths(ChronoUnit.MONTHS.between(e.getHireDate(), LocalDate.now())), LocalDate.now()) + " days")
                .collect(Collectors.toList());
    }

    // 5. Find out employees without department
    public List<Employee> employeesWithoutDepartment() {
        return repository.getEmployees().stream()
                .filter(e -> e.getDepartment() == null)
                .collect(Collectors.toList());
    }

    // 6. Find out department without employees
    public List<Department> departmentsWithoutEmployees(List<Department> departments) {
        return departments.stream()
                .filter(d -> repository.getEmployees().stream()
                        .noneMatch(e -> e.getDepartment() != null && e.getDepartment().getDepartmentId() == d.getDepartmentId()))
                .collect(Collectors.toList());
    }

    // 7. List employee name, hire date and day of week on which employee has started
    public List<String> employeeHireDateAndDay() {
        return repository.getEmployees().stream()
                .map(e -> e.getFirstName() + " " + e.getLastName() + " - " + e.getHireDate() + " (" + e.getHireDate().getDayOfWeek() + ")")
                .collect(Collectors.toList());
    }

    // 8. List employee name, hire date and day of week for employees started on a specific day
    public List<String> employeesStartedOnDay(String day) {
        return repository.getEmployees().stream()
                .filter(e -> e.getHireDate().getDayOfWeek().name().equalsIgnoreCase(day))
                .map(e -> e.getFirstName() + " " + e.getLastName() + " - " + e.getHireDate())
                .collect(Collectors.toList());
    }

    // 9. List employee names and their managers
    public List<String> employeeReportsToManager() {
        return repository.getEmployees().stream()
                .filter(e -> e.getManagerId() != null)
                .map(e -> e.getFirstName() + " reports to manager ID " + e.getManagerId())
                .collect(Collectors.toList());
    }

    // 10. List employee name, salary and salary increased by 15%
    public List<String> salaryIncrease() {
        return repository.getEmployees().stream()
                .map(e -> e.getFirstName() + " " + e.getSalary() + " -> " + (e.getSalary() * 1.15))
                .collect(Collectors.toList());
    }

    // 11. Find employees who didn’t report to anyone
    public List<Employee> employeesWithoutManager() {
        return repository.getEmployees().stream()
                .filter(e -> e.getManagerId() == null)
                .collect(Collectors.toList());
    }

    // 12. List all subordinates of a manager given the manager's name
    public List<String> subordinatesOfManager(String firstName, String lastName) {
        Integer managerId = findManagerId(firstName, lastName);
        return repository.getEmployees().stream()
                .filter(e -> e.getManagerId() != null && e.getManagerId().equals(managerId))
                .map(e -> e.getFirstName() + " " + e.getLastName())
                .collect(Collectors.toList());
    }

    // Helper method to find manager ID
    private Integer findManagerId(String firstName, String lastName) {
        return repository.getEmployees().stream()
                .filter(e -> e.getFirstName().equals(firstName) && e.getLastName().equals(lastName))
                .map(Employee::getEmployeeId)
                .findFirst()
                .orElse(null);
    }

    // 13. Sort employees by employee id
    public List<Employee> sortByEmployeeId() {
        return repository.getEmployees().stream()
                .sorted(Comparator.comparingInt(Employee::getEmployeeId))
                .collect(Collectors.toList());
    }

    // 14. Sort employees by department id
    public List<Employee> sortByDepartmentId() {
        return repository.getEmployees().stream()
                .sorted(Comparator.comparing(e -> e.getDepartment() != null ? e.getDepartment().getDepartmentId() : Integer.MAX_VALUE))
                .collect(Collectors.toList());
    }

    // 15. Sort employees by first name
    public List<Employee> sortByFirstName() {
        return repository.getEmployees().stream()
                .sorted(Comparator.comparing(Employee::getFirstName))
                .collect(Collectors.toList());
    }
}
