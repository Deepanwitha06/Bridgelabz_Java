package Generics;

import java.util.LinkedList;
import java.util.List;

//create a abstract class
abstract class CourseType{
    private String courseName;
    private String courseType;

    public CourseType(String courseName,String courseType){
        this.courseName=courseName;
        this.courseType=courseType;
    }

    public String getCourseName(){
        return courseName;
    }
    public String getCourseType() {
        return courseType;
    }

    abstract void display();
}

//subclass examcorse
class ExamCourse extends CourseType{
    public ExamCourse(String courseName){
        super(courseName,"Exam Course");
    }

    @Override
    public void display(){
        System.out.println("\nCourse details: \nCourse Name: "+getCourseName()+"\nCourse type: "+getCourseType());
    }
}

//subclass Assignment Course
class AssignmentCourse extends CourseType{
    public AssignmentCourse(String courseName){
        super(courseName,"Assignment Course");
    }

    @Override
    public void display(){
        System.out.println("\nCourse details: \nCourse Name: "+getCourseName()+"\nCourse type: "+getCourseType());
    }
}

//subclass ResearchCourse
class ResearchCourse extends CourseType{
    public ResearchCourse(String courseName){
        super(courseName,"Research Course");
    }

    @Override
    public void display(){
        System.out.println("\nCourse details: \nCourse Name: "+getCourseName()+"\nCourse type: "+getCourseType());
    }
}

//generic class
class Course<T extends CourseType>{
    List<T> courseList;

    public Course(){
        courseList=new LinkedList<>();
    }

    public void addCourse(T course){
        courseList.add(course);
    }

    public List<T> getCourseList(){
        return courseList;
    }

    public static void displayDetails(List<? extends CourseType> courseList){
        for(CourseType course:courseList){
            course.display();
        }
    }
}

public class UniversityCourseManagementSystem {
    public static void main(String[] args){
        ExamCourse examCourse=new ExamCourse("cse");
        ResearchCourse researchCourse=new ResearchCourse("minorproject");
        AssignmentCourse assignmentCourse=new AssignmentCourse("Psychology");

        Course<CourseType> allCourses=new Course<>();

        allCourses.addCourse(examCourse);
        allCourses.addCourse(researchCourse);
        allCourses.addCourse(assignmentCourse);

        List<CourseType> coursesLidst=allCourses.getCourseList();

        Course.displayDetails(coursesLidst);
    }
}
