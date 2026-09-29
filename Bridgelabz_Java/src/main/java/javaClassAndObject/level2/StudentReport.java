package javaClassAndObject.level2;
import java.util.Scanner;
/*
     create a student class
     Attributes: name,rollNumber,marks
     Methods: calculate grades based on marks
              display the details and grade

 */
class Student{
    private String name;
    private int rollNumber;
    private int[] marks;
    private char grade;

    public Student(String name,int rollNumber,int[] marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public void calculateGrade(){
        double total=0;
        for(int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        total=total/(double)marks.length;
        if(total>90){
            grade= 'A';
        }else if(total>80){
            grade= 'B';
        }else if(total>70){
            grade= 'C';
        }else if(total>60){
            grade= 'D';
        } else if (total>50) {
            grade= 'E';
        }else{
            grade='F';
        }
    }

    public void display(){
        System.out.println("Student details: ");
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollNumber);
        System.out.print("Marks : ");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println("\nGrade : "+grade);
    }
}
public class StudentReport {
    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);

        //create variables and take
        System.out.println("Enter the student name and roll number :");
        String name =input.nextLine();
        int rollNumber=input.nextInt();
        int[] marks=new int[3];
        System.out.println("Enter mpc marks: ");
        for(int i=0;i<marks.length;i++){
            marks[i]=input.nextInt();
        }
        Student student = new Student(name, rollNumber, marks);
        student.calculateGrade();
        student.display();

        input.close();
    }
}
