package javaEncapsulation_Polymorphism_Interface_AbstractClass;

/*
    Interface : MedicalRecord
                Methods: addRecord(), viewRecords()

    Abstract Class : Patient
                     Attributes: patientId, name, age, diagnosis, medicalHistory
                     Methods: calculateBill(), getPatientDetails()
                     Implements the MedicalRecord interface

    Subclasses : InPatient, OutPatient

*/

import java.util.ArrayList;
import java.util.List;

// Interface
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract class
abstract class Patient implements MedicalRecord {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private String medicalHistory;
    private List<String> records;

    public Patient(int patientId,String name,int age,String diagnosis,String medicalHistory) {
        this.patientId=patientId;
        this.name=name;
        this.age=age;
        this.diagnosis=diagnosis;
        this.medicalHistory=medicalHistory;
        this.records=new ArrayList<>();
    }

    // Getters and setters
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        if(patientId>0) this.patientId=patientId;
        else System.out.println("Patient ID must be positive.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0) this.age=age;
        else System.out.println("Age must be positive.");
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis=diagnosis;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory=medicalHistory;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: "+patientId+"\nPatient Name: "+name+"\nAge: "+age+"\nDiagnosis: "+diagnosis+"\nMedical History: "+medicalHistory);
        System.out.printf("Total Bill: Rs. %.2f%n",calculateBill());
    }

    // Interface method
    @Override
    public void addRecord(String record) {
        if(record!=null && !record.trim().isEmpty()) {
            records.add(record);
            System.out.println("Medical record added successfully.");
        }
        else {
            System.out.println("Medical record cannot be empty.");
        }
    }

    // Interface method
    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");

        if(records.isEmpty()) {
            System.out.println("No medical records available.");
        }
        else {
            for(String record:records) {
                System.out.println("- "+record);
            }
        }
    }
}

// InPatient subclass
class InPatient extends Patient {
    private int daysAdmitted;
    private double roomChargePerDay;
    private double treatmentCharge;

    public InPatient(int patientId,String name,int age,String diagnosis,String medicalHistory, int daysAdmitted,double roomChargePerDay,double treatmentCharge) {
        super(patientId,name,age,diagnosis,medicalHistory);
        this.daysAdmitted=daysAdmitted;
        this.roomChargePerDay=roomChargePerDay;
        this.treatmentCharge=treatmentCharge;
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    public void setDaysAdmitted(int daysAdmitted) {
        if(daysAdmitted>0) this.daysAdmitted=daysAdmitted;
        else System.out.println("Days admitted must be positive.");
    }

    @Override
    public double calculateBill() {
        return (daysAdmitted*roomChargePerDay)+treatmentCharge;
    }
}

// OutPatient subclass
class OutPatient extends Patient {
    private double consultationFee;
    private double testCharges;

    public OutPatient(int patientId,String name,int age,String diagnosis,String medicalHistory, double consultationFee,double testCharges) {
        super(patientId,name,age,diagnosis,medicalHistory);
        this.consultationFee=consultationFee;
        this.testCharges=testCharges;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        if(consultationFee>=0) this.consultationFee=consultationFee;
        else System.out.println("Consultation fee cannot be negative.");
    }

    @Override
    public double calculateBill() {
        return consultationFee+testCharges;
    }
}

// Main class
public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient patient1=new InPatient(101,"Rahul",45,"Pneumonia","Asthma", 3,2000,5000);
        Patient patient2=new OutPatient(102,"Priya",28,"Fever","No previous illness", 800,1200);
        Patient patient3=new InPatient(103,"Arun",60,"Fracture","Diabetes", 5,2500,8000);
        patient1.addRecord("Blood test completed.");
        patient1.addRecord("Medication prescribed.");

        patient2.addRecord("General consultation completed.");

        patient3.addRecord("X-ray completed.");
        patient3.addRecord("Follow-up required.");
        List<Patient> patients=new ArrayList<>();

        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);

        processPatients(patients);
    }

    // Process patients using polymorphism
    public static void processPatients(List<Patient> patients) {
        double grandTotal=0;

        for(Patient patient:patients) {
            System.out.println("\n");
            patient.getPatientDetails();
            patient.viewRecords();
            grandTotal+=patient.calculateBill();
        }

        System.out.println("\n");
        System.out.printf("Total Hospital Revenue: Rs. %.2f%n",grandTotal);
    }
}