import java.util.ArrayList;
import java.util.List;

public class Cart<T> {
    private final List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public void removeItem(T item) { items.remove(item); }
    public void displayItems() { for (T it : items) System.out.println(" - " + it); }
}

public class Electronic {
    private final String name;
    public Electronic(String name) { this.name = name; }
    @Override public String toString() { return "Electronic:" + name; }
}

public class Clothing {
    private final String name;
    public Clothing(String name) { this.name = name; }
    @Override public String toString() { return "Clothing:" + name; }
}