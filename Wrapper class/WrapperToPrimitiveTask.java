public class WrapperToPrimitiveTask {
    public static void main(String[] args) {
        // Create a Double object
        Double doubleObject = 10.5;

        // Convert Double to primitive double
        double primitiveDouble = doubleObject.doubleValue();
        System.out.println("Primitive double: " + primitiveDouble);

        // Convert Double to primitive int
        int primitiveInt = doubleObject.intValue();
        System.out.println("Primitive int: " + primitiveInt);
    }
}