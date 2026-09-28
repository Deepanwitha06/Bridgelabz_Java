package javaStrings.BuiltinFunctions;
import java.time.ZonedDateTime;
import java.time.ZoneId;
/*
     create a class to display current time in different zone times
 */
public class CurrentDateTimeZoned {
    public static void main(String[] args){
        //create zoned date time object
        ZonedDateTime pst=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        ZonedDateTime ist=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime gmt=ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Cureent date and time :" +
                "\nGMT : "+ gmt+
                "\nIST : "+ist +
                "\nPST : "+pst);

    }
}
