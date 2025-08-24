import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long n = in.nextLong();              // I/P => numberOfStudents
            long handshakes = n * (n - 1) / 2;   // max pairwise handshakes
            
            System.out.println("The maximum number of handshakes is " + handshakes);
        } // I/P => numberOfStudents
    }
}
