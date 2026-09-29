package javaClassAndObject.level1;
import java.util.Scanner;
/*
      create a class to display employee details using classes
      the details will be protected
 */
class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee details: \nid: "+id+"\nName: "+name+"\n Salary: "+salary);
    }
}

public class EmployeeMain{
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the id,name and salary: ");
        int id=input.nextInt();
        input.nextLine();
        String name=input.nextLine();
        double salary= input.nextDouble();
        Employee e= new Employee(name,id,salary);
        e.displayEmployeeDetails();

        input.close();
    }
}
