import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String id;
    private final String name;
    private final List<Order> orders = new ArrayList<>();

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public List<Order> getOrders() { return new ArrayList<>(orders); }

    // place an order: associates order with this customer (communication)
    public void placeOrder(Order order) {
        if (order == null) return;
        order.setCustomer(this);
        orders.add(order);
        System.out.println("Customer " + name + " placed order " + order.getId());
    }

    public void viewOrders() {
        System.out.println("Orders for " + name + ":");
        if (orders.isEmpty()) { System.out.println("  (no orders)"); return; }
        for (Order o : orders) o.printOrder();
    }
}