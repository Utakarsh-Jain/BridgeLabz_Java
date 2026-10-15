
/*
Personalized Meal Plan Generator
Concepts: Generic Methods, Type Parameters, Bounded Type Parameters

Name: Utakarsh Jain
Date: 15/10/2026
*/

package main.java.JavaGenerics;

// Define an interface for meal plans
interface MealPlan {
    void displayMealPlan();
}

// Create meal plan subtypes
class VegetarianMeal implements MealPlan {
    @Override
    public void displayMealPlan() { // display vegetarian meal plan 
        System.out.println("Vegetarian Meal Plan");
    }
}

class VeganMeal implements MealPlan {
    @Override
    public void displayMealPlan() { // display vegan meal plan 
        System.out.println("Vegan Meal Plan");
    }
}

class KetoMeal implements MealPlan {
    @Override
    public void displayMealPlan() { // display keto meal plan 
        System.out.println("Keto Meal Plan");
    }
}

class HighProteinMeal implements MealPlan {
    @Override
    public void displayMealPlan() { // display high protein meal plan 
        System.out.println("High Protein Meal Plan");
    }
}

// Generic class to handle different meal plans
class Meal<T extends MealPlan> { // generic class to handle different meal plans 
    private T mealPlan;

    public Meal(T mealPlan) { // create a new meal plan
        this.mealPlan = mealPlan;
    }

    public void displayMealPlan() { // display the meal plan 
        mealPlan.displayMealPlan();
    }
}

public class PersonalizedMealPlanGenerator {

    // Generic method to generate a valid meal plan
    public static <T extends MealPlan> void generatePersonalizedMealPlan(T mealPlan) { // generate a valid meal plan
        System.out.println("Personalized Meal Plan Generated:");
        mealPlan.displayMealPlan(); // display the meal plan
        System.out.println(); // print a new line 
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarian = new Meal<>(new VegetarianMeal()); // create a new vegetarian meal plan 
        Meal<VeganMeal> vegan = new Meal<>(new VeganMeal()); // create a new vegan meal plan 
        Meal<KetoMeal> keto = new Meal<>(new KetoMeal()); // create a new keto meal plan 
        Meal<HighProteinMeal> highProtein = new Meal<>(new HighProteinMeal()); // create a new high protein meal plan 
        vegetarian.displayMealPlan(); // display the vegetarian meal plan 
        vegan.displayMealPlan(); // display the vegan meal plan 
        keto.displayMealPlan(); // display the keto meal plan 
        highProtein.displayMealPlan(); // display the high protein meal plan 
    }
}
