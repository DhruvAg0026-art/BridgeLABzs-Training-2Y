public class MainEcommerceDemo {
    public static void main(String[] args) {
        // create products (exist independently = aggregation)
        Product p1 = new Product("P001", "Wireless Mouse", 25.50);
        Product p2 = new Product("P002", "Mechanical Keyboard", 79.99);
        Product p3 = new Product("P003", "USB-C Cable", 9.99);

        // create customer
        Customer cust = new Customer("C100", "Ravi");

        // create order and add products (order aggregates products)
        Order order1 = new Order();
        order1.addProduct(p1, 2);
        order1.addProduct(p3, 3);

        // customer places the order (association / communication)
        cust.placeOrder(order1);

        // create another order
        Order order2 = new Order();
        order2.addProduct(p2, 1);
        order2.addProduct(p3, 1);
        cust.placeOrder(order2);

        // view customer's orders
        cust.viewOrders();
    }
}