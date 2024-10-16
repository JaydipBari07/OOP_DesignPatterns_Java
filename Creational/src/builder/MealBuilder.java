package builder;

public class MealBuilder {

    private Meal meal;

    public MealBuilder() {
        this.meal = new Meal();
    }

    public MealBuilder addCost(double cost) {
        meal.setCost(cost);
        return this;
    }

    public MealBuilder addTakeOut(boolean takeOut) {
        this.meal.setTakeOut(takeOut);
        return this;
    }

    public MealBuilder addMainCourse(String main) {
        this.meal.setMain(main);
        return this;
    }

    public MealBuilder addDrink(String drink) {
        this.meal.setDrink(drink);
        return this;
    }

    Meal build() {
        return this.meal;
    }
}
