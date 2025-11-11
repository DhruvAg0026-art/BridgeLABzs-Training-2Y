import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    private final List<T> items = new ArrayList<>();
    public void add(T it) { items.add(it); }
    public List<T> getAll() { return items; }
    public void display() { for (T t : items) System.out.println(" - " + t.getName()); }
    public static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem i : items) System.out.println(" * " + i.getName());
    }
}

public class FurnitureItem extends WarehouseItem {
    public FurnitureItem(String name) { super(name); }
}

public class GroceryItem extends WarehouseItem {
    public GroceryItem(String name) { super(name); }
}

public class ElectronicItem extends WarehouseItem {
    public ElectronicItem(String name) { super(name); }
}

public interface Category { }

public class BookCategory implements Category { }

public class ClothingCategory implements Category { }

public class ProductGeneric<C extends Category> {
    private final String name;
    private double price;
    private final C category;
    public ProductGeneric(String name, double price, C category) {
        this.name = name; this.price = price; this.category = category;
    }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    @Override public String toString() { return name + "(" + price + ")"; }
}