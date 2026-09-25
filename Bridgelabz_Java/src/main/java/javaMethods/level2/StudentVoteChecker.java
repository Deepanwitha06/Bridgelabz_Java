package javaMethods.level2;
import java.util.Scanner;
/*create a class to check the vote eligibility of student
   logic : age>=18 can vote
                else cannot vote
 */
public class StudentVoteChecker {
    //create a boolean method to check the eligibility of vstudents to vote
    public boolean canStudentVote(int age){
        if(age<0){
            return false;
        }else if(age>=18){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);
        StudentVoteChecker svc=new StudentVoteChecker();

        //create a array of 10 elements to collect age,call the method and display
        int[] age=new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter the age of student "+(i+1)+" :");
            age[i]=input.nextInt();
            if(svc.canStudentVote(age[i])){
                System.out.println("Can vote");
            }else{
                System.out.println("Cannot Vote");
            }
        }

        input.close();
    }

}
