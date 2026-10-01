package javaThisStaticFinalInstanceof;
import java.util.Scanner;
/*
      create,
      class : Employee
      Attributes: CompanyName,totalEmployees          (static)
                  name, designation           (instance)
                  id             (final instance)
      Methods:   displayTotalEmployees()   - static
      Constructor -   initialize name, id, and designation
 */
class  Employee{
    private static String companyName="XYZ";
    private static int totalEmployees=0;
    private String name;
    private String designation;
    private final int id;

    //constructor to initialize name, id, and designation
    public Employee(String name,int id,String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
        totalEmployees++;
    }

    //static method
    public static void displayTotalEmployees(){
        System.out.println("The total no.of Employees: "+totalEmployees);
    }

    public void display(){
        System.out.println("\nEmployee Details:  ");
        System.out.println("Company Name: " + companyName);
        System.out.println("Id: "+id+"\nName: "+name+"\nDesignation: "+designation);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take input
        System.out.println("Enter the name,id and designation of employee 1: ");
        String name1=input.nextLine();
        int id1=input.nextInt();
        input.nextLine();
        String designation1=input.nextLine();

        System.out.println("Enter the name,id and designation of employee 2: ");
        String name2=input.nextLine();
        int id2=input.nextInt();
        input.nextLine();
        String designation2=input.nextLine();

        //create class objects
        Employee employee1=new Employee(name1,id1,designation1);
        Employee employee2=new Employee(name2,id2,designation2);

        Employee.displayTotalEmployees();
        if(employee1 instanceof Employee){
            employee1.display();
        }
        if(employee2 instanceof Employee){
            employee2.display();
        }

        input.close();
    }
}
