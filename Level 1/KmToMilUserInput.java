import java.util.Scanner;

public class KmToMilUserInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double km = sc.nextDouble();      // I/P => km
            double miles = km / 1.6;          // 1 mile = 1.6 km
            System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        } // I/P => km
    }
}
