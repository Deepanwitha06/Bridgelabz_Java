package javaInheritance.HierarchicalInheritance;
/*
      Superclass: Person
                  Attributes: name, age
      Subclasses: Teacher, Student, Staff
                   Attributes for Teacher : Subject
                                  Student: grade
                   Method: displayRole()
 */
class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void displayRole(){
        System.out.println("Name: "+name+"\nAge: "+age);
    }
}

//subclass 1: Teacher
class Teacher extends Person{
    String subject;
    public Teacher(String name,int age, String subject){
        super(name, age);
        this.subject=subject;
    }

    @Override
    public void displayRole(){
        System.out.println("Role: Teacher");
        super.displayRole();
        System.out.println("Subject: "+subject+"\n");
    }
}

//subclass 2: Student
class Student extends Person{
    String grade ;
    public Student(String name,int age, String grade ){
        super(name, age);
        this.grade =grade ;
    }

    @Override
    public void displayRole(){
        System.out.println("Role: Student");
        super.displayRole();
        System.out.println("Grade : "+grade+"\n" );
    }
}


//subclass 3: Staff
class Staff  extends Person{
    double salary ;
    public Staff (String name,int age, double salary ){
        super(name, age);
        this.salary =salary ;
    }

    @Override
    public void displayRole(){
        System.out.println("Role: Staff");
        super.displayRole();
        System.out.println("Salary : "+salary );
    }
}

public class SchoolSystem {
    public static void main(String[] args){
        Teacher teacher=new Teacher("Preethya",45,"social");
        Student student =new Student("tina",17,"X");
        Staff staff=new Staff("Meena",56,25000);

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
