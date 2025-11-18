public class WrapperToPrimitive {
    
    public static void main(String[] args) {
        // Example of converting a Double object to primitive double
        Double doubleObject = 10.5;
        double primitiveDouble = doubleObject; // Auto-unboxing
        System.out.println("Double object: " + doubleObject);
        System.out.println("Primitive double: " + primitiveDouble);
        
        // Example of converting a Double object to primitive int
        int primitiveInt = doubleObject.intValue(); // Explicit conversion
        System.out.println("Primitive int from Double: " + primitiveInt);
    }
}