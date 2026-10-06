package javaObjectModeling;
import java.util.ArrayList;
import java.util.List;
/*
    School and Students with Courses
    ---------------------------------

    Class: School
        Attributes: schoolName, students
        Relationship: Aggregation with Student

    Class: Student
        Attributes: studentId, name, courses
        Relationship: Association with Course

    Class: Course
        Attributes: courseId, courseName, students
        Relationship: Association with Student

    Aggregation:
        School has multiple Students.
        Students can exist independently of School.

    Association:
        Student and Course have a many-to-many relationship.
        One Student can enroll in multiple Courses.
        One Course can have multiple Students.
*/


// Course class
class Course {
    private String courseId;
    private String courseName;
    private List<Student> students;

    public Course(String courseId,String courseName) {
        this.courseId=courseId;
        this.courseName=courseName;
        this.students=new ArrayList<>();
    }

    public void addStudent(Student student) {
        if(!students.contains(student)) {
            students.add(student);
        }
    }

    public void displayEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");

        for(Student student : students) {
            System.out.println(student.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}


// Student class
class Student {
    private int studentId;
    private String name;
    private List<Course> courses;

    public Student(int studentId,String name) {
        this.studentId=studentId;
        this.name=name;
        this.courses=new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        if(!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void displayCourses() {
        System.out.println("Courses enrolled by " + name + ":");

        for(Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}


// School class
class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName=schoolName;
        this.students=new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("Students in " + schoolName + ":");

        for(Student student : students) {
            System.out.println(student.getName());
        }
    }
}


// Main class
public class SchoolStudentCourse  {
    public static void main(String[] args) {

        School school=new School("ABC International School");

        Student student1=new Student(101,"Deepa");
        Student student2=new Student(102,"Rahul");
        Student student3=new Student(103,"Priya");

        Course java=new Course("C101","Java Programming");
        Course python=new Course("C102","Python Programming");
        Course database=new Course("C103","Database Management");

        // Aggregation
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Association
        student1.enrollCourse(java);
        student1.enrollCourse(database);

        student2.enrollCourse(java);
        student2.enrollCourse(python);

        student3.enrollCourse(java);
        student3.enrollCourse(python);
        student3.enrollCourse(database);

        school.displayStudents();

        System.out.println();

        student1.displayCourses();

        System.out.println();

        java.displayEnrolledStudents();

        System.out.println();

        database.displayEnrolledStudents();
    }
}
