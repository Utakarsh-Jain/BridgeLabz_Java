/*
AI-Driven Resume Screening System
Concepts: Generic Classes, Generic Methods, Bounded Type Parameters, Wildcards
Problem Statement:
Develop an AI-Driven Resume Screening System that can process resumes for different job roles like Software Engineer, Data Scientist, and Product Manager while ensuring type safety.
Hints:
Create an abstract class JobRole (SoftwareEngineer, DataScientist, ProductManager).
Implement a generic class Resume<T extends JobRole> to process resumes dynamically.
Use a wildcard method (List<? extends JobRole>) to handle multiple job roles in the screening pipeline.
Name : Utakarsh Jain
Date: 15/10/2026

*/
package main.java.JavaGenerics;

abstract class JobRole { // abstract class to store job roles 
    String roleName; // job role name 
    int experience; // job role experience 
    public JobRole(String roleName, int experience) { // constructor to initialize job role 
        this.roleName = roleName; // set job role name 
        this.experience = experience; // set job role experience 
    } 
    public String getRoleName() { return roleName; } // get job role name 
    public int getExperience() { return experience; } // get job role experience 
    @Override public String toString() { return roleName + " (" + experience + " yrs)"; } // override to string 
}
class SoftwareEngineer extends JobRole { // software engineer class 
    public SoftwareEngineer(int experience) { super("Software Engineer", experience); } // constructor to initialize software engineer 
}
class DataScientist extends JobRole { // data scientist class 
    public DataScientist(int experience) { super("Data Scientist", experience); } // constructor to initialize data scientist 
}
class ProductManager extends JobRole { // product manager class 
    public ProductManager(int experience) { super("Product Manager", experience); } // constructor to initialize product manager 
}
class Resume<T extends JobRole> { // generic class to process resumes 
    private String candidateName; // candidate name 
    private T jobRole; // candidate job role 
    public Resume(String candidateName, T jobRole) { // constructor to initialize resume 
        this.candidateName = candidateName; // set candidate name 
        this.jobRole = jobRole; // set candidate job role 
    } 
    public T getJobRole() { return jobRole; } // get candidate job role 
    public String getCandidateName() { return candidateName; } // get candidate name 
    @Override public String toString() { return candidateName + " - " + jobRole; } // override to string 
}
public class AIDrivenResume { // main class 
    public static <T extends JobRole> void processResume(Resume<? extends T> resume, String jobRole) { // process resume method 
        System.out.println("Processing resume for " + jobRole + ": " + resume.getCandidateName()); // print candidate name 
        if (resume.getJobRole().getExperience() >= 3) { // check if candidate has enough experience 
            System.out.println("Resume is eligible for " + jobRole); // print if eligible 
        } else { 
            System.out.println("Resume is not eligible for " + jobRole); // print if not eligible 
        } 
    } 
    public static void main(String[] args) { // main method 
        Resume<SoftwareEngineer> softwareResume = new Resume<>("Alice", new SoftwareEngineer(5)); // create software engineer resume 
        Resume<DataScientist> dataResume = new Resume<>("Bob", new DataScientist(4)); // create data scientist resume 
        Resume<ProductManager> productResume = new Resume<>("Charlie", new ProductManager(6)); // create product manager resume 
        processResume(softwareResume, "Software Engineer"); // process software engineer resume 
        processResume(dataResume, "Data Scientist"); // process data scientist resume 
        processResume(productResume, "Product Manager"); // process product manager resume 
    }
}
