package javaThisStaticFinalInstanceof;
import java.util.Scanner;
/*
      create,
      class : Vehicle
      Attributes: registrationFee         (static)
                  ownerName, vehicleType           (instance)
                  registrationNumber            (final instance)
      Methods:   updateRegistrationFee()  - static
      Constructor -    initialize ownerName, vehicleType, and registrationNumber
*/
class Vehicle{
    private static double registrationFee=250;
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    //constructor to initialize productName, price, and quantity
    public Vehicle(String ownerName,String vehicleType,String registrationNumber) {
        this.ownerName= ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    //static method
    public static void  updateRegistrationFee(double newRegistrtionFee){
        registrationFee=newRegistrtionFee;
    }

    public void display(){
        System.out.println("Vehicle Details: ");
        System.out.println("Registration Number: "+registrationNumber+"\nOwner Name: "+ownerName+"\nVehicle Type: "+vehicleType+"\nRegistration Fee: "+registrationFee);
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take input
        System.out.println("Enter the owner name, vehicle type and registration number: ");
        String ownerNamer=input.nextLine();
        String vehicleType=input.nextLine();
        String registrationNumber=input.nextLine();

        //class object
        Vehicle vehicle=new Vehicle(ownerNamer,vehicleType,registrationNumber);
        if(vehicle instanceof Vehicle) {
            vehicle.display();
        }

        System.out.println("\nEnter the new Registration fee: ");
        double newRegistrationFee=input.nextDouble();
        Vehicle.updateRegistrationFee(newRegistrationFee);
        System.out.println("\nAfter registration fee update: ");
        if(vehicle instanceof Vehicle) {
            vehicle.display();
        }

        input.close();
    }
}
