package javaConstructors.level1;
import java.util.Scanner;
/*
    create a class Person
    Attributes : Name, Age
    Copy Constructor
 */
class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person(Person previousPersonDetails){
        this.name= previousPersonDetails.name;
        this.age= previousPersonDetails.age;
    }

    public void displayDetails(){
        System.out.println("Person details: ");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age+"\n");
    }
}
public class PersonDetails {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take user input
        System.out.println("Enter the name and age:");
        String name=input.nextLine();
        int age=input.nextInt();

        //create class object
        Person person1=new Person(name,age);
        System.out.println("Original Person");
        person1.displayDetails();

        Person person2=new Person(person1);
        System.out.println("Clone: ");
        person2.displayDetails();

        input.close();
    }
}
