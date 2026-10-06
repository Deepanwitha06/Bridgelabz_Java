package javaObjectModeling;

/*
    University Management System
    ----------------------------

    Class: UniversityStudent
        Attributes: studentId, studentName
        Relationship:
            Association with CourseOfUniversity

    Class: UniversityProfessor
        Attributes: professorId, professorName, specialization
        Relationship:
            Association with CourseOfUniversity

    Class: CourseOfUniversity
        Attributes: courseId, courseName, students, professor
        Relationships:
            Aggregation with UniversityStudent
            Aggregation with UniversityProfessor

    Association:
        A UniversityStudent can enroll in multiple courses.
        A UniversityProfessor can teach multiple courses.

    Aggregation:
        A CourseOfUniversity contains students and a professor.
        Students and professors can exist independently
        of the course.

    Communication:
        UniversityStudent communicates with CourseOfUniversity
        through the enrollCourse() method.

        CourseOfUniversity communicates with UniversityProfessor
        through the assignProfessor() method.
*/


// UniversityStudent class
class UniversityStudent {
    private int studentId;
    private String studentName;

    public UniversityStudent(int studentId,String studentName) {
        this.studentId=studentId;
        this.studentName=studentName;
    }

    // Communication with CourseOfUniversity
    public void enrollCourse(CourseOfUniversity course) {System.out.println(studentName + " enrolled in " + course.getCourseName());
        course.addStudent(this);
    }

    public String getStudentName() {
        return studentName;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
    }
}


// UniversityProfessor class
class UniversityProfessor {
    private int professorId;
    private String professorName;
    private String specialization;

    public UniversityProfessor(int professorId,String professorName,String specialization) {
        this.professorId=professorId;
        this.professorName=professorName;
        this.specialization=specialization;
    }

    public void displayProfessor() {
        System.out.println("Professor ID: " + professorId);
        System.out.println("Professor Name: " + professorName);
        System.out.println("Specialization: " + specialization);
    }

    public String getProfessorName() {
        return professorName;
    }
}


// CourseOfUniversity class
class CourseOfUniversity {
    private int courseId;
    private String courseName;

    // Aggregation
    private UniversityStudent[] students;
    private UniversityProfessor professor;

    private int studentCount;

    public CourseOfUniversity(int courseId,String courseName) {
        this.courseId=courseId;
        this.courseName=courseName;
        students=new UniversityStudent[10];
        studentCount=0;
    }

    public String getCourseName() {
        return courseName;
    }

    // Communication with UniversityProfessor
    public void assignProfessor(UniversityProfessor professor) {
        this.professor=professor;

        System.out.println(professor.getProfessorName() + " assigned to teach " + courseName);
    }

    // Add student to the course
    public void addStudent(UniversityStudent student) {
        if(studentCount<students.length) {
            students[studentCount]=student;
            studentCount++;
        }
    }

    public void displayCourse() {
        System.out.println("\nCourse ID: " + courseId);
        System.out.println("Course Name: " + courseName);

        System.out.println("\nProfessor:");

        if(professor!=null) {
            professor.displayProfessor();
        }

        System.out.println("\nStudents:");

        for(int i=0;i<studentCount;i++) {
            System.out.println(students[i].getStudentName());
        }
    }
}


// Main class
public class UniversityManagementSystem {
    public static void main(String[] args) {

        // Create UniversityStudent objects
        UniversityStudent student1=new UniversityStudent(101,"Deepa");
        UniversityStudent student2=new UniversityStudent(102,"Rahul");
        UniversityStudent student3=new UniversityStudent(103,"Priya");

        // Create UniversityProfessor objects
        UniversityProfessor professor1=new UniversityProfessor(201,"Dr. Ravi","Computer Science");
        UniversityProfessor professor2=new UniversityProfessor(202,"Dr. Priya","Artificial Intelligence");

        // Create CourseOfUniversity objects
        CourseOfUniversity course1=new CourseOfUniversity(301,"Java Programming");
        CourseOfUniversity course2=new CourseOfUniversity(302,"Artificial Intelligence");

        // Assign professors to courses
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        System.out.println();

        // Students enroll in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);

        student2.enrollCourse(course1);

        student3.enrollCourse(course2);

        // Display course details
        course1.displayCourse();
        course2.displayCourse();
    }
}
