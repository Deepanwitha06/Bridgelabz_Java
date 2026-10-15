package Generics;
import java.util.LinkedList;
import java.util.List;
/*
     Concepts: Generic Classes,  Bounded Type Parameters, Wildcards
 */

abstract class JobRole{
    abstract String getJobRole();
}

//sub class: Software Engineer
class SoftwareEngineer extends JobRole{
    @Override
    public String getJobRole(){
        return "Software Engineer";
    }
}

//sub class: Data Scientist
class DataScientist extends JobRole{
    @Override
    public String getJobRole(){
        return "Data Scientist";
    }
}

//sub class: Product Manager
class ProductManager extends JobRole{
    @Override
    public String getJobRole(){
        return "Product Manager";
    }
}

//generic class
class Resume<T extends JobRole>{
    List<T> resumeList;

    public Resume(){
        resumeList=new LinkedList<>();
    }

    public void addResume(T resume){
        resumeList.add(resume);
    }

    public List<T> getResumeList(){
        return resumeList;
    }

    public static void display(List<? extends JobRole> resumes){
        for(JobRole resume:resumes){
            System.out.println("Resume details: \nJob role: "+resume.getJobRole());
        }
    }

    /*
     //Generic method
    public static <E extends JobRole> void screenResumes(List<E> resumes){
        for(E resume:resumes){
            System.out.println("Screening: "+resume.getJobRole());
        }
    }
     */

}
public class AIdrivenResumeScreeningSystem {
    public static void main(String[] args) {

        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        DataScientist dataScientist = new DataScientist();
        ProductManager productManager = new ProductManager();

        Resume<JobRole> resumes = new Resume<>();

        resumes.addResume(softwareEngineer);
        resumes.addResume(dataScientist);
        resumes.addResume(productManager);

        List<JobRole> jobRoleList=resumes.getResumeList();
        Resume.display(jobRoleList);
    }
}
