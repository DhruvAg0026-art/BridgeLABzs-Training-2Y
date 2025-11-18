package com.example.wrappers;

public class WrapperComparison {

    public static void main(String[] args) {
        compareIntegers();
        compareIntegersWithNewKeyword();
    }

    private static void compareIntegers() {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("Comparing Integer objects:");
        System.out.println("a == b: " + (a == b)); // true, because of caching for values -128 to 127
        System.out.println("c == d: " + (c == d)); // false, because they are outside the cache range
        System.out.println("a.equals(b): " + a.equals(b)); // true
        System.out.println("c.equals(d): " + c.equals(d)); // true
    }

    private static void compareIntegersWithNewKeyword() {
        Integer e = new Integer(100);
        Integer f = new Integer(100);

        System.out.println("\nComparing Integer objects created with 'new':");
        System.out.println("e == f: " + (e == f)); // false, different references
        System.out.println("e.equals(f): " + e.equals(f)); // true, same value
    }
}