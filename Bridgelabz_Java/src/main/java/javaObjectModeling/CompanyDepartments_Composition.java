package javaObjectModeling;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
      Composition'
      classes: Company , department , employee
 */

class Employee{
    private String employeeName;
    private int employeeID;

    public Employee(String employeeName, int employeeID){
        this.employeeName=employeeName;
        this.employeeID=employeeID;
    }

    public void displaEmployeeDetails(){
        System.out.println("Employee Details: ");
        System.out.println("employee ID: "+employeeID+"\nName: "+employeeName);
    }
}

class Department{
    private String departmentName;
    private List<Employee> employeeList;

    public Department(String departmentName){
        this.departmentName=departmentName;
       employeeList=new ArrayList<>();
    }

    public void addEmployee(String employeeName, int employeeID){
        employeeList.add(new Employee(employeeName,employeeID));
    }

    public void displaDepartment(){
        System.out.println("Department: "+departmentName);
        for(Employee employee:employeeList){
            employee.displaEmployeeDetails();
        }
    }
}

class Company{
    private String companyName;
    private List<Department> departmentList;

    public Company(String companyName){
        this.companyName=companyName;
       departmentList=new ArrayList<>();
    }

    public void addDepartment(String departmentName){
        departmentList.add(new Department(departmentName));
    }

    public List<Department> getDepartmentList(){
        return departmentList;
    }

    public void displaCompany(){
        System.out.println("\nCompany Name: "+companyName);
        for(Department department:departmentList){
            department.displaDepartment();
        }
    }
}

public class CompanyDepartments_Composition {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take inputs
        System.out.println("Enter company name: ");
        String companyName=input.nextLine();
        Company company=new Company(companyName);

        System.out.println("Enter no.of departments:");
        int departmentsCount=input.nextInt();
        input.nextLine();
        for(int i=0;i<departmentsCount;i++) {
            System.out.println("Enter the department name: ");
            String departmentName = input.nextLine();
            company.addDepartment(departmentName);

            Department department = company.getDepartmentList().get(i);

            System.out.println("Enter no.of employees in this departent: ");
            int employeeCount = input.nextInt();
            input.nextLine();

            for (int j = 0; j < employeeCount; j++) {
                System.out.println("Enter employee name and id: ");
                String employeeName = input.nextLine();
                int employeeID = input.nextInt();
                input.nextLine();

                department.addEmployee(employeeName, employeeID);
            }
        }

        company.displaCompany();
        input.close();
    }
}
