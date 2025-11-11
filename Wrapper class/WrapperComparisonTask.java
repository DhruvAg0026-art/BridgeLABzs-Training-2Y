public class WrapperComparisonTask {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = new Integer(100);
        
        // Comparing using '=='
        System.out.println("Using '==':");
        System.out.println("a == b: " + (a == b)); // true, due to Integer caching for values -128 to 127
        System.out.println("a == c: " + (a == c)); // false
        System.out.println("a == d: " + (a == d)); // true, because d is also 100

        // Comparing using 'equals()'
        System.out.println("\nUsing 'equals()':");
        System.out.println("a.equals(b): " + a.equals(b)); // true
        System.out.println("a.equals(c): " + a.equals(c)); // false
        System.out.println("a.equals(d): " + a.equals(d)); // true

        // Comparing with null
        Integer e = null;
        System.out.println("\nComparing with null:");
        System.out.println("a == e: " + (a == e)); // false
        System.out.println("a.equals(e): " + a.equals(e)); // throws NullPointerException
    }
}