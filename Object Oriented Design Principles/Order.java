import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int NEXT_ID = 1;

    private final String id;
    private Customer customer; // association: order is placed by a customer
    private final List<OrderItem> items = new ArrayList<>();

    public Order() {
        this.id = "O" + (NEXT_ID++);
    }

    public String getId() { return id; }
    public Customer getCustomer() { return customer; }
    void setCustomer(Customer customer) { this.customer = customer; } // package-private: set by Customer.placeOrder()

    public void addProduct(Product p, int qty) {
        if (p == null) return;
        // if product already in order, increase quantity
        for (OrderItem oi : items) {
            if (oi.getProduct().getId().equals(p.getId())) {
                oi.setQuantity(oi.getQuantity() + qty);
                return;
            }
        }
        items.add(new OrderItem(p, qty));
    }

    public List<OrderItem> getItems() { return new ArrayList<>(items); }

    public double calculateTotal() {
        double total = 0.0;
        for (OrderItem oi : items) total += oi.getSubtotal();
        return total;
    }

    public void printOrder() {
        System.out.println("Order " + id + (customer != null ? " (Customer: " + customer.getName() + ")" : ""));
        if (items.isEmpty()) {
            System.out.println("  (no products)");
            return;
        }
        for (OrderItem oi : items) System.out.println("  - " + oi);
        System.out.println("Total: $" + String.format("%.2f", calculateTotal()));
    }
}