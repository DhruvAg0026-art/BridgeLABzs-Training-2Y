public class Product {
    private final String name;
    private final double price;
    public Product(String name, double price) { this.name = name; this.price = price; }
    public double getPrice() { return price; }
    @Override public String toString() { return name + "(" + price + ")"; }
}

public class Mobile extends Product {
    public Mobile(String name, double price) { super(name, price); }
}

public class Laptop extends Product {
    public Laptop(String name, double price) { super(name, price); }
}