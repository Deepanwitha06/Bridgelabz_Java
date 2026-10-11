package LinkedList;
import java.util.Scanner;
/*
      linked list for student recore management
      Methods: insert new student at beginning,end or at position
               delete student by roll number
               search student records by roll number
               display studnt records
               update student grade based on their roll number
 */

class Student {
    int rollNo;
    String name;
    int age;
    char grade;
    Student next;

    public Student(int rollNo, String name, int age, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
class StudentLinkedList{
    private Student head;
    public void insertStudentAtBeginning(int rollNo,String name,int age,char grade){
        Student newStudent=new Student(rollNo,name,age,grade);
        newStudent.next=head;
        head=newStudent;
    }

    public void inserStudentAtEnd(int rollNo,String name,int age,char grade){
        Student newStudent=new Student(rollNo,name,age,grade);
        Student current=head;
        if(current==null){
            head=newStudent;
            return;
        }
        while(current.next!=null){
            current=current.next;
        }
        current.next=newStudent;
        newStudent.next=null;
    }

    public void insertStudentAtPosition(int rollNo,String name,int age,char grade,int position){
        Student newStudent=new Student(rollNo,name,age,grade);
        Student current=head;
        if(position<0) {
            System.out.println("Invalid position");
            return;
        }
        if(position==0){
            insertStudentAtBeginning(rollNo,name,age,grade);
            return;
        }
        for(int i=0;i<position-1 && current!=null;i++){
            current=current.next;
        }
        if(current==null) {
            System.out.println("Invalid position");
            return;
        }
        newStudent.next=current.next;
        current.next=newStudent;
    }

    //delete student record by roll number
    public boolean deleteStudentByRollnumber(int targetRollNo){
        Student current=head;
        if(current==null){
            return false;
        }
        if(current.rollNo==targetRollNo){
            head=head.next;
            return true;
        }
        while(current.next!=null){
            if(current.next.rollNo==targetRollNo){
                current.next=current.next.next;
                return true;
            }
            current=current.next;
        }
        return false;
    }

    //search for a student record by roll no
    public boolean searchSrtudentByRollno(int targetRollno){
        Student current=head;
        while (current!=null){
            if(current.rollNo==targetRollno){
                return true;
            }
            current=current.next;
        }
        return false;
    }


    //display student records
    public void displayStudentDeatils(){
        Student current=head;
        int i=0;
        while(current!=null){
            System.out.println("\nStudent"+(i+1)+" details:\nRoll no.:"+current.rollNo+"\nName: "+current.name+"\nAge: "+current.age+"\nGrade: "+current.grade);
            current=current.next;
            i++;
        }
    }

    //update student grade
    public void updateStudentGrade(int targetRollno,char updateGrade){
        Student current=head;
        while (current!=null){
            if(current.rollNo==targetRollno){
                current.grade=updateGrade;
                System.out.println("Update successful");
                return;
            }
            current=current.next;
        }
        System.out.println("Update not succussfull");
    }
}


public class StudentRecordManagement {
    public static void main(String[] args){
        StudentLinkedList list=new StudentLinkedList();

        // Insert student records
        list.insertStudentAtBeginning(1,"reena",10,'A');
        list.inserStudentAtEnd(2,"priya",11,'B');
        list.inserStudentAtEnd(3,"rahul",12,'A');

        // Display all student records
        list.displayStudentDeatils();

        // Search student by roll number
        System.out.println("\nStudent found: "+list.searchSrtudentByRollno(2));

        // Update student grade
        list.updateStudentGrade(2,'A');

        // Delete student by roll number
        list.deleteStudentByRollnumber(1);

        // Display records after deletion
        System.out.println("\nAfter deletion:");
        list.displayStudentDeatils();
    }
}
