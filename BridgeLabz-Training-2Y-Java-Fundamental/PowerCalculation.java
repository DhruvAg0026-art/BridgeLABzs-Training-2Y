import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter base: ");
            double base = scanner.nextDouble();

            System.out.print("Enter exponent: ");
            double exponent = scanner.nextDouble();

            // Use Math.pow to compute base^exponent without loops/conditionals
            double result = Math.pow(base, exponent);

            System.out.println(base + " ^ " + exponent + " = " + result);
        }
    }
}
