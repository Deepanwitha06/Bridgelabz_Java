package javaConstructorsAndAccesModifiers.AccessModifiers;
import java.util.Scanner;
/*
       create,
       Class : Student
       Subclass : PostgraduateStudent
       Attributes: rollNumber (public)
                   name(protected)
                   CGPA(private)
       Methods: public method to modify and access CGPA

 */
class Student{
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(String name,double CGPA){
        this.name=name;
        this.CGPA=CGPA;
    }

    //public method to modify CGPA
    public void modifyCGPA(double newCGPA){
        CGPA=newCGPA;
    }
    //public method to access cgpa
    public double getCGPA() {
        return CGPA;
    }
}

//subclass
class PostgraduateStudent extends Student{
    public PostgraduateStudent(String name,double CGPA){
        super(name,CGPA);
    }
    public void display(){
        System.out.println("\nStudent Details: ");
        System.out.println("Roll No.: "+rollNumber);
        System.out.println("Name: "+name);
        System.out.println("CGPA: "+getCGPA());
    }
}
public class UniversityManagementSystem {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take inputs
        System.out.println("Enter the roll no, name and CGPA of the student: ");
        int rollNumber=input.nextInt();
        input.nextLine();
        String name=input.nextLine();
        double CGPA=input.nextDouble();
        input.nextLine();

        System.out.println("Student details :");
        PostgraduateStudent postgraduateStudent=new PostgraduateStudent(name,CGPA);
        postgraduateStudent.rollNumber=rollNumber;
        postgraduateStudent.display();;

        System.out.println("Enter the updated CGPA:");
        double newCGPA=input.nextDouble();
        postgraduateStudent.modifyCGPA(newCGPA);
        postgraduateStudent.display();

        input.close();
    }
}
