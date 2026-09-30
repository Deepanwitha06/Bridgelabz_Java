package javaConstructorsAndAccesModifiers.Constructorslevel1;
import java.util.Scanner;
/*
     create a class HotelBooking
     Attributes: guestName.roomType,nights
     Constructors: default,parameterized,copy
 */
class HotelBooking{
    private String guestName;
    private String roomType;
    private int nights;

    //default constructor
    public HotelBooking(){
    }

    //parameterized constructor
    public HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }

    public HotelBooking(HotelBooking hotelBooking){
        this.guestName=hotelBooking.guestName;
        this.roomType=hotelBooking.roomType;
        this.nights=hotelBooking.nights;
    }

    public void display(){
        System.out.println("Booking Details: ");
        System.out.println("Guest Name: "+guestName);
        System.out.println("Room type: "+roomType);
        System.out.println("No.of nights: "+nights+"\n");
    }

}
public class HotelBookingSystem {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create object and take inputs
        System.out.println("Enter the name,room type and no.of nights stay: ");
        String guestName=input.nextLine();
        String roomType=input.nextLine();
        int nights=input.nextInt();

        //class objects
        HotelBooking hotelBooking1=new HotelBooking();
        System.out.println("Default Constructor: ");
        hotelBooking1.display();

        HotelBooking hotelBooking2=new HotelBooking(guestName,roomType,nights);
        System.out.println("parameterized Constructor: ");
        hotelBooking2.display();

        HotelBooking hotelBooking3=new HotelBooking(hotelBooking2);
        System.out.println("Copy Constructor: ");
        hotelBooking3.display();

        input.close();

    }
}
