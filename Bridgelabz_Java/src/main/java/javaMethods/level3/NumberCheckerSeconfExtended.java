package javaMethods.level3;
import java.util.Scanner;
import java.lang.Math;
/*create a utility class named NumberChecker
Methods:
- Check prime number
- Check neon number
- Check spy number
- Check automorphic number
- Check buzz number
- Find factors
- Find greatest factor
- Find sum of factors
- Find product of factors
- Find product of cubes of factors
- Check perfect number
- Check abundant number
- Check deficient number
- Check strong number
*/

public class NumberCheckerSeconfExtended {
    // 1. Check Prime Number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 2. Check Neon Number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square != 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }
        return sum == number;
    }

    // 3. Check Spy Number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            product = product * digit;
            number = number / 10;
        }
        return sum == product;
    }

    // 4. Check Automorphic Number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;
        while (temp != 0) {
            if (square % 10 != temp % 10) {
                return false;
            }
            square = square / 10;
            temp = temp / 10;
        }
        return true;
    }

    // 5. Check Buzz Number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // 6. Find Factors
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        // Create array based on number of factors
        int[] factors = new int[count];
        int index = 0;
        // Second loop: find and store factors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // 7. Find Greatest Factor
    public static int greatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] > greatest) {
                greatest = factors[i];
            }
        }
        return greatest;
    }

    // 8. Find Sum of Factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum = sum + factors[i];
        }
        return sum;
    }

    // 9. Find Product of Factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product = product * factors[i];
        }
        return product;
    }

    // 10. Find Product of Cube of Factors
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int i = 0; i < factors.length; i++) {
            product = product * Math.pow(factors[i], 3);
        }
        return product;
    }

    // 11. Check Perfect Number
    public static boolean isPerfect(int number, int[] factors) {
        int sum = sumOfFactors(factors);
        return sum == number;
    }

    // 12. Check Abundant Number
    public static boolean isAbundant(int number, int[] factors) {
        int sum = sumOfFactors(factors);
        return sum > number;
    }

    // 13. Check Deficient Number
    public static boolean isDeficient(int number, int[] factors) {
        int sum = sumOfFactors(factors);
        return sum < number;
    }

    // 14. Check Strong Number
    public static boolean isStrong(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }
            sum = sum + factorial;
            number = number / 10;
        }
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        int[] factors = findFactors(number);
        System.out.println(
                "Pick an option:\n" +
                        "Option 1: Check Prime Number\n" +
                        "Option 2: Check Neon Number\n" +
                        "Option 3: Check Spy Number\n" +
                        "Option 4: Check Automorphic Number\n" +
                        "Option 5: Check Buzz Number\n" +
                        "Option 6: Find Factors\n" +
                        "Option 7: Find Greatest Factor\n" +
                        "Option 8: Find Sum of Factors\n" +
                        "Option 9: Find Product of Factors\n" +
                        "Option 10: Find Product of Cube of Factors\n" +
                        "Option 11: Check Perfect Number\n" +
                        "Option 12: Check Abundant Number\n" +
                        "Option 13: Check Deficient Number\n" +
                        "Option 14: Check Strong Number"
        );

        int op = input.nextInt();
        switch (op) {

            case 1:
                if (isPrime(number)) {
                    System.out.println("It is a Prime Number");
                } else {
                    System.out.println("It is not a Prime Number");
                }
                break;
            case 2:
                if (isNeon(number)) {
                    System.out.println("It is a Neon Number");
                } else {
                    System.out.println("It is not a Neon Number");
                }
                break;
            case 3:
                if (isSpy(number)) {
                    System.out.println("It is a Spy Number");
                } else {
                    System.out.println("It is not a Spy Number");
                }
                break;
            case 4:
                if (isAutomorphic(number)) {
                    System.out.println("It is an Automorphic Number");
                } else {
                    System.out.println("It is not an Automorphic Number");
                }
                break;
            case 5:
                if (isBuzz(number)) {
                    System.out.println("It is a Buzz Number");
                } else {
                    System.out.println("It is not a Buzz Number");
                }
                break;
            case 6:
                System.out.println("The factors are:");
                for (int i = 0; i < factors.length; i++) {
                    System.out.println(factors[i]);
                }
                break;

            case 7:
                System.out.println(
                        "The greatest factor is = "
                                + greatestFactor(factors)
                );
                break;
            case 8:
                System.out.println(
                        "The sum of factors is = "
                                + sumOfFactors(factors)
                );
                break;
            case 9:
                System.out.println(
                        "The product of factors is = "
                                + productOfFactors(factors)
                );
                break;
            case 10:
                System.out.println(
                        "The product of cube of factors is = "
                                + productOfCubeOfFactors(factors)
                );
                break;
            case 11:
                if (isPerfect(number, factors)) {
                    System.out.println("It is a Perfect Number");
                } else {
                    System.out.println("It is not a Perfect Number");
                }
                break;
            case 12:
                if (isAbundant(number, factors)) {
                    System.out.println("It is an Abundant Number");
                } else {
                    System.out.println("It is not an Abundant Number");
                }
                break;
            case 13:
                if (isDeficient(number, factors)) {
                    System.out.println("It is a Deficient Number");
                } else {
                    System.out.println("It is not a Deficient Number");
                }
                break;
            case 14:
                if (isStrong(number)) {
                    System.out.println("It is a Strong Number");
                } else {
                    System.out.println("It is not a Strong Number");
                }
                break;
            default:
                System.out.println("Invalid option");
        }

        input.close();
    }
}
