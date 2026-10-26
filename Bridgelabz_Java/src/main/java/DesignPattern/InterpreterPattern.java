
/*
Program 15: Interpreter Design Pattern

Purpose:
Interpreter Pattern represents and evaluates expressions
using a defined grammar.
This example evaluates simple addition expressions.
*/

// Common interface for all expressions
interface Expression {
    int interpret();
}

// Represents a number in the expression
class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        // Return the stored number
        return number;
    }
}

// Represents an addition expression
class AddExpression implements Expression {
    private Expression left;
    private Expression right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        // Evaluate both sides and add their results
        return left.interpret() + right.interpret();
    }
}

public class InterpreterPattern {
    public static void main(String[] args) {
        // Represent the expression 10 + 20
        Expression left = new NumberExpression(10);
        Expression right = new NumberExpression(20);

        // Build an expression tree for addition
        Expression addition = new AddExpression(left, right);

        // Interpret and display the final result
        System.out.println("Result: " + addition.interpret());
    }
}
