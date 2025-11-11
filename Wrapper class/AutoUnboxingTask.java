public class AutoUnboxingTask {
    public static void main(String[] args) {
        // Example of auto-unboxing
        Integer integerObject = 10; // Auto-boxing
        int primitiveInt = integerObject; // Auto-unboxing

        System.out.println("Integer Object: " + integerObject);
        System.out.println("Primitive int: " + primitiveInt);

        // Demonstrating auto-unboxing in a method
        System.out.println("Sum of 5 and 10: " + addNumbers(5, 10));
    }

    public static int addNumbers(Integer a, Integer b) {
        return a + b; // Auto-unboxing occurs here
    }
}