package com.example.wrapper;

import java.util.Arrays;

public class StudentMarksReportTask {
    
    public static void main(String[] args) {
        String[] marksArray = {"85", "90", "78", "92", "invalid", "88"};
        calculateAverageMarks(marksArray);
    }

    public static void calculateAverageMarks(String[] marks) {
        int totalMarks = 0;
        int validMarksCount = 0;

        for (String mark : marks) {
            try {
                Integer markValue = Integer.valueOf(mark);
                totalMarks += markValue;
                validMarksCount++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid mark encountered: " + mark);
            }
        }

        if (validMarksCount > 0) {
            double average = (double) totalMarks / validMarksCount;
            System.out.println("Average Marks: " + average);
        } else {
            System.out.println("No valid marks to calculate average.");
        }
    }
}