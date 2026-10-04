/*

Hospital Patient Management
Description: Design a system to manage patients in a hospital:
Create an abstract class Patient with fields like patientId, name, and age.
Add an abstract method calculateBill() and a concrete method getPatientDetails().
Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
Implement an interface MedicalRecord with methods addRecord() and viewRecords().
Use encapsulation to protect sensitive patient data like diagnosis and medical history.
Use polymorphism to handle different patient types and display their billing details dynamically.
Name: Utakarsh Jain
Date: 3/10/2026
*/

package main.java.EncapsulationPolymorphismAbstractionInterfaces;
import java.util.ArrayList;

// Interface defines medical record behavior
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract class provides common patient information
abstract class Patient implements MedicalRecord {
    // Private fields protect sensitive patient information
    private int patientId;
    private String name;
    private int age;
    private ArrayList<String> medicalHistory;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        setAge(age);
        medicalHistory = new ArrayList<>();
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Validation maintains valid patient age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Billing differs for different patient types
    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    @Override
    public void addRecord(String record) {
        if (record != null && !record.isEmpty()) {
            medicalHistory.add(record);
        }
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");

        for (String record : medicalHistory) {
            System.out.println(record);
        }
    }
}

class InPatient extends Patient {
    private int days;
    private double roomCharge;

    public InPatient(int patientId, String name, int age, int days, double roomCharge) {
        super(patientId, name, age);
        this.days = days;
        this.roomCharge = roomCharge;
    }

    @Override
    public double calculateBill() {
        return days * roomCharge + 2000;
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee + 500;
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        // Parent reference manages different patient types
        ArrayList<Patient> patients = new ArrayList<>();

        InPatient patient1 =
                new InPatient(101, "Rahul", 35, 5, 3000);

        OutPatient patient2 =
                new OutPatient(102, "Priya", 28, 1000);

        patient1.addRecord("Fever");
        patient1.addRecord("Blood Test");
        patient2.addRecord("Headache");
        patient2.addRecord("General Checkup");

        patients.add(patient1);
        patients.add(patient2);

        for (Patient patient : patients) {
            patient.getPatientDetails();

            // Runtime polymorphism calls correct billing method
            System.out.println("Hospital Bill: " + patient.calculateBill());

            patient.viewRecords();
            System.out.println();
        }
    }
}
