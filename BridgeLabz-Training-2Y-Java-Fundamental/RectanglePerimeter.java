import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter length: ");
            double length = scanner.nextDouble();

            System.out.print("Enter width: ");
            double width = scanner.nextDouble();

            // Perimeter = 2 * (length + width)
            double perimeter = 2 * (length + width);

            System.out.println("Perimeter of the rectangle: " + perimeter);
        }
    }
}
