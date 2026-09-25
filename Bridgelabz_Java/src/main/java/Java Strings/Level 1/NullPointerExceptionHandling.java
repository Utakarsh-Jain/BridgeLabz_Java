/*
Problem 4 - Java String Level 1
Write a program to demonstrate NullPointerException. 
Hint => 
Write a Method to generate the Exception. Here define the variable text and initialize it to null. Then call one of the String Method to generate the exception
Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. Then write try catch block for handling the Exception while accessing one of the String method
From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException
Name: <Utakarsh Jain>
* Date : 25-09-2026

*/

public class NullPointerExceptionHandling {
    public static void handleException() {
        String text = null; //Initialzing the string as null
        try {
            System.out.println(text.length()); //Accessing the length of the string
        } catch (NullPointerException e) { //Catching the NullPointerException
            System.out.println("NullPointerException handled.");
        }
    }
    public static void main(String args[]) {
        handleException(); //Calling the handleException() method
    }
}
