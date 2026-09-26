package javaMethods.level3;
import java.util.Scanner;
import java.lang.Math;
/*generate a 6 digit otp using random function and loop for 10
  Comdition: otp should be unique
 */
public class Otp {
    //create a method to generate otp
    public static int generateOTP() {
        int otp = (int)(Math.random() * 900000) + 100000;
        return otp;
    }

    // 2. Check whether all OTPs are unique
    public static boolean areOTPUnique(int[] otpNumbers) {
        for (int i = 0; i < otpNumbers.length; i++) {
            for (int j = i + 1; j < otpNumbers.length; j++) {
                if (otpNumbers[i] == otpNumbers[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);

        int[] otpNumbers = new int[10];
        // Generate OTP 10 times
        for (int i = 0; i < otpNumbers.length; i++) {
            otpNumbers[i] = generateOTP();
        }
        // Display the OTPs
        System.out.println("The generated OTPs are:");
        for (int i = 0; i < otpNumbers.length; i++) {
            System.out.println(otpNumbers[i]);
        }

        // Check uniqueness
        if (areOTPUnique(otpNumbers)) {
            System.out.println("All 10 OTPs are unique.");
        } else {
            System.out.println("Some OTPs are repeated.");
        }

        input.close();
    }
}
