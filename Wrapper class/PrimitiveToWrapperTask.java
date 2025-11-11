public class PrimitiveToWrapperTask {
    public static void main(String[] args) {
        int primitiveInt = 42; // Primitive integer
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Conversion to wrapper class

        // Displaying both forms
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
    }
}