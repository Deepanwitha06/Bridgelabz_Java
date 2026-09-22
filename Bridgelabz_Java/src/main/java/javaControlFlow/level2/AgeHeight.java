package javaControlFlow.level2;
import java.util.Scanner;

public class AgeHeight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking ages
        System.out.print("Enter Amar's age and height: ");
        int amarAge = input.nextInt();
        double amarHeight = input.nextDouble();

        System.out.print("Enter Akbar's age and height: ");
        int akbarAge = input.nextInt();
        double akbarHeight = input.nextDouble();

        System.out.print("Enter Anthony's age and height:");
        int anthonyAge = input.nextInt();
        double anthonyHeight = input.nextDouble();


        // Finding youngest
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Youngest friend is Amar");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Youngest friend is Akbar");
        } else {
            System.out.println("Youngest friend is Anthony");
        }

        // Finding tallest
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Tallest friend is Amar");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Tallest friend is Akbar");
        } else {
            System.out.println("Tallest friend is Anthony");
        }

        input.close();
    }
}
