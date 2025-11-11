public class Animal {
    private final String name;
    public Animal(String name) { this.name = name; }
    public String getName() { return name; }
}

public class Dog extends Animal {
    public Dog(String name) { super(name); }
}

public class Cat extends Animal {
    public Cat(String name) { super(name); }
}