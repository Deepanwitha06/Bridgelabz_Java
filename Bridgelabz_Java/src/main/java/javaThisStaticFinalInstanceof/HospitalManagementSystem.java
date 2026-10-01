package javaThisStaticFinalInstanceof;
import java.util.Scanner;
/*
      create,
      class : Patient
      Attributes: hospitalName,totalPatients          (static)
                  name, age,ailment          (instance)
                  patientID             (final instance)
      Methods:   getTotalPatients()   - static
      Constructor -    initialize name, age, and ailment
*/
class Patient{
    private static String hospitalName="XYZ";
    private static int totalPatients=0;
    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    //constructor to initialize name, age, and ailment
    public Patient(int patientID,String name,int age,String ailment){
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        totalPatients++;
        this.patientID=patientID;
    }

    //static method
    public static int getTotalPatients(){
        return totalPatients;
    }

    public void display(){
        System.out.println("\nPatient Details:  ");
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: "+patientID+"\nPatient Name: "+name+"\nAge: "+age+"\nAilment: "+ailment);
    }
}
public class HospitalManagementSystem {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take input
        System.out.println("Enter the id,name,age and ailment of patient 1: ");
        int patientID1=input.nextInt();
        input.nextLine();
        String name1=input.nextLine();
        int age1=input.nextInt();
        input.nextLine();
        String ailment1=input.nextLine();

        System.out.println("Enter the id,name,age and ailment of patient 2: ");
        int patientID2=input.nextInt();
        input.nextLine();
        String name2=input.nextLine();
        int age2=input.nextInt();
        input.nextLine();
        String ailment2=input.nextLine();

        //create class objects
        Patient patient1=new Patient(patientID1,name1,age1,ailment1);
        Patient patient2=new Patient(patientID2,name2,age2,ailment2);

        System.out.println("Total no.of patients: "+Patient.getTotalPatients());
        if(patient1 instanceof Patient){
            patient1.display();
        }
        if(patient2 instanceof Patient){
            patient2.display();
        }

        input.close();
    }
}
