import java.util.Scanner;

public class FtToYrdM {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double distanceInFeet = in.nextDouble();   // I/P => distanceInFeet
            double yards = distanceInFeet / 3.0;       // 1 yard = 3 feet
            double miles = yards / 1760.0;             // 1 mile = 1760 yards
            
            System.out.println("The distance in yards is " + yards +
                    " while the distance in miles is " + miles);
        } // I/P => distanceInFeet
    }
}
