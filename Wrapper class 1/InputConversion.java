package com.example.wrappers;

import java.util.InputMismatchException;

public class InputConversion {

    public static Integer safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + input + ". Please enter a valid integer.");
            return null;
        }
    }

    public static void testInputConversion() {
        String[] testInputs = {"10", "abc", "20", "30.5", "-5", "0"};
        for (String input : testInputs) {
            Integer result = safeParseInt(input);
            System.out.println("Input: " + input + ", Parsed Integer: " + result);
        }
    }

    public static void main(String[] args) {
        testInputConversion();
    }
}