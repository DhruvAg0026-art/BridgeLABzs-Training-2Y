import java.util.Scanner;

public class TriangleAreaCmAndIn {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double baseCm = in.nextDouble();    // I/P => base (cm)
            double heightCm = in.nextDouble();  // I/P => height (cm)
            
            double areaSqCm = 0.5 * baseCm * heightCm;
            double areaSqIn = areaSqCm / (2.54 * 2.54); // 1 in = 2.54 cm
            
            System.out.println("The Area of the triangle in sq in is " + areaSqIn +
                    " and sq cm is " + areaSqCm);
        } // I/P => base (cm)
    }
}
