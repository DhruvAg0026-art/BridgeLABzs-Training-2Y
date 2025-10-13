import java.time.*;
public class DateComparison {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2025, 9, 7);
        LocalDate d2 = LocalDate.of(2025, 12, 25);
        if (d1.isBefore(d2)) System.out.println("First date is before second date");
        else if (d1.isAfter(d2)) System.out.println("First date is after second date");
        else System.out.println("Both dates are equal");
    }
}
