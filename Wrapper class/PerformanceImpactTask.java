import java.util.ArrayList;

public class PerformanceImpactTask {
    public static void main(String[] args) {
        int size = 1000000; // Size of the array and ArrayList
        long startTime, endTime;

        // Benchmarking int[]
        int[] primitiveArray = new int[size];
        for (int i = 0; i < size; i++) {
            primitiveArray[i] = i;
        }

        startTime = System.nanoTime();
        int sumPrimitive = 0;
        for (int value : primitiveArray) {
            sumPrimitive += value;
        }
        endTime = System.nanoTime();
        System.out.println("Sum of int[]: " + sumPrimitive);
        System.out.println("Time taken for int[]: " + (endTime - startTime) + " ns");

        // Benchmarking ArrayList<Integer>
        ArrayList<Integer> wrapperList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            wrapperList.add(i);
        }

        startTime = System.nanoTime();
        int sumWrapper = 0;
        for (Integer value : wrapperList) {
            sumWrapper += value;
        }
        endTime = System.nanoTime();
        System.out.println("Sum of ArrayList<Integer>: " + sumWrapper);
        System.out.println("Time taken for ArrayList<Integer>: " + (endTime - startTime) + " ns");
    }
}