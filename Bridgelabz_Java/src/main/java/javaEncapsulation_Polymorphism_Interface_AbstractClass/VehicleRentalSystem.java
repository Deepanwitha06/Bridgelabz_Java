package javaEncapsulation_Polymorphism_Interface_AbstractClass;
/*
    Interface : Insurable
                Methods: calculateInsurance(), getInsuranceDetails()

    Abstract Class : Vehicle
                     Attributes: vehicleNumber, type, rentalRate, insurancePolicyNumber
                     Method: calculateRentalCost(int days)
                     Implements the Insurable interface

    Subclasses : Car, Bike, Truck
*/
import java.util.ArrayList;
import java.util.List;

// Interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract class
abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;

    // Constructor
    public Vehicle(String vehicleNumber,String type,double rentalRate,String insurancePolicyNumber) {
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
        this.insurancePolicyNumber=insurancePolicyNumber;
    }

    // Getters and Setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber=vehicleNumber;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type=type;
    }

    public double getRentalRate() {
        return rentalRate;
    }
    public void setRentalRate(double rentalRate) {
        if(rentalRate>=0) {
            this.rentalRate=rentalRate;
        } else {
            System.out.println("Rental rate cannot be negative.");
        }
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }
    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber=insurancePolicyNumber;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Implementing Insurable interface
    @Override
    public abstract double calculateInsurance();

    @Override
    public String getInsuranceDetails() {
        return "Insurance policy number: "+getInsurancePolicyNumber();
    }

    // Calculate total cost
    public double calculateTotalCost(int days) {
        return calculateRentalCost(days)+calculateInsurance();
    }

    // Concrete method
    public void displayDetails(int days) {
        System.out.println("Vehicle Number: "+vehicleNumber+"\nType: "+type);
        System.out.println("Rental Rate Per Day: Rs. "+rentalRate);
        System.out.println("Rental Days: "+days);
        System.out.printf("Rental Cost: Rs. %.2f%n",calculateRentalCost(days));
        System.out.printf("Insurance Cost: Rs. %.2f%n",calculateInsurance());
        System.out.println("Insurance Details: "+getInsuranceDetails());
        System.out.printf("Total Cost: Rs. %.2f%n",calculateTotalCost(days));
    }
}

// Car class
class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String vehicleNumber,double rentalRate,String insurancePolicyNumber,int seatingCapacity) {
        super(vehicleNumber,"Car",rentalRate,insurancePolicyNumber);
        this.seatingCapacity=seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        if(seatingCapacity>0) {
            this.seatingCapacity=seatingCapacity;
        } else {
            System.out.println("Seating capacity must be positive.");
        }
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate()*0.10;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance policy: "+getInsurancePolicyNumber()+" (10% of daily rental rate)";
    }
}

// Bike class
class Bike extends Vehicle {
    private boolean helmetIncluded;

    public Bike(String vehicleNumber,double rentalRate,String insurancePolicyNumber,boolean helmetIncluded) {
        super(vehicleNumber,"Bike",rentalRate,insurancePolicyNumber);
        this.helmetIncluded=helmetIncluded;
    }

    public boolean getHelmetIncluded() {
        return helmetIncluded;
    }

    public void setHelmetIncluded(boolean helmetIncluded) {
        this.helmetIncluded=helmetIncluded;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate()*0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike insurance policy: "+getInsurancePolicyNumber()+" (5% of daily rental rate)";
    }
}

// Truck class
class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String vehicleNumber,double rentalRate,String insurancePolicyNumber,double loadCapacity) {
        super(vehicleNumber,"Truck",rentalRate,insurancePolicyNumber);
        this.loadCapacity=loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        if(loadCapacity>0) {
            this.loadCapacity=loadCapacity;
        } else {
            System.out.println("Load capacity must be positive.");
        }
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate()*0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance policy: "+getInsurancePolicyNumber()+" (15% of daily rental rate)";
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {

        Vehicle vehicle1=new Car("AP39AB1234",2000,"CAR-POL-101",5);
        Vehicle vehicle2=new Bike("AP39CD5678",500,"BIKE-POL-102",true);
        Vehicle vehicle3=new Truck("AP39EF9012",5000,"TRUCK-POL-103",10);

        List<Vehicle> vehicles=new ArrayList<>();

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);

        int rentalDays=3;

        for(Vehicle vehicle:vehicles) {
            System.out.println("\n");
            vehicle.displayDetails(rentalDays);
        }
    }
}