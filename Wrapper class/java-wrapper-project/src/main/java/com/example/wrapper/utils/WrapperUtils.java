package com.example.wrapper.utils;

public class WrapperUtils {

    public static Integer safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Double safeParseDouble(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static double calculateAverage(Integer[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        double sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static Integer findMax(Integer[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }
        Integer max = numbers[0];
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}