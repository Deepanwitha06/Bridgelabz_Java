package javaProgrammingElement.level1;
// Creating Class with name SamAverageMarks to calculate average marks
class SamAverageMarks {
    public static void main(String[] args) {

        // Create an int variable mathsMarks and assign value 94
        int mathsMarks = 94;

        // Create an int variable physicsMarks and assign value 95
        int physicsMarks = 95;

        // Create an int variable chemistryMarks and assign value 96
        int chemistryMarks = 96;

        // Calculate the total marks
        int totalMarks = mathsMarks + physicsMarks + chemistryMarks;

        // Calculate the average percentage mark
        double averageMarks = totalMarks / 3.0;

        // Display the result
        System.out.println("Sam's average mark in PCM is " + averageMarks);
    }
}
