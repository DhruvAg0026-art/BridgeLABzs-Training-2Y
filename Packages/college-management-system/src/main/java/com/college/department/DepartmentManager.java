package com.college.department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentManager {
    private List<Department> departments;

    public DepartmentManager() {
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void displayDepartments() {
        for (Department department : departments) {
            System.out.println("Department Name: " + department.getName());
            System.out.println("Department Head: " + department.getHead());
            System.out.println("---------------------------");
        }
    }
}