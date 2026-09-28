package javaStrings.BuiltinFunctions;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/*
     create a class to display the current date in three formats
 */
public class DateFormatting {
    public static void main (String[] args){
        LocalDate date=LocalDate.now();

        DateTimeFormatter formatt1= DateTimeFormatter.ofPattern("dd/MM/yyy");
        DateTimeFormatter formatt2= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatt3=DateTimeFormatter.ofPattern("EEEE, MMMM dd ,yyyy");

        System.out.println("Current time in 3 formats: ");
        System.out.println(date.format(formatt1));
        System.out.println(date.format(formatt2));
        System.out.println(date.format(formatt3));
    }
}
