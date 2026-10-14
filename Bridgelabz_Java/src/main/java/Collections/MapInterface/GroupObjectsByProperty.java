package Collections.MapInterface;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
     Given a list of Employee objects,
     group them by their department using a Map<Department, List<Employee>>.
 */
class Employee{
    public String name;
    public String department;
    public double salary;

    public Employee(String name, String department, double salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
}
public class GroupObjectsByProperty {
    public static void groupObjects(Employee[] employees){
        Map<String, LinkedList<String>> emp=new HashMap<>();
        for(Employee employee:employees){
            String key=employee.department;
            String value=employee.name;
            emp.putIfAbsent(key,new LinkedList<>());
            emp.get(key).add(value);
        }

        System.out.println(emp);
    }

    public static void main(String[] args){
        Employee emp1=new Employee("Alice","HR",222222);
        Employee emp2=new Employee("Bob ","IT",222222);
        Employee emp3=new Employee("Carol","HR",222222);

        Employee[] emp={emp1,emp2,emp3};
        groupObjects(emp);
    }

}
