
/*
Program 4: Builder Design Pattern

Purpose:
Builder Pattern constructs an object step by step.
It is useful when a class has multiple fields.
*/

class User {

    // User details are immutable after object creation
    private final String name;
    private final int age;
    private final String email;

    // Private constructor receives values from the Builder
    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    // Display user details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }

    // Static nested class builds the User object
    static class Builder {

        private String name;
        private int age;
        private String email;

        // Set the user's name
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        // Set the user's age
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        // Set the user's email
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        // Construct and return the final User object
        public User build() {
            return new User(this);
        }
    }
}

public class BuilderPattern {
    public static void main(String[] args) {

        // Set fields step by step using method chaining
        User user = new User.Builder()
                .setName("Utkarsh")
                .setAge(21)
                .setEmail("user@example.com")
                .build();

        // Display the constructed object
        user.display();
    }
}
