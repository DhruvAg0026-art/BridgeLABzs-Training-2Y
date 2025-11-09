package com.college.department;

public class Department {
    private String departmentName;
    private String head;

    public Department(String departmentName, String head) {
        this.departmentName = departmentName;
        this.head = head;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getHead() {
        return head;
    }

    public void displayDepartmentInfo() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Head of Department: " + head);
    }
}