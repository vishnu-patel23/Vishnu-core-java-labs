package com.deloitte.lab04.ex02.com.cg.eis.pl;

import com.deloitte.lab04.ex02.com.cg.eis.service.EmployeeService;
import com.deloitte.lab04.ex02.com.cg.eis.service.EmployeeServiceImp;
import com.deloitte.lab04.ex02.com.cg.eis.bean.Employee;

public class EmployeeInsuranceSystem {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImp();

        // Get employee details from user
        Employee employee = employeeService.getEmployeeDetails();

        // Display employee details
        employeeService.displayEmployeeDetails(employee);
    }
}

