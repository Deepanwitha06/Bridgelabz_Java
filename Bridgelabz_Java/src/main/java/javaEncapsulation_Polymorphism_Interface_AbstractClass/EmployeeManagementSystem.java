package javaEncapsulation_Polymorphism_Interface_AbstractClass;
/*
    Interface : Department
                Methods: assignDepartment(), getDepartmentDetails()
    Abstract Class : Employee
                     Attributes: employeeId, name, baseSalary, department
                     Methods: calculateSalary(), displayDetails()
                     Implements the Department interface
    Subclasses : FullTimeEmployee, PartTimeEmployee
 */
import java.util.ArrayList;
import java.util.List;

// Interface
interface Department {
    void assignDepartment(String department);
    String getDepartmentDetails();
}

// Abstract class
abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    // Constructor
    public Employee(int employeeId,String name,double baseSalary) {
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        if(employeeId>0) {
            this.employeeId=employeeId;
        } else {
            System.out.println("Invalid employee ID.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary>=0) {
            this.baseSalary=baseSalary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Implementing Department interface
    @Override
    public void assignDepartment(String department) {
        this.department=department;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: "+employeeId+"\nName: "+name+"\nDepartment: "+getDepartmentDetails());
        System.out.printf("Salary: Rs. %.2f%n",calculateSalary());
    }
}

// Full-time employee
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int employeeId,String name,double fixedSalary) {
        super(employeeId,name,fixedSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}

// Part-time employee
class PartTimeEmployee extends Employee {
    private int hoursWorked;

    public PartTimeEmployee(int employeeId,String name,double hourlyRate,int hoursWorked) {
        super(employeeId,name,hourlyRate);
        setHoursWorked(hoursWorked);
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if(hoursWorked>=0) {
            this.hoursWorked=hoursWorked;
        } else {
            System.out.println("Hours worked cannot be negative.");
        }
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary()*hoursWorked;
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee emp1=new FullTimeEmployee(101,"Ravi",50000);
        Employee emp2=new PartTimeEmployee(102,"Priya",500,80);
        Employee emp3=new FullTimeEmployee(103,"Arun",60000);

        emp1.assignDepartment("Development");
        emp2.assignDepartment("Testing");
        emp3.assignDepartment("Human Resources");

        List<Employee> employees=new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        for(Employee employee:employees) {
            System.out.println("\n");
            employee.displayDetails();
        }
    }
}