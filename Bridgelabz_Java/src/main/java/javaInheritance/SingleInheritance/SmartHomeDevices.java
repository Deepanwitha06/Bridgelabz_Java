package javaInheritance.SingleInheritance;
import java.util.Scanner;
/*
       superclass: Device
                  Attributes: deviceID,status
                  Methods: displayStatus()
        subclass: Thermostat
                  Attributes: temperatureSetting
 */
class Device{
    int deviceID;
    String status;

    public Device(int deviceID,String status){
        this.deviceID=deviceID;
        this.status=status;
    }

    public void displayStatus(){
        System.out.println("Device details: ");
        System.out.println("Device id: "+deviceID+"\nStatus: "+status);
    }
}

class Thermostat extends Device{
    String temperatureSetting;

    public Thermostat(int deviceID,String status, String temperatureSetting){
        super(deviceID,status);
        this.temperatureSetting=temperatureSetting;
    }

    @Override
    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting: "+temperatureSetting);
    }
}

public class SmartHomeDevices {
    public static void main(String[] args){
       //create class object
        Thermostat thermostat=new Thermostat(1,"on","high");
        thermostat.displayStatus();
    }
}
