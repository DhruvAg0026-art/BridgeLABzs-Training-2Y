import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();

            System.out.print("Enter third number: ");
            double c = scanner.nextDouble();

            double average = (a + b + c) / 3.0;

            System.out.println("Average: " + average);
        }
    }
}
