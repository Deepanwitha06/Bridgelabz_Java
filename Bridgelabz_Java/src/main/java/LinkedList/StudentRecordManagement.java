package LinkedList;
import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int age;
    String grade;
    Student next;

    Student(int rollNumber, String name, int age, String grade) {
        this.rollNumber=rollNumber;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.next=null;
    }
}

class StudentLinkedList {
    private Student head;

    // Add student at the beginning
    public void addAtBeginning(int rollNumber, String name, int age, String grade) {
        Student newStudent=new Student(rollNumber,name,age,grade);
        newStudent.next=head;
        head=newStudent;
        System.out.println("Student added at the beginning.");
    }

    // Add student at the end
    public void addAtEnd(int rollNumber, String name, int age, String grade) {
        Student newStudent=new Student(rollNumber,name,age,grade);

        if(head==null) {
            head=newStudent;
            System.out.println("Student added at the end.");
            return;
        }

        Student current=head;
        while(current.next!=null) {
            current=current.next;
        }

        current.next=newStudent;
        System.out.println("Student added at the end.");
    }

    // Add student at a specific position (1-based indexing)
    public void addAtPosition(int rollNumber, String name, int age, String grade, int position) {
        if(position<1) {
            System.out.println("Invalid position.");
            return;
        }

        if(position==1) {
            addAtBeginning(rollNumber,name,age,grade);
            return;
        }

        Student current=head;

        for(int i=1;i<position-1 && current!=null;i++) {
            current=current.next;
        }

        if(current==null) {
            System.out.println("Invalid position.");
            return;
        }

        Student newStudent=new Student(rollNumber,name,age,grade);
        newStudent.next=current.next;
        current.next=newStudent;

        System.out.println("Student added at position "+position+".");
    }

    // Delete student by roll number
    public void deleteStudent(int rollNumber) {
        if(head==null) {
            System.out.println("No student records available.");
            return;
        }

        if(head.rollNumber==rollNumber) {
            head=head.next;
            System.out.println("Student record deleted.");
            return;
        }

        Student current=head;

        while(current.next!=null && current.next.rollNumber!=rollNumber) {
            current=current.next;
        }

        if(current.next==null) {
            System.out.println("Student not found.");
            return;
        }

        current.next=current.next.next;
        System.out.println("Student record deleted.");
    }

    // Search student by roll number
    public void searchStudent(int rollNumber) {
        Student current=head;

        while(current!=null) {
            if(current.rollNumber==rollNumber) {
                System.out.println("\nStudent found:");
                displayStudent(current);
                return;
            }
            current=current.next;
        }

        System.out.println("Student not found.");
    }

    // Display all student records
    public void displayStudents() {
        if(head==null) {
            System.out.println("No student records available.");
            return;
        }

        Student current=head;

        System.out.println("\nStudent Records ");

        while(current!=null) {
            displayStudent(current);
            current=current.next;
        }
    }

    // Display one student record
    private void displayStudent(Student student) {
        System.out.println("Roll Number: "+student.rollNumber);
        System.out.println("Name: "+student.name);
        System.out.println("Age: "+student.age);
        System.out.println("Grade: "+student.grade);
    }

    // Update grade by roll number
    public void updateGrade(int rollNumber, String newGrade) {
        Student current=head;

        while(current!=null) {
            if(current.rollNumber==rollNumber) {
                current.grade=newGrade;
                System.out.println("Student grade updated successfully.");
                return;
            }
            current=current.next;
        }

        System.out.println("Student not found.");
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StudentLinkedList list=new StudentLinkedList();
        int choice;

        do {
            System.out.println("\n===== Student Record Management =====");
            System.out.println("1. Add student at beginning");
            System.out.println("2. Add student at end");
            System.out.println("3. Add student at specific position");
            System.out.println("4. Delete student by roll number");
            System.out.println("5. Search student by roll number");
            System.out.println("6. Display all students");
            System.out.println("7. Update student grade");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Enter roll number: ");
                    int rollNumber=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter student name: ");
                    String name=sc.nextLine();

                    System.out.print("Enter age: ");
                    int age=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter grade: ");
                    String grade=sc.nextLine();

                    if(choice==1) {
                        list.addAtBeginning(rollNumber,name,age,grade);
                    } else if(choice==2) {
                        list.addAtEnd(rollNumber,name,age,grade);
                    } else {
                        System.out.print("Enter position (starting from 1): ");
                        int position=sc.nextInt();
                        list.addAtPosition(rollNumber,name,age,grade,position);
                    }
                    break;

                case 4:
                    System.out.print("Enter roll number to delete: ");
                    rollNumber=sc.nextInt();
                    list.deleteStudent(rollNumber);
                    break;

                case 5:
                    System.out.print("Enter roll number to search: ");
                    rollNumber=sc.nextInt();
                    list.searchStudent(rollNumber);
                    break;

                case 6:
                    list.displayStudents();
                    break;

                case 7:
                    System.out.print("Enter roll number: ");
                    rollNumber=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new grade: ");
                    String newGrade=sc.nextLine();

                    list.updateGrade(rollNumber,newGrade);
                    break;

                case 8:
                    System.out.println("Exiting Student Record Management.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice!=8);

        sc.close();
    }
}