package javaClassAndObject.level2;
import java.util.Scanner;
/*
     create a class MovieTicket
     Attributes : movieName, seatNumber, price
     Methods: Book a ticket
              Display ticket
 */
class MovieTicket{
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName){
        this.movieName=movieName;
    }

    public void bookTicket(String seatNumber,double price){
        this.seatNumber=seatNumber;
        this.price=price;
    }

    public void display(){
        System.out.println(movieName+" Movie ticket booked");
        System.out.println("Seat Number : "+seatNumber);
        System.out.println("Price : "+price);
    }
}
public class MovieTicketBooking {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take user input
        System.out.println("Enter the movie name,seat number and price:");
        String movieName=input.nextLine();
        String seatNumber=input.nextLine();
        double price=input.nextDouble();

        //create the MovieTicket class object
        MovieTicket movieTicket=new MovieTicket(movieName);
        movieTicket.bookTicket(seatNumber,price);
        movieTicket.display();

        input.close();
    }
}
