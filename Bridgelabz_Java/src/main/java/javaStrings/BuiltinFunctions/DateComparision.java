package javaStrings.BuiltinFunctions;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.util.Scanner;
/*
     create a class to compare two dates
 */
public class DateComparision {
    //a method to change the dates from string to LocalDate
    public static LocalDate getInput(String date){
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter format2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try{
            return LocalDate.parse(date,format1);
        }catch (DateTimeException e){
            return LocalDate.parse(date,format2);
        }
    }

    //compare the dates
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take imputs
        System.out.println("Enter two datesbin same format: ");
        String text1=input.nextLine();
        String text2=input.nextLine();

        LocalDate date1=getInput(text1);
        LocalDate date2=getInput(text2);
        if(date1.isBefore(date2)){
            System.out.println(date1+" comes before "+date2);
        }else if(date1.isAfter(date2)){
            System.out.println(date1+" comes after "+date2);
        }else if(date1.isEqual(date2)){
            System.out.println("Both are same dates");
        }else{
            System.out.println("The dates are of different formats");
        }

        input.close();
    }
}
