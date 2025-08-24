import java.util.Scanner;

public class FeetToYardsAndMiles {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double feet = in.nextDouble();     // I/P => distanceInFeet
            double yards = feet / 3.0;         // 1 yard = 3 feet
            double miles = yards / 1760.0;     // 1 mile = 1760 yards
            
            System.out.println("The distance in feet is " + feet +
                    " while in yards is " + yards +
                    " and miles is " + miles);
        } // I/P => distanceInFeet
    }
}
