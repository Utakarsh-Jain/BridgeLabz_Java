/*
Animal Hierarchy
Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
Tasks:
Define a superclass Animal with attributes name and age, and a method makeSound().
Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.
Name : Utakarsh Jain
Date : 2/10/26
*/
package main.java.Inheritance.AssistedProblems;
class Animal { //Parent class Animal
    String name;
    int age;
    Animal(String name , int age){ //Parameterized constructor 
        this.name = name;
        this.age = age;
    }
    void makeSound(){ //Method overriding
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal { //Child Class
    Dog(String name , int age){
        super(name, age); //call to the parent class constructor
    }
    @Override //Method overriding
    void makeSound() { //Method overriding
        System.out.println("Woof woof!");
    }
}
class Cat extends Animal { //Child Class
    Cat(String name , int age){ //Parameterized constructor 
        super(name, age); //call to the parent class constructor
    }
    @Override //Method overriding
    void makeSound() { //Method overriding
        System.out.println("Meow");
    }
}
class Bird extends Animal { //Child Class
    Bird(String name , int age){ //Parameterized constructor 
        super(name, age); //call to the parent class constructor
    }
    @Override //Method overriding
    void makeSound() { //Method overriding
        System.out.println("Chirp chirp");
    }
}
public class AnimalHiearchy {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic", 1);
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Chirpy", 1);
        
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }   
}