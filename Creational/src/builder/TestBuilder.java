package builder;

public class TestBuilder {

    public static void main(String[] args) {

        Meal meal = new MealBuilder()
                .addCost(500.0)
                .addMainCourse("Chicken Curry")
                .addDrink("Mojito")
                .addTakeOut(true)
                .build();
        System.out.println("MainCourse: " + meal.getMain());
        System.out.println("Takeout: " + meal.getTakeOut());
        System.out.println("Drink: " + meal.getDrink());
        System.out.println("Total Bill: " + meal.getCost());
    }
}
