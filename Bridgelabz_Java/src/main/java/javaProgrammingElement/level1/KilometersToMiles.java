package javaProgrammingElement.level1;
// Creating Class with name KilometersToMiles to convert kilometers to miles
class KilometersToMiles {

    public static void main(String[] args) {

        // Create a double variable distanceInKilometers and assign value 10.8
        double distanceInKilometers = 10.8;

        // Create a double variable kilometersToMiles and assign conversion value 1.6
        double kilometersToMiles = 1.6;

        // Calculate the distance in miles
        double distanceInMiles = distanceInKilometers * kilometersToMiles;

        // Display the result
        System.out.println("The distance " + distanceInKilometers + " km in miles is " + distanceInMiles);
    }
}
