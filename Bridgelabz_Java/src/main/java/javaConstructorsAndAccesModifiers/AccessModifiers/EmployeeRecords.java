package javaConstructorsAndAccesModifiers.AccessModifiers;
import java.util.Scanner;
/*
     create,
     class : Employee
     Subclass: Manager
     Attributes : employeeID (public)
                  department (protected)
                  salary      (private)
 */
class Employee{
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary){
        this.employeeID=employeeID;
        this.department=department;
        this.salary=salary;
    }

    public void modifySalary(double newSalary){
        salary=newSalary;
    }

    public double getSalary() {
        return salary;
    }
}

//subclass
class Manager extends Employee{
    public Manager(int employeeID,String department,double salary){
        super(employeeID,department,salary);
    }

    public void display(){
        System.out.println("\nEmployee Details: ");
        System.out.println("Employee ID: "+employeeID+"\nDepartment: "+department+"\nSalary: "+getSalary());
    }
}
public class EmployeeRecords {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take input
        System.out.println("Enter the employee id,department and salary of employee: ");
        int employeeId=input.nextInt();
        input.nextLine();
        String department=input.nextLine();
        double salary=input.nextDouble();

        Manager manager=new Manager(employeeId,department,salary);
        manager.display();

        System.out.println("\nEnter the new salary: ");
        double newSalary=input.nextDouble();
        manager.modifySalary(newSalary);
        manager.display();

        input.close();
    }
}
