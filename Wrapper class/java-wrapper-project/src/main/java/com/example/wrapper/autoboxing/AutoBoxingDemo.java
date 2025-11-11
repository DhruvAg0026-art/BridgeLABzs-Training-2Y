public class AutoBoxingDemo {
    public static void main(String[] args) {
        // Create an ArrayList to demonstrate auto-boxing
        java.util.ArrayList<Integer> integerList = new java.util.ArrayList<>();

        // Auto-boxing: adding primitive int values to the ArrayList
        for (int i = 1; i <= 5; i++) {
            integerList.add(i); // auto-boxing occurs here
        }

        // Display the contents of the ArrayList
        System.out.println("Integer List: " + integerList);

        // Calculate the sum of the integers in the list (auto-unboxing occurs here)
        int sum = 0;
        for (Integer number : integerList) {
            sum += number; // auto-unboxing occurs here
        }

        // Display the sum
        System.out.println("Sum of integers: " + sum);
    }
}