package javaObjectModeling;
/*
    University with Faculties and Departments
    ------------------------------------------

    Class: University
        Attributes: universityName, departments, faculties
        Relationships:
            Composition with UniversityDepartment
            Aggregation with Faculty

    Class: UniversityDepartment
        Attributes: departmentId, departmentName

    Class: Faculty
        Attributes: facultyId, facultyName

    Composition:
        University owns its UniversityDepartments.
        UniversityDepartment cannot exist independently of the University.
        If the University is deleted, its UniversityDepartments are also deleted.

    Aggregation:
        University has multiple Faculty members.
        Faculty can exist independently of the University.
*/


// UniversityDepartment class
class UniversityDepartment {
    private int departmentId;
    private String departmentName;

    public UniversityDepartment(int departmentId,String departmentName) {
        this.departmentId=departmentId;
        this.departmentName=departmentName;
    }

    public void displayDepartment() {
        System.out.println("Department ID: " + departmentId);
        System.out.println("Department Name: " + departmentName);
    }
}


// Faculty class
class Faculty {
    private int facultyId;
    private String facultyName;

    public Faculty(int facultyId,String facultyName) {
        this.facultyId=facultyId;
        this.facultyName=facultyName;
    }

    public void displayFaculty() {
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Faculty Name: " + facultyName);
    }
}


// University class
class University {
    private String universityName;

    // Composition
    private UniversityDepartment[] departments;

    // Aggregation
    private Faculty[] faculties;

    public University(String universityName, UniversityDepartment[] departments, Faculty[] faculties) {
        this.universityName=universityName;
        this.departments=departments;
        this.faculties=faculties;
    }

    public void displayUniversity() {
        System.out.println("University: " + universityName);

        System.out.println("\nDepartments:");

        for(UniversityDepartment department : departments) {
            department.displayDepartment();
            System.out.println();
        }

        System.out.println("Faculty Members:");

        for(Faculty faculty : faculties) {
            faculty.displayFaculty();
            System.out.println();
        }
    }
}


// Main class
public class UniversityFacultyDepartments {
    public static void main(String[] args) {

        // Faculty objects can exist independently
        Faculty faculty1=new Faculty(101,"Dr. Ravi");
        Faculty faculty2=new Faculty(102,"Dr. Priya");
        Faculty faculty3=new Faculty(103,"Dr. Arun");

        // UniversityDepartment objects
        UniversityDepartment department1= new UniversityDepartment(201,"Computer Science");

        UniversityDepartment department2= new UniversityDepartment(202,"Electronics");

        UniversityDepartment department3= new UniversityDepartment(203,"Mechanical");

        UniversityDepartment[] departments={department1, department2, department3};

        // Aggregation
        Faculty[] faculties={faculty1, faculty2, faculty3};

        // Create University
        University university= new University("SRM University",departments,faculties);

        // Display University details
        university.displayUniversity();

        System.out.println("\nFaculty can exist independently:");

        faculty1.displayFaculty();

        /*
            Composition demonstration:

            When the University object is no longer referenced,
            its UniversityDepartment objects are no longer owned
            by the University.

            Faculty objects can still be referenced independently.
        */

        university=null;

        System.out.println("\nUniversity reference deleted.");

        System.out.println("\nFaculty still exists:");
        faculty1.displayFaculty();
    }
}