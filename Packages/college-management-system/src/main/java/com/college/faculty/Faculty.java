package com.college.faculty;

public class Faculty {
    private String name;
    private String subject;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void displayDetails() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }
}