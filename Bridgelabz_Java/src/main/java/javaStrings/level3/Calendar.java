package javaStrings.level3;
import java.util.Scanner;
/*
   create a class to display a calendar for a given month and year
   use Gregorian calendar algorithm to find the first day
*/
public class Calendar {
    // A method to get the name of the month
    public static String getMonthName(int month) {
        String[] months={"January","February","March","April","May","June", "July","August","September","October","November","December"};
        return months[month-1];
    }

    // A method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        if((year%400==0)||(year%4==0 && year%100!=0)) {
            return true;
        }
        return false;
    }

    // A method to get the number of days in the month
    public static int getNumberOfDays(int month,int year) {
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if(month==2 && isLeapYear(year)) {
            return 29;
        }
        return days[month-1];
    }

    // A method to get the first day of the month
    public static int getFirstDay(int month,int year) {
        int y0=year-(14-month)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=month+12*((14-month)/12)-2;
        int d0=(1+x+31*m0/12)%7;
        return d0;
    }

    public static void main(String[] args) {
        // create a scanner object
        Scanner input=new Scanner(System.in);

        // create variables and take inputs
        System.out.print("Enter month and year: ");
        int month=input.nextInt();
        int year=input.nextInt();

        String monthName=getMonthName(month);
        int numberOfDays=getNumberOfDays(month,year);
        int firstDay=getFirstDay(month,year);

        // Display the calendar
        System.out.println("       "+monthName+" "+year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // First loop for indentation
        for(int i=0;i<firstDay;i++) {
            System.out.printf("%3s"," ");
        }
        // Second loop to display the days
        for(int day=1;day<=numberOfDays;day++) {
            System.out.printf("%3d",day);
            if((firstDay+day)%7==0) {
                System.out.println();
            }
        }

        input.close();
    }
}