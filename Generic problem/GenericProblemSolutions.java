import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GenericProblemSolutions {
    public static void main(String[] args) {
        // 1 Box
        Box<Integer> intBox = new Box<>(); intBox.set(42);
        Box<String> strBox = new Box<>(); strBox.set("Hello");
        Box<Double> dblBox = new Box<>(); dblBox.set(3.14);
        System.out.println("Box<Integer>: " + intBox.get());
        System.out.println("Box<String>: " + strBox.get());
        System.out.println("Box<Double>: " + dblBox.get());

        // 2 Pair
        Pair<String,Integer> student = new Pair<>("Amol", 20);
        System.out.println("Pair: " + student.getFirst() + ", " + student.getSecond());

        // 3 isEqual
        System.out.println("isEqual(5,5): " + Utils.isEqual(5, 5));
        System.out.println("isEqual(\"a\",\"b\"): " + Utils.isEqual("a", "b"));

        // 4 maximum
        System.out.println("max(3,7,5): " + Utils.maximum(3, 7, 5));
        System.out.println("max(\"apple\",\"pear\",\"banana\"): " + Utils.maximum("apple","pear","banana"));

        // 5 FruitBox
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple("Red Apple"));
        appleBox.add(new Apple("Green Apple"));
        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.add(new Mango("Alphonso"));
        System.out.println("AppleBox contents:"); appleBox.display();
        System.out.println("MangoBox contents:"); mangoBox.display();

        // 6 sumNumbers
        List<Integer> ints = Arrays.asList(1,2,3);
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.0);
        System.out.println("sumNumbers(ints): " + Utils.sumNumbers(ints));
        System.out.println("sumNumbers(doubles): " + Utils.sumNumbers(doubles));

        // 7 copyList
        List<Number> dest = new ArrayList<>();
        Utils.copyList(dest, doubles);
        Utils.copyList(dest, ints);
        System.out.println("dest after copy: " + dest);

        // 8 Animal
        List<Dog> dogs = Arrays.asList(new Dog("Rex"), new Dog("Buddy"));
        List<Cat> cats = Arrays.asList(new Cat("Whiskers"));
        System.out.println("Animals:");
        Utils.printAnimals(dogs);
        Utils.printAnimals(cats);

        // 9 Cart
        Cart<Electronic> eCart = new Cart<>();
        eCart.addItem(new Electronic("Laptop"));
        eCart.addItem(new Electronic("Phone"));
        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing("T-Shirt"));
        System.out.println("Electronics Cart:"); eCart.displayItems();
        System.out.println("Clothing Cart:"); cCart.displayItems();

        // 10 Price Calculator
        List<Product> mobiles = Arrays.asList(new Mobile("M1",299.99), new Mobile("M2",199.99));
        List<Product> laptops = Arrays.asList(new Laptop("L1",999.0));
        System.out.println("Total mobiles: " + Utils.calculateTotal(mobiles));
        System.out.println("Total laptops: " + Utils.calculateTotal(laptops));

        // 11 Fleet Manager
        FleetManager<Truck> trucks = new FleetManager<>();
        trucks.addVehicle(new Truck("T-100"));
        FleetManager<Bike> bikes = new FleetManager<>();
        bikes.addVehicle(new Bike("B-200"));
        System.out.println("Trucks:"); trucks.showFleet();
        System.out.println("Bikes:"); bikes.showFleet();

        // 12 Warehouse
        Storage<ElectronicItem> eStorage = new Storage<>();
        eStorage.add(new ElectronicItem("TV"));
        eStorage.add(new ElectronicItem("Radio"));
        System.out.println("Storage contents:");
        Storage.displayAll(eStorage.getAll());

        // 13 ProductGeneric and discount
        ProductGeneric<BookCategory> book = new ProductGeneric<>("Java Book", 50.0, new BookCategory());
        System.out.println("Book before discount: " + book.getPrice());
        Utils.applyDiscount(book, 10);
        System.out.println("Book after 10% discount: " + book.getPrice());

        // 14 Course Management
        Course<ExamCourse> csCourse = new Course<>("Algorithms", new ExamCourse());
        Course<AssignmentCourse> artCourse = new Course<>("Design", new AssignmentCourse());
        List<Course<? extends CourseType>> courses = Arrays.asList(csCourse, artCourse);
        System.out.println("Courses:");
        for (Course<? extends CourseType> c : courses) c.show();

        // 15 Meal Plan
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        System.out.println("Meal valid: " + vegMeal.generatePlan("LowCal"));

        // 16 Resume Screening
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice"));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob"));
        List<Resume<? extends JobRole>> resumes = Arrays.asList(seResume, dsResume);
        Utils.processResumes(resumes);
    }
}