package com.deloitte.lab09.casestudy;

public class Department {
    private int departmentId;
    private String departmentName;
    private Integer managerId;

    public Department(int departmentId, String departmentName, Integer managerId) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.managerId = managerId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Integer getManagerId() {
        return managerId;
    }
}
