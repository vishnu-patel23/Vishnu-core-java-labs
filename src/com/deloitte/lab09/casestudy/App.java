package com.deloitte.lab09.casestudy;

import java.util.List;

public class App {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();
        EmployeeService service = new EmployeeService(repository);

        // 1. Total Salary
        System.out.println("Total Salary: " + service.sumOfSalaries());

        // 2. Employee Count in Departments
        System.out.println("Employee Count in Departments: " + service.countEmployeesInEachDepartment());

        // 3. Senior Most Employee
        Employee seniorMost = service.seniorMostEmployee();
        System.out.println("Senior Most Employee: " + (seniorMost != null ? seniorMost.getFirstName() + " " + seniorMost.getLastName() : "None"));

        // 4. Employee Service Duration
        System.out.println("Employee Service Duration: ");
        service.serviceDuration().forEach(System.out::println);

        // 5. Employees without Department
        System.out.println("Employees without Department: ");
        service.employeesWithoutDepartment().forEach(e -> 
            System.out.println(e.getFirstName() + " " + e.getLastName())
        );

        // 6. List Departments without Employees
        System.out.println("Departments without Employees: ");
        List<Department> departments = List.of(
            new Department(1, "Sales", 100),
            new Department(2, "HR", 101),
            new Department(3, "Marketing", 102)
        );
        service.departmentsWithoutEmployees(departments).forEach(d -> 
            System.out.println(d.getDepartmentName())
        );

        // 7. Employee Name, Hire Date, and Day of Week
        System.out.println("Employee Name, Hire Date, and Day of Week: ");
        service.employeeHireDateAndDay().forEach(System.out::println);

        // 8. Employees Started on a Specific Day
        System.out.println("Employees Started on FRIDAY: ");
        service.employeesStartedOnDay("FRIDAY").forEach(System.out::println);

        // 9. Employee Names and their Managers
        System.out.println("Employees and their Managers: ");
        service.employeeReportsToManager().forEach(System.out::println);

        // 10. Employee Name and Salary Increased by 15%
        System.out.println("Employee Name and Salary Increased by 15%: ");
        service.salaryIncrease().forEach(System.out::println);

        // 11. Employees Without Manager
        System.out.println("Employees Without Manager: ");
        service.employeesWithoutManager().forEach(e -> 
            System.out.println(e.getFirstName() + " " + e.getLastName())
        );

        // 12. Subordinates of a Manager
        System.out.println("Subordinates of Manager John Doe: ");
        service.subordinatesOfManager("John", "Doe").forEach(System.out::println);

        // 13. Sort Employees by Employee ID
        System.out.println("Employees Sorted by Employee ID: ");
        service.sortByEmployeeId().forEach(e -> 
            System.out.println(e.getEmployeeId() + ": " + e.getFirstName())
        );

        // 14. Sort Employees by Department ID
        System.out.println("Employees Sorted by Department ID: ");
        service.sortByDepartmentId().forEach(e -> 
            System.out.println(e.getEmployeeId() + ": " + e.getFirstName() + " - " + (e.getDepartment() != null ? e.getDepartment().getDepartmentId() : "No Department"))
        );

        // 15. Sort Employees by First Name
        System.out.println("Employees Sorted by First Name: ");
        service.sortByFirstName().forEach(e -> 
            System.out.println(e.getFirstName() + " " + e.getLastName())
        );
    }
}
