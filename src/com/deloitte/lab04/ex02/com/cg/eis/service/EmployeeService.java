package com.deloitte.lab04.ex02.com.cg.eis.service;

import com.deloitte.lab04.ex02.com.cg.eis.bean.Employee;


public interface EmployeeService {
    Employee getEmployeeDetails();
    void displayEmployeeDetails(Employee employee);
}

