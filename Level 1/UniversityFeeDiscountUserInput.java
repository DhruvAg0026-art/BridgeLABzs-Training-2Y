import java.util.Scanner;

public class UniversityFeeDiscountUserInput {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double fee = in.nextDouble();             // I/P => fee
            double discountPercent = in.nextDouble(); // I/P => discountPercent
            
            double discount = fee * discountPercent / 100.0;
            double finalFee = fee - discount;
            
            System.out.println("The discount amount is INR " + discount +
                    " and final discounted fee is INR " + finalFee);
        } // I/P => fee
    }
}
