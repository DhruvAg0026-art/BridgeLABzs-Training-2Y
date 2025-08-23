import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

            System.out.println("Fahrenheit: " + fahrenheit);
        }
    }
}
