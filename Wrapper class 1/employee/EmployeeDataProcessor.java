package com.example.wrappers.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDataProcessor {

    public List<Integer> convertAgesToList(int[] ages) {
        List<Integer> ageList = new ArrayList<>();
        for (int age : ages) {
            ageList.add(age); // Auto-boxing from int to Integer
        }
        return ageList;
    }

    public int findYoungestAge(List<Integer> ages) {
        return ages.stream().min(Integer::compareTo).orElseThrow(() -> new IllegalArgumentException("Age list is empty"));
    }

    public int findOldestAge(List<Integer> ages) {
        return ages.stream().max(Integer::compareTo).orElseThrow(() -> new IllegalArgumentException("Age list is empty"));
    }
}