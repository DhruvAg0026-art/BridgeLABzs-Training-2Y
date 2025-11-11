import java.util.ArrayList;
import java.util.List;

public class FleetManager<T extends Vehicle> {
    private final List<T> list = new ArrayList<>();
    public void addVehicle(T v) { list.add(v); }
    public void showFleet() { for (T v : list) System.out.println(" - " + v); }
}

public abstract class WarehouseItem {
    private final String name;
    protected WarehouseItem(String name) { this.name = name; }
    public String getName() { return name; }
}