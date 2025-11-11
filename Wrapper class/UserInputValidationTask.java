package com.example.wrapper;

import java.util.Scanner;

public class UserInputValidationTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = getValidAge(scanner);
        System.out.println("Valid age entered: " + age);
        scanner.close();
    }

    public static int getValidAge(Scanner scanner) {
        int age = -1;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Please enter your age (18 or older): ");
            String input = scanner.nextLine();

            try {
                age = Integer.parseInt(input);
                if (age >= 18) {
                    validInput = true;
                } else {
                    System.out.println("Age must be 18 or older. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        return age;
    }
}