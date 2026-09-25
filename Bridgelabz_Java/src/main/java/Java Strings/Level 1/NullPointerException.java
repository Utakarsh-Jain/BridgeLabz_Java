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

class NullPointerExceptionDemo {
    public static void generateException() {
        String text = null; //Initializing the string as null
        System.out.println(text.length()); //Accessing the length of the string
    }
    public static void main(String args[]) {
        generateException(); //Calling the generateException() method
    }
}
