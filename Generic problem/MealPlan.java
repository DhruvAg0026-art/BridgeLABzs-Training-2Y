public interface MealPlan { }

public class Meal<T extends MealPlan> {
    private final T plan;
    public Meal(T plan) { this.plan = plan; }
    public boolean generatePlan(String preference) {
        return plan != null && preference != null && !preference.isEmpty();
    }
}

public class VegetarianMeal implements MealPlan { }

public class VeganMeal implements MealPlan { }

public class KetoMeal implements MealPlan { }