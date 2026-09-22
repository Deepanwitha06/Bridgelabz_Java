package javaControlFlow.level2;
import java.util.Scanner;

//create class to grade students
public class Grade {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //Create variables and take user inputs
        System.out.print("Enter math,physics and chemistry marks:");
        int math=input.nextInt();
        int phy=input.nextInt();
        int che=input.nextInt();
        int total=math+che+phy;
        double avg=total/3;
        if (avg>=80){
            System.out.print("Grade A");
        }else if(avg<79 && avg>70){
            System.out.print("Grade B");
        }else if(avg<69 && avg>60){
            System.out.print("Grade C");
        }else if(avg<59 && avg>50){
            System.out.print("Grade D");
        }else if(avg<49 && avg>40) {
            System.out.print("Grade E");
        }else{
            System.out.print("Remedial Standards");
        }
        input.close();
    }
}
