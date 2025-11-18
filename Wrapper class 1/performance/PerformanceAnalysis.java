import java.util.ArrayList;

public class PerformanceAnalysis {

    public static void main(String[] args) {
        int numberOfElements = 1000000;

        long arrayListTime = measureArrayListPerformance(numberOfElements);
        long arrayTime = measureArrayPerformance(numberOfElements);

        System.out.println("Time taken using ArrayList<Integer>: " + arrayListTime + " ms");
        System.out.println("Time taken using int[]: " + arrayTime + " ms");
    }

    private static long measureArrayListPerformance(int numberOfElements) {
        ArrayList<Integer> list = new ArrayList<>();
        long startTime = System.nanoTime();

        for (int i = 0; i < numberOfElements; i++) {
            list.add(i);
        }

        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000; // Convert to milliseconds
    }

    private static long measureArrayPerformance(int numberOfElements) {
        int[] array = new int[numberOfElements];
        long startTime = System.nanoTime();

        for (int i = 0; i < numberOfElements; i++) {
            array[i] = i;
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000; // Convert to milliseconds
    }
}