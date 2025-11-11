import java.util.ArrayList;
import java.util.List;

public class Fruit {
    private final String name;
    public Fruit(String name) { this.name = name; }
    public String getName() { return name; }
    @Override public String toString() { return getClass().getSimpleName() + "(" + name + ")"; }
}

public class Apple extends Fruit {
    public Apple(String name) { super(name); }
}

public class Mango extends Fruit {
    public Mango(String name) { super(name); }
}

public class FruitBox<T extends Fruit> {
    private final List<T> items = new ArrayList<>();
    public void add(T f) { items.add(f); }
    public void display() { for (T f : items) System.out.println(" - " + f); }
}