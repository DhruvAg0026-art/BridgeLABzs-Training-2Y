public class UtilityMethodsTask {
    public static void main(String[] args) {
        // Demonstrating various utility methods from wrapper classes

        // 1. Converting primitive to wrapper
        int primitiveInt = 10;
        Integer wrapperInt = Integer.valueOf(primitiveInt);
        System.out.println("Primitive int: " + primitiveInt + ", Wrapper Integer: " + wrapperInt);

        // 2. Converting wrapper to primitive
        Integer wrapperInteger = 20;
        int convertedPrimitiveInt = wrapperInteger.intValue();
        System.out.println("Wrapper Integer: " + wrapperInteger + ", Converted Primitive int: " + convertedPrimitiveInt);

        // 3. Using Character utility methods
        char character = 'A';
        System.out.println("Is 'A' a letter? " + Character.isLetter(character));
        System.out.println("Is 'A' a digit? " + Character.isDigit(character));
        System.out.println("Uppercase of 'a': " + Character.toUpperCase('a'));

        // 4. Using Double utility methods
        double doubleValue = 3.14;
        System.out.println("Double value: " + doubleValue);
        System.out.println("Is NaN: " + Double.isNaN(doubleValue));
        System.out.println("Is Infinite: " + Double.isInfinite(doubleValue));

        // 5. Using Boolean utility methods
        boolean boolValue = true;
        System.out.println("Boolean value: " + boolValue);
        System.out.println("Boolean to String: " + Boolean.toString(boolValue));
    }
}