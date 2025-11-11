package com.example.wrapper.validation;

public class Validator {
    
    public static boolean isValidInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValidAge(String age) {
        if (!isValidInteger(age)) {
            return false;
        }
        int ageValue = Integer.parseInt(age);
        return ageValue >= 18;
    }
}