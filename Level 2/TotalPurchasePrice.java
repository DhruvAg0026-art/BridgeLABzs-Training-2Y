import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double unitPrice = in.nextDouble(); // I/P => unitPrice
            int quantity = in.nextInt();        // I/P => quantity
            
            double total = unitPrice * quantity;
            
            System.out.println("The total purchase price is INR " + total +
                    " if the quantity " + quantity +
                    " and unit price is INR " + unitPrice);
        } // I/P => unitPrice
    }
}
