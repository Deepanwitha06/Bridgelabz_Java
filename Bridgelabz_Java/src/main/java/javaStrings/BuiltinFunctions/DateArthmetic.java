package javaStrings.BuiltinFunctions;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
/*
    take date as input from the user and do date manipulation
 */
public class DateArthmetic {
    //method to parseDate
    public static LocalDate parseDate(String inputDate){
        DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try{
            return LocalDate.parse(inputDate,formatter1);
        }catch(DateTimeException e){
            return LocalDate.parse(inputDate,formatter2);
        }
    }

    //method to manipulate date
    public static LocalDate manipulate(LocalDate date){
        date=date.plusDays(7).plusMonths(1).plusYears(2);
        date=date.minusWeeks(3);
        return date;
    }

    public static void main(String[] args){
        //create scanner variable
        Scanner input=new Scanner(System.in);

        //create a variable and take input
        System.out.println("Enter the date: ");
        String text=input.nextLine();

        LocalDate date=parseDate(text);
        LocalDate result=manipulate(date);
        System.out.println(result);

        input.close();
    }

}
