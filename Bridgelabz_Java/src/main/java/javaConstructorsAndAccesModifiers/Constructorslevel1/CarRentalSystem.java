package javaConstructorsAndAccesModifiers.Constructorslevel1;
import java.util.Scanner;
/*
     create a class CarRental
     Attributes: customerName, carModel, rentalDays
     Methods: calculate total cost
 */
class CarRental{
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental(String customerName,String carModel,int rentalDays){
        this.carModel=carModel;
        this.customerName=customerName;
        this.rentalDays=rentalDays;
    }

    private double calculateTotalCost(){
        double price=switch(carModel){
            case "A" ->500.0;
            case "B" ->200.0;
            default ->100.0;
        };
        return rentalDays*price;
    }

    public void display(){
        System.out.println("Total Cost: "+calculateTotalCost());
    }
}
public class CarRentalSystem {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take user
        System.out.println("Enter customer name, car model and no,of rental days: ");
        String customerName=input.nextLine();
        String carModel=input.nextLine();
        int rentalDays=input.nextInt();

        //create class objects
        CarRental carRental=new CarRental(customerName,carModel,rentalDays);
        carRental.display();

        input.close();
    }
}
