
/*
Program 22: Template Method Design Pattern

Purpose:
Template Method defines the fixed steps of an algorithm in a
parent class while allowing subclasses to customize certain steps.
Here, different beverages follow the same preparation process.
*/

// Abstract class defines the beverage preparation template
abstract class Beverage {

    // Template method defines the order of preparation steps
    public final void prepareBeverage() {
        boilWater();
        addMainIngredient();
        pourIntoCup();
        addExtras();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    // Subclasses provide their own main ingredient
    protected abstract void addMainIngredient();

    private void pourIntoCup() {
        System.out.println("Pouring into cup");
    }

    // Subclasses can optionally customize this step
    protected void addExtras() {
        // Default behavior: no extras
    }
}

// Tea customizes the main ingredient and extras
class Tea extends Beverage {
    @Override
    protected void addMainIngredient() {
        System.out.println("Adding tea leaves");
    }

    @Override
    protected void addExtras() {
        System.out.println("Adding lemon");
    }
}

// Coffee customizes the main ingredient and extras
class Coffee extends Beverage {
    @Override
    protected void addMainIngredient() {
        System.out.println("Adding coffee powder");
    }

    @Override
    protected void addExtras() {
        System.out.println("Adding sugar and milk");
    }
}

public class TemplateMethodPattern {
    public static void main(String[] args) {
        // Prepare tea using the common template
        System.out.println("Preparing Tea:");
        Beverage tea = new Tea();
        tea.prepareBeverage();

        // Prepare coffee using the same template
        System.out.println("\nPreparing Coffee:");
        Beverage coffee = new Coffee();
        coffee.prepareBeverage();
    }
}
