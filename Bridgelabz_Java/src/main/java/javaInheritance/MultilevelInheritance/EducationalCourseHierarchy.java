package javaInheritance.MultilevelInheritance;
/*
    Multi level hierarchy
    base class: Course
               Attributes: courseName, duration.
    subclass: OnlineCourse
               Attributes: platform, isRecorded.
    subclass of OnlineCourse: PaidOnlineCourse
               Attributes:  fee, discount.
        Method: displayInfo()
 */
class Course{
    String courseName;
    double duration;
    public Course(String courseName, double duration){
        this.courseName=courseName;
        this.duration=duration;
    }

    public void displayInfo(){
        System.out.println("Details: ");
        System.out.println("Course Name: "+courseName+"\nDuration: "+duration);
    }
}
 class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;
    public OnlineCourse(String courseName, double duration,String platform, boolean isRecorded){
        super(courseName, duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }

    @Override
     public void displayInfo(){
        super.displayInfo();
        System.out.println("Platform: "+platform+"\nRecorded(yes/no): "+((isRecorded)?"yes":"no"));
    }
 }

 class PaidOnlineCourse extends OnlineCourse{
    double fee;
    double discount;
    public PaidOnlineCourse(String courseName, double duration,String platform, boolean isRecorded,double fee,double discount){
        super(courseName, duration, platform, isRecorded);
        this.fee=fee;
        this.discount=discount;
    }

     @Override
     public void displayInfo(){
         super.displayInfo();
         System.out.println("Fee: "+fee+"\nDiscount: "+discount+"\nFinal cost: "+(fee-(fee*discount/100)));
     }
 }

public class EducationalCourseHierarchy {
    public static void main(String[] args){
        PaidOnlineCourse paidOnlineCourse=new PaidOnlineCourse("Science",1.2,"Google meet",false,30000,10);
        paidOnlineCourse.displayInfo();
    }
}
