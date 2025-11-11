package com.example.wrapper;

import com.example.wrapper.converters.PrimitiveConverter;
import com.example.wrapper.converters.WrapperConverter;
import com.example.wrapper.autoboxing.AutoBoxingDemo;
import com.example.wrapper.utils.WrapperUtils;
import com.example.wrapper.validation.Validator;

public class Main {
    public static void main(String[] args) {
        // Demonstrate primitive to wrapper conversion
        int primitiveInt = 10;
        Integer wrappedInt = PrimitiveConverter.convertIntToInteger(primitiveInt);
        System.out.println("Primitive int: " + primitiveInt + " -> Wrapped Integer: " + wrappedInt);

        // Demonstrate wrapper to primitive conversion
        Integer anotherWrappedInt = 20;
        int anotherPrimitiveInt = WrapperConverter.convertIntegerToInt(anotherWrappedInt);
        System.out.println("Wrapped Integer: " + anotherWrappedInt + " -> Primitive int: " + anotherPrimitiveInt);

        // Demonstrate auto-boxing and auto-unboxing
        AutoBoxingDemo.autoBoxingDemo();

        // Demonstrate utility methods
        String input = "25";
        int parsedInt = WrapperUtils.safeParseInt(input);
        System.out.println("Parsed int from string: " + parsedInt);

        // Validate user input
        String ageInput = "18";
        if (Validator.isValidAge(ageInput)) {
            System.out.println("Valid age: " + ageInput);
        } else {
            System.out.println("Invalid age: " + ageInput);
        }
    }
}