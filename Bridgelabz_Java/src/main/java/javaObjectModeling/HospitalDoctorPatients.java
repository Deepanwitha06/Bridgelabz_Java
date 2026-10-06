
package javaObjectModeling;

/*
    Hospital, Doctors, and Patients
    --------------------------------

    Class: Hospital
        Attributes: hospitalName, doctors, patients
        Relationships:
            Association with Doctor
            Association with Patient

    Class: Doctor
        Attributes: doctorId, doctorName, specialization
        Relationship:
            Association with Patient

    Class: Patient
        Attributes: patientId, patientName, disease
        Relationship:
            Association with Doctor

    Association:
        One Doctor can consult multiple Patients.
        One Patient can consult multiple Doctors.
        Therefore, Doctor and Patient have a many-to-many relationship.

    Communication:
        Doctor communicates with Patient through the consult() method.
        The Doctor object calls the consult() method and displays
        the consultation between the Doctor and Patient.
*/


// Patient class
class Patient {
    private int patientId;
    private String patientName;
    private String disease;

    public Patient(int patientId,String patientName,String disease) {
        this.patientId=patientId;
        this.patientName=patientName;
        this.disease=disease;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDisease() {
        return disease;
    }

    public void displayPatient() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Disease: " + disease);
    }
}


// Doctor class
class Doctor {
    private int doctorId;
    private String doctorName;
    private String specialization;

    public Doctor(int doctorId,String doctorName,String specialization) {
        this.doctorId=doctorId;
        this.doctorName=doctorName;
        this.specialization=specialization;
    }

    // Communication between Doctor and Patient
    public void consult(Patient patient) {
        System.out.println("Dr. " + doctorName + " is consulting patient " +patient.getPatientName() + " for " + patient.getDisease());
    }

    public void displayDoctor() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
    }
}


// Hospital class
class Hospital {
    private String hospitalName;

    // Association
    private Doctor[] doctors;

    // Association
    private Patient[] patients;

    public Hospital(String hospitalName,Doctor[] doctors,Patient[] patients) {
        this.hospitalName=hospitalName;
        this.doctors=doctors;
        this.patients=patients;
    }

    public void displayHospital() {
        System.out.println("Hospital: " + hospitalName);

        System.out.println("\nDoctors:");

        for(Doctor doctor : doctors) {
            doctor.displayDoctor();
            System.out.println();
        }

        System.out.println("Patients:");

        for(Patient patient : patients) {
            patient.displayPatient();
            System.out.println();
        }
    }
}


// Main class
public class HospitalDoctorPatients {
    public static void main(String[] args) {

        // Create Doctor objects
        Doctor doctor1=new Doctor(101,"Ravi","Cardiologist");
        Doctor doctor2=new Doctor(102,"Priya","Neurologist");
        Doctor doctor3=new Doctor(103,"Arun","General Physician");


        // Create Patient objects
        Patient patient1= new Patient(201,"Deepa","Heart Problem");
        Patient patient2= new Patient(202,"Rahul","Headache");
        Patient patient3= new Patient(203,"Ananya","Fever");


        // Create arrays
        Doctor[] doctors={doctor1, doctor2, doctor3};
        Patient[] patients={patient1, patient2, patient3};


        // Create Hospital
        Hospital hospital= new Hospital("SRM Hospital",doctors,patients);
        // Display Hospital details
        hospital.displayHospital();

        System.out.println("\nConsultations:");

        // Doctor-Patient association and communication
        doctor1.consult(patient1);
        doctor1.consult(patient2);

        doctor2.consult(patient1);
        doctor2.consult(patient3);

        doctor3.consult(patient2);
        doctor3.consult(patient3);
    }
}
