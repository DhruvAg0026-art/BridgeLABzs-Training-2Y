import java.util.List;

public class Utils {
    public static <T> boolean isEqual(T a, T b) {
        return (a == null) ? b == null : a.equals(b);
    }

    public static <T extends Comparable<? super T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }

    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }

    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) dest.add(n);
    }

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) System.out.println(" - " + a.getName());
    }

    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) total += p.getPrice();
        return total;
    }

    public static <C extends Category> void applyDiscount(ProductGeneric<C> product, double percentage) {
        double price = product.getPrice();
        product.setPrice(price * (1 - percentage / 100.0));
    }

    public static void processResumes(java.util.List<? extends Resume<? extends JobRole>> resumes) {
        for (Resume<? extends JobRole> r : resumes) r.process();
    }

    public static void displayAll(java.util.List<? extends WarehouseItem> items) {
        for (WarehouseItem it : items) System.out.println(" * " + it.getName());
    }
}

public class Pair<T, U> {
    private final T first;
    private final U second;
    public Pair(T first, U second) { this.first = first; this.second = second; }
    public T getFirst() { return first; }
    public U getSecond() { return second; }
}