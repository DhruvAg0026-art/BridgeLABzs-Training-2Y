import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Principal (P): ");
            double principal = scanner.nextDouble();

            System.out.print("Enter Rate (% per year): ");
            double rate = scanner.nextDouble();

            System.out.print("Enter Time (years): ");
            double time = scanner.nextDouble();

            // Simple Interest = (P * R * T) / 100
            double interest = (principal * rate * time) / 100.0;

            System.out.println("Simple Interest: " + interest);
        }
    }
}