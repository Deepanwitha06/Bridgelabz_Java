package javaMethods.level3;
import java.util.Scanner;
/* Create a class to display a calendar for a given month and year
Methods:
- Get month name
- Check leap year
- Get number of days in month
- Get first day of the month
- Display calendar
*/

public class Calendar {
    // 1. Get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // 2. Check Leap Year
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 3. Get number of days in the month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // 4. Get the first day of the month
    public static int getFirstDay(int month, int year) {
        int day = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;
        return d0;
    }

    // 5. Display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int numberOfDays = getDaysInMonth(month, year);
        int firstDay = getFirstDay(month, year);
        System.out.println("      " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        // First loop: indentation before day 1
        for (int i = 0; i < firstDay; i++) {
            System.out.printf("%3s", "");
        }
        // Second loop: display days
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d", day);
            // Move to next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);

        //create a variable and take user input
        System.out.println("Enter the month and year :");
        int month = input.nextInt();
        int year = input.nextInt();

        //display calendar
        displayCalendar(month, year);

        input.close();
    }
}