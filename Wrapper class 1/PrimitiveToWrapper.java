public class PrimitiveToWrapper {
    
    public static void main(String[] args) {
        // Example of converting primitive types to wrapper classes
        int primitiveInt = 10;
        Integer wrapperInt = Integer.valueOf(primitiveInt);
        
        double primitiveDouble = 20.5;
        Double wrapperDouble = Double.valueOf(primitiveDouble);
        
        // Displaying both forms
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Wrapper Double: " + wrapperDouble);
    }
}