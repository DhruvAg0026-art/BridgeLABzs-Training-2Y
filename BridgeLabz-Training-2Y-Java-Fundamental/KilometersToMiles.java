import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        final double KM_TO_MILES = 0.621371;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter distance in kilometers: ");
            double kilometers = scanner.nextDouble();

            double miles = kilometers * KM_TO_MILES;

            System.out.println("Miles: " + miles);
        }
    }
}
