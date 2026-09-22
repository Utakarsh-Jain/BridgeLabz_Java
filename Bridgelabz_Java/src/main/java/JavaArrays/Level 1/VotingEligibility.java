import java.util.*;
/*Problem 1 - GCR Java Arrays Level 1
Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Define an array of 10 integer elements and take user input for the student's age. 
Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote. 


* Author : <Utakarsh Jain>
* Date : 22-09-2026
*/
public class VotingEligibility {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age[]= new int[10]; //Initializing an array of size 10
        for(int i= 0 ;i < age.length ; i++) {
            System.out.println("Enter the age of student number " + (i+1)); //Taking user input for the age of the student
            age[i] = sc.nextInt();
            if(age[i] >= 18){ //Checking if the age is greater than or equal to 18
                System.out.println("The student with the age " + age[i] + " can vote"); //Printing that the student can vote
            }
            else if(age[i] < 0){ //Checking if the age is negative
                System.out.println("Invalid age"); //Printing that the age is invalid
            }
            else{ //If the age is not greater than or equal to 18 and not negative
                System.out.println("The student with the age " + age[i] + " cannot vote"); //Printing that the student cannot vote
            }
        }
        sc.close(); //Closing the scanner
    }
}
