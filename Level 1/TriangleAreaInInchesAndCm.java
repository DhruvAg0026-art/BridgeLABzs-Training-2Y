import java.util.Scanner;

public class TriangleAreaInInchesAndCm {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double base = in.nextDouble();    // I/P => base (in inches)
            double height = in.nextDouble();  // I/P => height (in inches)
            
            double areaInSqInches = 0.5 * base * height;
            double areaInSqCm = areaInSqInches * 2.54 * 2.54; // 1 inch = 2.54 cm
            
            System.out.println("The area of the triangle is " + areaInSqInches +
                    " square inches and " + areaInSqCm + " square centimeters");
        } // I/P => base (in inches)
    }
}
