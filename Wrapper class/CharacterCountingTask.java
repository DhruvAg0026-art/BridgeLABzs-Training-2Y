package com.example.wrapper;

import java.util.Scanner;

public class CharacterCountingTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to analyze:");
        String input = scanner.nextLine();
        
        int letterCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else {
                specialCharCount++;
            }
        }

        System.out.println("Letters: " + letterCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Characters: " + specialCharCount);
        
        scanner.close();
    }
}