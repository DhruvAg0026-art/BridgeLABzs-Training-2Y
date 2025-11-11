public class AutoBoxingTask {
    public static void main(String[] args) {
        // Create an ArrayList to hold Integer objects
        ArrayList<Integer> numbers = new ArrayList<>();

        // Auto-boxing: adding primitive int values to the ArrayList
        for (int i = 1; i <= 10; i++) {
            numbers.add(i); // Auto-boxing occurs here
        }

        // Calculate the sum using auto-unboxing
        int sum = 0;
        for (Integer number : numbers) {
            sum += number; // Auto-unboxing occurs here
        }

        // Display the result
        System.out.println("The sum of the numbers is: " + sum);
    }
}