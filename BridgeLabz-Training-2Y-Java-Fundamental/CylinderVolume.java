import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();

            System.out.print("Enter height: ");
            double height = scanner.nextDouble();

            // Volume = π * r^2 * h
            double volume = Math.PI * radius * radius * height;

            System.out.println("Volume of the cylinder: " + volume);
        }
    }
}
