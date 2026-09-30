package javaConstructorsAndAccesModifiers.InstancevsClass;
import java.util.Scanner;
/*
      create a class Course
      Attributes: instance Variables/non-static : courseName,duration,fee
                  class Variables/static:  instituteName
      Methods: instance/non-static method :  displayCourseDetails()
                class/static method       :  updateInstituteName()
 */
class Course{
    private String courseName;                              //instance variables
    private double duration;                                //instance variables
    private double fee;                                    //instance variables
    private static String instituteName="Sri chaitanya";   //class variable

    public Course(String courseName,double duration, double fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }

    //instance method
    public void displayCourseDetails(){
        System.out.println("\nCourse Details: ");
        System.out.println("Course Name :"+courseName);
        System.out.println("Duration : "+duration);
        System.out.println("Fee : "+fee);
        System.out.println("Institute Name: " + instituteName);
    }

    //class method
    public static void updateInstituteName(String newInstituteName){
        System.out.print("The institute name is updated from "+instituteName+" to");
        instituteName=newInstituteName;
        System.out.println(instituteName);
    }
}

public class OnlineCourseManagement {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take input
        System.out.println("Enter the new institute name :");
        String newInstituteName=input.nextLine();
        System.out.println("Enter the course name, duration and fee for course 1: ");
        String courseName1=input.nextLine();
        double duration1=input.nextDouble();
        double fee1=input.nextDouble();
        input.nextLine();

        System.out.println("Enter the course name, duration and fee for course 2: ");
        String courseName2=input.nextLine();
        double duration2=input.nextDouble();
        double fee2=input.nextDouble();

        //create class object
        Course.updateInstituteName(newInstituteName);
        Course course1=new Course(courseName1,duration1,fee1);
        course1.displayCourseDetails();
        Course course2=new Course(courseName2,duration2,fee2);
        course2.displayCourseDetails();

        input.close();
    }
}
