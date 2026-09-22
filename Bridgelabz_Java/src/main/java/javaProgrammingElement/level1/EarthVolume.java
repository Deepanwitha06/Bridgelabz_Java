package javaProgrammingElement.level1;

// Creating Class with name EarthVolume to calculate the volume of Earth
class EarthVolume {

    public static void main(String[] args) {

        // Create a variable radiusOfEarth and assign value 6378 km
        double radiusOfEarth = 6378;

        // Create a variable pi using the value of PI
        double pi = Math.PI;

        // Create a variable sphereFactor for the volume formula
        double sphereFactor = 4.0 / 3.0;

        // Calculate the volume of Earth in cubic kilometers
        double volumeInCubicKilometers = sphereFactor * pi
                * radiusOfEarth * radiusOfEarth * radiusOfEarth;

        // Create a variable kilometersToMiles for conversion
        double kilometersToMiles = 0.621371;

        // Convert radius from kilometers to miles
        double radiusInMiles = radiusOfEarth * kilometersToMiles;

        // Calculate the volume of Earth in cubic miles
        double volumeInCubicMiles = sphereFactor * pi
                * radiusInMiles * radiusInMiles * radiusInMiles;

        // Display the result
        System.out.println("The volume of earth in cubic kilometers is "
                + volumeInCubicKilometers
                + " and cubic miles is " + volumeInCubicMiles);
    }
}