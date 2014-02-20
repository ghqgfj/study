package builder;

public class BuilderExample {
    public static void main(String args[]){
        MealBuilder builder=new MealBuilder();
        Meal vegMeal=builder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Price: "+vegMeal.getCost());
        Meal nonVegMeal=builder.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Price: "+nonVegMeal.getCost());
    }
}
