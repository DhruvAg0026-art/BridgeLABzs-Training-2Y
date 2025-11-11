public abstract class JobRole {
    private final String name;
    protected JobRole(String name) { this.name = name; }
    public String getName() { return name; }
}

public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String name) { super(name); }
}

public class DataScientist extends JobRole {
    public DataScientist(String name) { super(name); }
}

public class ProductManager extends JobRole {
    public ProductManager(String name) { super(name); }
}

public class Resume<T extends JobRole> {
    private final T role;
    public Resume(T role) { this.role = role; }
    public void process() { System.out.println("Processing resume for " + role.getName() + " (" + role.getClass().getSimpleName() + ")"); }
}