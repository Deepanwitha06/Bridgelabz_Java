package Generics;

/*
      Concepts: Generic Methods, Type Parameters, Bounded Type Parameters
 */

import java.util.LinkedList;
import java.util.List;

interface MealPlan{
    String getLunch();
    String getDinner();
}

class VegetarianMeal implements MealPlan{
    String lunch;
    String dinner;

    public VegetarianMeal(String lunch,String dinner){
        this.lunch=lunch;
        this.dinner=dinner;
    }

    @Override
    public String getLunch(){
        return lunch;
    }

    @Override
    public String getDinner(){
        return dinner;
    }
}

class VeganMeal implements MealPlan{
    String lunch;
    String dinner;

    public VeganMeal(String lunch,String dinner){
        this.lunch=lunch;
        this.dinner=dinner;
    }

    @Override
    public String getLunch(){
        return lunch;
    }

    @Override
    public String getDinner(){
        return dinner;
    }
}


class KetoMeal implements MealPlan{
    String lunch;
    String dinner;

    public KetoMeal(String lunch,String dinner){
        this.lunch=lunch;
        this.dinner=dinner;
    }

    @Override
    public String getLunch(){
        return lunch;
    }

    @Override
    public String getDinner(){
        return dinner;
    }
}

class HighProteinMeal implements MealPlan{
    String lunch;
    String dinner;

    public HighProteinMeal(String lunch,String dinner){
        this.lunch=lunch;
        this.dinner=dinner;
    }

    @Override
    public String getLunch(){
        return lunch;
    }

    @Override
    public String getDinner(){
        return dinner;
    }
}

class Meal<T extends MealPlan>{
    List<T> meals;

    public Meal(){
        meals=new LinkedList<>();
    }

    public void addPlan(T plan){
        meals.add(plan);
    }

    public List<T> getPlans(){
        return meals;
    }

    //generic method to validate and generate plan
    public<E extends MealPlan> void generatePlan(E plan){
        if(plan==null || plan.getLunch()==null || plan.getDinner()==null || plan.getLunch().isBlank() || plan.getDinner().isBlank()){
            System.out.println("Invalid meal plan");
            return;
        }
        System.out.println("\nPersonalized Meal Plan");
        System.out.println("Lunch: "+plan.getLunch());
        System.out.println("Dinner: "+plan.getDinner());
    }

    public void displayPlans(List<T> plans) {
        for (MealPlan plan : plans) {
            System.out.println("\nPlan details: \nLunch: " + plan.getLunch() + "\nDinner: " + plan.getDinner());
        }
    }
}

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args){
        VegetarianMeal vegetarianMeal=new VegetarianMeal("Paneer","Vegetable curry");
        VeganMeal veganMeal=new VeganMeal("Lemon rice","Chickpea curry");
        KetoMeal ketoMeal=new KetoMeal("Egg salad","Grilled chicken");
        HighProteinMeal highProteinMeal=new HighProteinMeal("Chicken breast","Paneer");

        Meal<MealPlan> meal=new Meal<>();

        meal.addPlan(vegetarianMeal);
        meal.addPlan(veganMeal);
        meal.addPlan(ketoMeal);
        meal.addPlan(highProteinMeal);

        meal.generatePlan(veganMeal);

        List<MealPlan> mealPlanList=meal.getPlans();
        System.out.println("\nAll meal plans: ");
        meal.displayPlans(mealPlanList);

    }
}
