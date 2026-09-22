package javaProgrammingElement.level1;
// Creating Class with name PensDistribution to distribute pens
class PensDistribution {
    public static void main(String[] args) {

        // Create an int variable numberOfPens and assign value 14
        int numberOfPens = 14;

        // Create an int variable numberOfStudents and assign value 3
        int numberOfStudents = 3;

        // Calculate the number of pens each student gets
        int pensPerStudent = numberOfPens / numberOfStudents;

        // Calculate the remaining pens
        int remainingPens = numberOfPens % numberOfStudents;

        // Display the result
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
