package javaInheritance.HybridInheritance;
/*
    Superclass : Vehicle
                  Attributes: maxSpeed, model
    Subclasses : ElectricVehicle, PetrolVehicle
    Interface : Refuelable
                Method: refuel()
    ElectricVehicle has the charge() method.
    PetrolVehicle implements the Refuelable interface.
*/

class Vehicle {
    String model;
    int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void  displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Maximum Speed: " + maxSpeed + " km/h");
    }
}

// Interface
interface Refuelable {
    void refuel();
}

// Subclass 1
class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void  charge() {
        System.out.println(model + " is charging.");
    }
}

// Subclass 2
class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
    }
}

// Main class
public class VehicleManagementSystem {
    public static void main(String[] args) {

        // Creating an ElectricVehicle object
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 225);

        System.out.println("=== Electric Vehicle ===");
        ev.displayDetails();
        ev.charge();

        System.out.println();

        // Creating a PetrolVehicle object
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

        System.out.println("=== Petrol Vehicle ===");
        pv.displayDetails();
        pv.refuel();
    }
}