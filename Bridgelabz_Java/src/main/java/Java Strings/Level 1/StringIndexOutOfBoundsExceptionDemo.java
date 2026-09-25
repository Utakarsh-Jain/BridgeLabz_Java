/*
Problem 5 - Java String Level 1
Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
Name: <Utakarsh Jain>
* Date : 25-09-2026

*/ 

public class StringIndexOutOfBoundsExceptionDemo {
    public static void generateException() {
        String text = "hello"; //Creating a string
        System.out.println(text.charAt(5)); //Accessing index beyond the length of the string
    }
    public static void handleException() {
        String text = "hello"; //Creating a string
        try {
            System.out.println(text.charAt(5)); //Accessing index beyond the length of the string
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled."); //Printing the exception
        }
    }
    public static void main(String args[]) {
        generateException();
        handleException();
    }
}
