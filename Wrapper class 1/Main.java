package com.example.wrappers;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Wrapper Class Examples");

        // Example of Primitive to Wrapper conversion
        PrimitiveToWrapper.convertAndDisplay();

        // Example of Wrapper to Primitive conversion
        WrapperToPrimitive.convertAndDisplay();

        // Example of Auto-boxing and Auto-unboxing
        AutoBoxingUnboxing.demoAutoBoxingUnboxing();

        // Example of Wrapper Comparison
        WrapperComparison.compareIntegers();

        // Example of Wrapper Utilities
        WrapperUtilities.demoUtilities();

        // Example of Input Conversion
        InputConversion.testInputConversion();

        // Example of Shopping Cart calculations
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem("Apple", "0.99", 3);
        shoppingCart.addItem("Banana", "0.59", 5);
        System.out.println("Total Price: " + shoppingCart.calculateTotal());

        // Example of Employee Data handling
        EmployeeDataProcessor employeeDataProcessor = new EmployeeDataProcessor();
        employeeDataProcessor.processEmployeeData();

        // Example of Performance Analysis
        PerformanceAnalysis.analyzePerformance();
    }
}