/* 

Problem 3 : Java Constructor Level 1
Create a Person class with a copy constructor that clones another person's attributes.
Name: Utakarsh Jain
Date: 30/09/2026
*/

class Person {
    String name;
    int age;
    Person(String name, int age) { // Parameterized Constructor
        this.name = name;
        this.age = age;
    }
    Person(Person person) { // Copy Constructor
        this.name = person.name;
        this.age = person.age;
    }
    void display() { // Method to display the person details
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String args[]) { // Main method
        Person person1 = new Person("Utakarsh", 21); // Creates a person
        Person person2 = new Person(person1); // Creates a copy of person1
        person1.display();
        person2.display();
    }
}