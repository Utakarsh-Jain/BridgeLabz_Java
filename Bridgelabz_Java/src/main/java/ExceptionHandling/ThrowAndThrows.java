/*
Problem Statement 3: Throw and Throws
Problem:
Create a class UserService with methods for user registration. Implement the following:
1. Define a method registerUser(String username) that throws a
UserAlreadyExistsException if the user already exists in the system. Use the
throws keyword to declare this exception.
2. Define a method checkUserExistence(String username) that simulates
checking user existence and throws a UserNotFoundException if the user is not
found.
3. In the main method, handle these exceptions appropriately and provide feedback.

Name: Utakarsh Jain
Date: 19/10/2026
*/

package main.java.ExceptionHandling;

public class ThrowAndThrows {
    
    class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}

class UserService {

    private String[] users = {"Alice", "Bob", "Charlie"};

    // Method that throws exception using 'throws' keyword
    public void registerUser(String username) throws UserAlreadyExistsException {

        for (String u : users) {
            if (u.equals(username)) {
                throw new UserAlreadyExistsException(
                        "User '" + username + "' already exists.");
            }
        }

        System.out.println("User '" + username + "' registered successfully.");
    }

    // Method that throws exception using 'throw' keyword
    public void checkUserExistence(String username)
            throws UserNotFoundException {

        boolean found = false;
        for (String u : users) {
            if (u.equals(username)) {
                found = true;
                break;
            }
        }

        if (!found) {
            // manually throw the exception
            throw new UserNotFoundException(
                    "User '" + username + "' not found.");
        }
    }
}

public static void main(String[] args) {

    UserService service = new UserService();

    // Example 1: User already exists
    try {
        service.registerUser("Alice");
    } catch (UserAlreadyExistsException e) {
        System.out.println("Registration failed: " + e.getMessage());
    }

    System.out.println("--------------------");

    // Example 2: User not found
    try {
        service.checkUserExistence("David");
    } catch (UserNotFoundException e) {
        System.out.println("Check failed: " + e.getMessage());
    }
}

}
