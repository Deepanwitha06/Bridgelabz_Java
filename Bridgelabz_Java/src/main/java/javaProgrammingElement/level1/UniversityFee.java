package javaProgrammingElement.level1;
// Creating Class with name UniversityFee to calculate discounted fee
class UniversityFee {
    public static void main(String[] args) {

        // Create a variable fee and assign value 125000
        double fee = 125000;

        // Create a variable discountPercent and assign value 10
        double discountPercent = 10;

        // Calculate the discount amount
        double discount = fee * discountPercent / 100;

        // Calculate the final discounted fee
        double discountedFee = fee - discount;

        // Display the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}