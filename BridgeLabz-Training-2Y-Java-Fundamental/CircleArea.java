import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();

            // Area = π * r^2
            double area = Math.PI * radius * radius;

            System.out.println("Area of the circle: " + area);
        }
    }
}
