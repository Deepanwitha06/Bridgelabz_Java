package javaThisStaticFinalInstanceof;
import java.util.Scanner;
/*
      create,
      class : Student
      Attributes: universityName,totalStudents          (static)
                  name, grade          (instance)
                  rollNumber             (final instance)
      Methods:   displayTotalStudents()   - static
      Constructor -   initialize name, rollNumber, and grade
*/
class  Student{
    private static String universityName="XYZ";
    private static int totalStudents=0;
    private String name;
    private char grade;
    private final int rollNumber;

    //constructor to initialize name, rollNumber, and grade
    public Student(String name,int rollNumber,char grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
        totalStudents++;
    }

    //static method
    public static void  displayTotalStudents(){
        System.out.println("The total no.of Students: "+totalStudents);
    }

    public void updateGrade(char newGrade){
        grade=newGrade;
    }
    public void display(){
        System.out.println("\nStudent Details:  ");
        System.out.println("University Name: " + universityName);
        System.out.println("Roll Number: "+rollNumber+"\nName: "+name+"\nGrade: "+grade);
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take input
        System.out.println("Enter the name,roll number and grade of Student 1: ");
        String name1=input.nextLine();
        int rollNumber1=input.nextInt();
        char grade1=input.next().charAt(0);
        input.nextLine();

        System.out.println("Enter the name,roll number and grade of Student 2: ");
        String name2=input.nextLine();
        int rollNumber2=input.nextInt();
        char grade2=input.next().charAt(0);

        //create class objects
        Student student1=new Student(name1,rollNumber1,grade1);
        Student student2=new Student(name2,rollNumber2,grade2);

        Student.displayTotalStudents();
        if(student1 instanceof Student){
            student1.display();
        }
        if(student2 instanceof Student){
            student2.display();
        }

        System.out.println("Enter the new grade of student 2:");
        char newGrade=input.next().charAt(0);
        student2.updateGrade(newGrade);
        System.out.println("\nafter grade update of student 2");
        student2.display();

        input.close();
    }
}


