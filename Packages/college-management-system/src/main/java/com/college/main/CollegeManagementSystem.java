package com.college.main;

import com.college.student.StudentManager;
import com.college.faculty.FacultyManager;
import com.college.department.DepartmentManager;

public class CollegeManagementSystem {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        FacultyManager facultyManager = new FacultyManager();
        DepartmentManager departmentManager = new DepartmentManager();

        System.out.println("College Management System");
        System.out.println("=========================");

        studentManager.displayStudents();
        facultyManager.displayFaculties();
        departmentManager.displayDepartments();
    }
}