package com.example.wrapper;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDataProcessingTask {
    
    public static void main(String[] args) {
        int[] employeeAges = {25, 30, 22, 45, 28};
        List<Integer> ageList = convertArrayToList(employeeAges);
        
        Integer youngest = findYoungest(ageList);
        Integer oldest = findOldest(ageList);
        
        System.out.println("Youngest Employee Age: " + youngest);
        System.out.println("Oldest Employee Age: " + oldest);
    }

    public static List<Integer> convertArrayToList(int[] ages) {
        List<Integer> ageList = new ArrayList<>();
        for (int age : ages) {
            ageList.add(age); // Auto-boxing
        }
        return ageList;
    }

    public static Integer findYoungest(List<Integer> ages) {
        return ages.stream().min(Integer::compareTo).orElse(null);
    }

    public static Integer findOldest(List<Integer> ages) {
        return ages.stream().max(Integer::compareTo).orElse(null);
    }
}