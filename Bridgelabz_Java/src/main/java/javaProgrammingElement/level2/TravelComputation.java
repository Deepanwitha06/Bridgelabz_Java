package javaProgrammingElement.level2;
import java.util.Scanner;
// Creating Class with name TravelComputation to compute travel distance and time
class TravelComputation {
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variables name,cities,distanceFromToVia,time taken between cities and take user input respectively
        System.out.print("Enter the name: ");
        String name = input.nextLine();
        System.out.print("Enter the starting city: ");      String fromCity = input.nextLine();     //from city
        System.out.print("Enter the via city: ");           String viaCity = input.nextLine();       //via city
        System.out.print("Enter the destination city: ");   String toCity = input.nextLine();        ////to city
        System.out.print("Enter the distance from starting city to via city in miles: ");
        double distanceFromToVia = input.nextDouble();
        System.out.print("Enter the time from starting city to via city in hours: ");         //time taken from starting city to via city (hr)
        int hoursFromToVia = input.nextInt();
        System.out.print("Enter the time from starting city to via city in minutes: ");       //time taken from starting city to via city (min)
        int minutesFromToVia = input.nextInt();

        int timeFromToVia = hoursFromToVia * 60 + minutesFromToVia;                             // Convert the time into minutes

        // Create a variables and take user input
        System.out.print("Enter the distance from via city to destination in miles: ");
        double distanceViaToFinalCity = input.nextDouble();
        System.out.print("Enter the time from via city to destination in hours: ");
        int hoursViaToFinalCity = input.nextInt();
        System.out.print("Enter the time from via city to destination in minutes: ");
        int minutesViaToFinalCity = input.nextInt();

        // Convert the time into minutes
        int timeViaToFinalCity = hoursViaToFinalCity * 60 + minutesViaToFinalCity;
        // Calculate the total distance
        double totalDistance =distanceFromToVia + distanceViaToFinalCity;
        // Calculate the total time
        int totalTime =timeFromToVia + timeViaToFinalCity;

        // Display the travel details
        System.out.println("The Total Distance travelled by " + name+ " from " + fromCity + " to " + toCity+ " via " + viaCity + " is " + totalDistance+ " miles and the Total Time taken is "+ totalTime + " minutes");

        // Close the Scanner
        input.close();
    }
}