public class Vehicle {
    private final String id;
    public Vehicle(String id) { this.id = id; }
    public String getId() { return id; }
    @Override public String toString() { return getClass().getSimpleName() + ":" + id; }
}

public class Truck extends Vehicle {
    public Truck(String id) { super(id); }
}

public class Bike extends Vehicle {
    public Bike(String id) { super(id); }
}