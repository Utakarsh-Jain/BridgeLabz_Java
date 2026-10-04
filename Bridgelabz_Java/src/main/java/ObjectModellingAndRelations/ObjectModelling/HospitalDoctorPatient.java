/*
 Hospital, Doctors, and Patients (Association and Communication)
Description: Model a Hospital where Doctor and Patient objects interact through consultations. A doctor can see multiple patients, and each patient can consult multiple doctors.
Tasks:
Define a Hospital class containing Doctor and Patient classes.
Create a method consult() in the Doctor class to show communication, which would display the consultation between a doctor and a patient.
Model an association between doctors and patients to show that doctors and patients can have multiple relationships.
Goal: Practice creating an association with communication between objects by modeling doctor-patient consultations.
Name : Utakarsh Jain
Date : 1/10/2026
*/

import java.util.ArrayList;
class Patient { //Class Patient
    private String name; //Method to get the name
    private ArrayList<Doctor> doctors; //Method to get the list of doctors
    public Patient(String name) { //Parameterized Constructor
        this.name = name;
        doctors = new ArrayList<>();
    }
    public String getName() { //Method to get the name
        return name;
    }
    public void addDoctor(Doctor doctor) { //Method to add the doctor
        doctors.add(doctor);
    }
    public void displayDoctors() { //Method to display the list of doctors
        System.out.println("Patient: " + name);
        for (Doctor doctor : doctors) { //Method to display the list of doctors
            System.out.println("Doctor: " + doctor.getName());
        }
    }
}
class Doctor { //Class Doctor
    private String name; //Method to get the name
    private String specialization; //Method to get the specialization
    private ArrayList<Patient> patients; //Method to get the list of patients
    public Doctor(String name, String specialization) { //Parameterized Constructor
        this.name = name;
        this.specialization = specialization;
        patients = new ArrayList<>();
    }
    public String getName() { //Method to get the name
        return name;
    }
    public void consult(Patient patient) { //Method to consult the patient
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println("Dr. " + name + " (" + specialization + ") is consulting patient " + patient.getName());
    }
    public void displayPatients() {
        System.out.println("Doctor: " + name);
        for (Patient patient : patients) { //Method to display the list of patients
            System.out.println("Patient: " + patient.getName());
        }
    }
}
class Hospital { //Class Hospital
    private String name; //Method to get the name
    private ArrayList<Doctor> doctors; //Method to get the list of doctors
    private ArrayList<Patient> patients; //Method to get the list of patients
    public Hospital(String name) { //Parameterized Constructor
        this.name = name;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }
    public void addDoctor(Doctor doctor) { //Method to add the doctor
        doctors.add(doctor);
    }
    public void addPatient(Patient patient) { //Method to add the patient
        patients.add(patient);
    }
    public void displayHospital() { //Method to display the hospital
        System.out.println("Hospital: " + name);
        System.out.println("Doctors: " + doctors.size());
        System.out.println("Patients: " + patients.size());
    }
}
public class HospitalDoctorPatient {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital"); //Creating a hospital object
        //Creating a doctor object
        Doctor doctor1 = new Doctor("Sharma", "Cardiologist"); 
        Doctor doctor2 = new Doctor("Mehta", "Neurologist"); 
        Patient patient1 = new Patient("Rahul");
        Patient patient2 = new Patient("Priya");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);
        System.out.println();
        doctor1.displayPatients();
        System.out.println();
        patient1.displayDoctors();
        System.out.println();
        hospital.displayHospital();
    }
}