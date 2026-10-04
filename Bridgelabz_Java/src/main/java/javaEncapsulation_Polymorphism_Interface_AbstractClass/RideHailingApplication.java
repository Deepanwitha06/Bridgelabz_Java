package javaEncapsulation_Polymorphism_Interface_AbstractClass;
/*
    Interface : GPS
                Methods: getCurrentLocation(), updateLocation()

    Abstract Class : RideVehicle
                     Attributes: vehicleId, driverName, ratePerKm, currentLocation
                     Methods: calculateFare(), getVehicleDetails()
                     Implements the GPS interface

    Subclasses : RideCar, RideBike, RideAuto
*/

import java.util.ArrayList;
import java.util.List;

// Interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

// Abstract class
abstract class RideVehicle implements GPS {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public RideVehicle(int vehicleId,String driverName,double ratePerKm,String currentLocation) {
        this.vehicleId=vehicleId;
        this.driverName=driverName;
        this.ratePerKm=ratePerKm;
        this.currentLocation=currentLocation;
    }

    // Getters and setters
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        if(vehicleId>0) this.vehicleId=vehicleId;
        else System.out.println("Vehicle ID must be positive.");
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName=driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        if(ratePerKm>0) this.ratePerKm=ratePerKm;
        else System.out.println("Rate per kilometer must be positive.");
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: "+vehicleId+"\nDriver Name: "+driverName+"\nRate Per Km: Rs. "+ratePerKm+"\nCurrent Location: "+getCurrentLocation());
    }

    // Interface method
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Interface method
    @Override
    public void updateLocation(String location) {
            this.currentLocation=location;
            System.out.println("Location updated successfully.");
    }
}

// RideCar subclass
class RideCar extends RideVehicle {
    private double baseFare;

    public RideCar(int vehicleId,String driverName,double ratePerKm,String currentLocation,double baseFare) {
        super(vehicleId,driverName,ratePerKm,currentLocation);
        this.baseFare=baseFare;
    }

    @Override
    public double calculateFare(double distance) {
        if(distance<=0) {
            System.out.println("Distance must be positive.");
            return 0;
        }
        return baseFare+(distance*getRatePerKm());
    }
}

// RideBike subclass
class RideBike extends RideVehicle {
    private double baseFare;

    public RideBike(int vehicleId,String driverName,double ratePerKm,String currentLocation,double baseFare) {
        super(vehicleId,driverName,ratePerKm,currentLocation);
        this.baseFare=baseFare;
    }

    @Override
    public double calculateFare(double distance) {
        if(distance<=0) {
            System.out.println("Distance must be positive.");
            return 0;
        }
        return baseFare+(distance*getRatePerKm());
    }
}

// RideAuto subclass
class RideAuto extends RideVehicle {
    private double baseFare;

    public RideAuto(int vehicleId,String driverName,double ratePerKm,String currentLocation,double baseFare) {
        super(vehicleId,driverName,ratePerKm,currentLocation);
        this.baseFare=baseFare;
    }

    @Override
    public double calculateFare(double distance) {
        if(distance<=0) {
            System.out.println("Distance must be positive.");
            return 0;
        }
        return baseFare+(distance*getRatePerKm());
    }
}

// Main class
public class RideHailingApplication {
    public static void main(String[] args) {
        RideVehicle vehicle1=new RideCar(101,"Rahul",18,"Chennai",50);
        RideVehicle vehicle2=new RideBike(102,"Priya",8,"Tambaram",20);
        RideVehicle vehicle3=new RideAuto(103,"Arun",12,"Velachery",30);

        List<RideVehicle> vehicles=new ArrayList<>();

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);

        // Update vehicle locations
        vehicle1.updateLocation("T Nagar");
        vehicle2.updateLocation("Guindy");
        vehicle3.updateLocation("Adyar");

        calculateRideFares(vehicles,10);
    }

    // Calculate fares using polymorphism
    public static void calculateRideFares(List<RideVehicle> vehicles,double distance) {
        double grandTotal=0;

        for(RideVehicle vehicle:vehicles) {
            System.out.println("\n");
            vehicle.getVehicleDetails();

            double fare=vehicle.calculateFare(distance);

            System.out.printf("Ride Distance: %.2f km%n",distance);
            System.out.printf("Ride Fare: Rs. %.2f%n",fare);

            grandTotal+=fare;
        }

        System.out.println("\n");
        System.out.printf("Total Fare for All Rides: Rs. %.2f%n",grandTotal);
    }
}