package javaInheritance.AssistedProblems;
import java.util.Scanner;
/*
      Super class: Employee
                  Attributes: name,id,salary
                  Methods: displayDetails()
       Sub classes: Manager, Developer, Intern
                    Manager- team Size;
                    Developer- programmingLanguage;
 */
class Employee{
    protected String name;
    protected int id;
    double salary;

    public Employee(String name ,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void displayDetails(){
        System.out.println("Name: "+name+"\nid: "+id+"\nSalary : "+salary);
    }
}

class Manager extends Employee{
    public int teamSize;

    public Manager(String name,int id,double salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }

    @Override
    public void displayDetails(){
        System.out.println("Manager Details: ");
        super.displayDetails();
        System.out.println("Team size: "+teamSize+"\n");
    }
}

class Developer extends Employee{
    public String programmingLanguage;

    public Developer(String name,int id,double salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    public void displayDetails(){
        System.out.println("Developer Details: ");
        super.displayDetails();
        System.out.println("programming Language:  "+programmingLanguage+"\n");
    }
}

class Intern extends Employee{

    public Intern(String name,int id,double salary){
        super(name,id,salary);
    }

    @Override
    public void displayDetails(){
        System.out.println("Intern Details: ");
        super.displayDetails();
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args){
        //create classes objects
        Employee manager=new Manager("Meena",102,300000,5);
        Employee developer=new Developer("Deepak",105,20000,"Python");
        Employee intern=new Intern("Inaya",108,150000);

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
