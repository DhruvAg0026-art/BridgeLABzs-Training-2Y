import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;

    Alert(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
                new Alert("Critical"),
                new Alert("Normal"),
                new Alert("Urgent"),
                new Alert("Info")
        );

        // Predicate to show only important alerts
        Predicate<Alert> importantOnly = a -> a.type.equals("Critical") || a.type.equals("Urgent");

        System.out.println("Filtered Alerts:");
        for (Alert a : alerts) {
            if (importantOnly.test(a)) {
                System.out.println(a);
            }
        }
    }
}
