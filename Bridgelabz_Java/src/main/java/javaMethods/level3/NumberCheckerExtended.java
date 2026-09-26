package javaMethods.level3;
import java.util.Scanner;
import java.lang.Math;
/* create a utility class named NumberChecker
Methods:
- No. of digits in the number
- digits in the number
- sum of digits
- sum of squares of digits
- check Harshad number
- frequency of each digit
- reverse the digits array
- compare two arrays
- check palindrome
- check duck number
*/

public class NumberCheckerExtended  {
    // create a method to count the digits in number
    public static int countOfDigits(int number) {
        int count = 0;
        if (number == 0) {
            return 1;
        }
        while (number != 0) {
            int digit = number % 10;
            count++;
            number = number / 10;
        }
        return count;
    }

    // create a method to store digits
    public static int[] digitsOfNumber(int number, int count) {
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }

    // create a method to find the sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum = sum + digits[i];
        }
        return sum;
    }

    // create a method to find the sum of squares of digits
    public static double sumOfSquares(int[] digits) {
        double sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum = sum + Math.pow(digits[i], 2);
        }
        return sum;
    }

    // create a method to check if number is Harshad number
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        if (number % sum == 0) {
            return true;
        }
        return false;
    }

    // create a method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        // store digits 0 to 9 in first column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        // count frequency
        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i];
            frequency[digit][1]++;
        }
        return frequency;
    }

    // create a method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reverse = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reverse[i] = digits[digits.length - 1 - i];
        }
        return reverse;
    }

    // create a method to compare two arrays
    public static boolean compareArrays(int[] digits, int reverse[]) {
        if (digits.length != reverse.length) {
            return false;
        }
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    // create a method to check if number is palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reverse = reverseArray(digits);
        return compareArrays(digits, reverse);
    }

    // create a method to check if number is duck number
    public static boolean isDuck(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);

        // create a variable and take input
        System.out.println("Enter the number:");
        int number = input.nextInt();

        // find number of digits
        int noOfDigits = countOfDigits(number);

        // store digits
        int[] digits = digitsOfNumber(number, noOfDigits);

        System.out.println(
                "Pick an option:\n" +
                        "Option 1: No. of digits\n" +
                        "Option 2: Digits of the number\n" +
                        "Option 3: Sum of digits\n" +
                        "Option 4: Sum of squares of digits\n" +
                        "Option 5: Check Harshad number\n" +
                        "Option 6: Frequency of each digit\n" +
                        "Option 7: Reverse the digits\n" +
                        "Option 8: Compare two arrays\n" +
                        "Option 9: Check palindrome\n" +
                        "Option 10: Check duck number"
        );

        int op = input.nextInt();

        switch (op) {

            case 1:
                System.out.println("Number of digits = " + noOfDigits);
                break;

            case 2:
                System.out.println("The digits are:");

                for (int i = 0; i < digits.length; i++) {
                    System.out.println(digits[i]);
                }

                break;

            case 3:
                System.out.println(
                        "The sum of digits is = "
                                + sumOfDigits(digits)
                );
                break;

            case 4:
                System.out.println(
                        "The sum of squares of digits is = "
                                + sumOfSquares(digits)
                );
                break;

            case 5:
                if (isHarshad(number, digits)) {
                    System.out.println("It is a Harshad number");
                } else {
                    System.out.println("It is not a Harshad number");
                }

                break;

            case 6:

                int[][] result = digitFrequency(digits);

                System.out.println("Digit\tFrequency");

                for (int i = 0; i < result.length; i++) {

                    if (result[i][1] > 0) {
                        System.out.println(
                                result[i][0] + "\t" + result[i][1]
                        );
                    }
                }

                break;

            case 7:

                int[] reverse = reverseArray(digits);

                System.out.println("The reversed digits are:");

                for (int i = 0; i < reverse.length; i++) {
                    System.out.println(reverse[i]);
                }

                break;

            case 8:

                int[] reversed = reverseArray(digits);

                if (compareArrays(digits, reversed)) {
                    System.out.println("The arrays are equal");
                } else {
                    System.out.println("The arrays are not equal");
                }

                break;

            case 9:

                if (isPalindrome(digits)) {
                    System.out.println("It is a palindrome number");
                } else {
                    System.out.println("It is not a palindrome number");
                }

                break;

            case 10:

                if (isDuck(digits)) {
                    System.out.println("It is a duck number");
                } else {
                    System.out.println("It is not a duck number");
                }

                break;

            default:
                System.out.println("Invalid option");
        }

        input.close();
    }
}