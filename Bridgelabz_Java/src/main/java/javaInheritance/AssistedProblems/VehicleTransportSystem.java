package javaInheritance.AssistedProblems;
/*
      Super class: Vehicle
                  Attributes: maxSpeed, fuelType
                  Methods: displayInfo()
       Sub classes:Car, Truck, Motorcycle
                    Car- seatCapacity
                    Truck - loadCapacity
                    MotorCycle - engineCapacity
 */

class Vehicle{
    double maxSpeed;
    String fuelType;

    public Vehicle(double maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }

    public void displayInfo(){
        System.out.println("Max speed: "+maxSpeed+"\nFuel Type: "+fuelType);
    }
}

class Car extends Vehicle{
    int seatCapacity;

    public Car(double maxSpeed,String fuelType, int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("Car details: ");
        super.displayInfo();
        System.out.println("Seat capacity: "+seatCapacity+"\n");
    }
}

class Truck extends Vehicle{
    double loadCapacity;

    public Truck(double maxSpeed,String fuelType, double loadCapacity){
        super(maxSpeed,fuelType);
        this.loadCapacity=loadCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("Truck details: ");
        super.displayInfo();
        System.out.println("Load capacity: "+loadCapacity+"\n");
    }
}

class Motorcycle extends Vehicle{
    double engineCapacity;

    public Motorcycle(double maxSpeed,String fuelType, double engineCapacity){
        super(maxSpeed,fuelType);
        this.engineCapacity=engineCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("Motorcycle details: ");
        super.displayInfo();
        System.out.println("Engine capacity: "+engineCapacity+"\n");
    }
}
public class VehicleTransportSystem {
    public static void main(String[]args){
        //create class objects
        Vehicle[] vehicles={
                new Car(180,"petrol",5),
                new Truck(120,"Diesel",15.5),
                new Motorcycle(100,"Diesel",25)
        };

        for(Vehicle current:vehicles){
            current.displayInfo();
        }
    }
}
