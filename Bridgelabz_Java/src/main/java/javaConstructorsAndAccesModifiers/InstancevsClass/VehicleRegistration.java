package javaConstructorsAndAccesModifiers.InstancevsClass;
import java.util.Scanner;
/*
      create a class Vehicle
      Attributes: instance Variables/non-static : ownerName, VehicleType
                  class Variables/static:  registrationFee
      Methods: instance/non-static method :  displayVehicleDetails()
                class/static method       :  updateRegistrationFee()
 */
class Vehicle{
    private String ownerName;                     //instance variable
    private String vehicleType;                    //instance variable
    private static double registrationFee=250.0;  //class variable

    public Vehicle(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }

    //instance method
    public void displayVehicleDetails(){
        System.out.println("\nVehicle Details: ");
        System.out.println("Owner Name : "+ownerName);
        System.out.println("Vehicle Type : "+vehicleType);
        System.out.println("Registration Fee: "+registrationFee);
    }

    //class method
    public static void updateRegistrataionFee(double newRegistrationFee){
        System.out.print("The registration fee is changes from "+registrationFee+" to ");
        registrationFee=newRegistrationFee;
        System.out.println(registrationFee);
    }
}

public class VehicleRegistration {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take inputs
        System.out.println("Enter the new registration fee: ");
        double newRegistrationFee=input.nextDouble();
        input.nextLine();
        Vehicle.updateRegistrataionFee(newRegistrationFee);

        System.out.println("\nEnter the owner name and vehicle Type for vehicle 1: ");
        String ownerName1=input.nextLine();
        String vehicleType1=input.nextLine();

        System.out.println("\nEnter the owner name and vehicle Type for vehicle 2: ");
        String ownerName2=input.nextLine();
        String vehicleType2=input.nextLine();

        //create class object
        Vehicle vehicle1=new Vehicle(ownerName1,vehicleType1);
        vehicle1.displayVehicleDetails();
        Vehicle vehicle2=new Vehicle(ownerName2,vehicleType2);
        vehicle2.displayVehicleDetails();

        input.close();
    }
}
