package Collections.QueueInterface;
import java.util.ArrayList;
import java.util.PriorityQueue;
/*
         priority queue based on sverity
 */
class Patient{
    String name;
    int severity;

    public Patient(String name,int severity){
        this.name=name;
        this.severity=severity;
    }
}
public class HospitalTriageSystem {
    public static void hospitalSystem(ArrayList<Patient> patientsList) {
        PriorityQueue<Patient> patients = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.severity,p1.severity));

        //adding elements to priority queue
        for (int i = 0; i < patientsList.size(); i++) {
            patients.add(patientsList.get(i));
        }

        //removing and displaying based on severity
        System.out.println("List: ");
        while (!patients.isEmpty()) {
            Patient out=patients.poll();
            System.out.println(out.name);
        }
    }

    public static void main(String[] args){
        ArrayList<Patient> patientArrayList=new ArrayList<>();
        Patient patient1=new Patient("John", 3);
        Patient patient2=new Patient("Alice", 5);
        Patient patient3=new Patient("Bob", 2);

        patientArrayList.add(patient1);
        patientArrayList.add(patient2);
        patientArrayList.add(patient3);

        hospitalSystem(patientArrayList);
    }
}
