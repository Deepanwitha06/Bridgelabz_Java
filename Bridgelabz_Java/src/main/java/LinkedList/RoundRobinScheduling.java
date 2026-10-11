package LinkedList;
/*
    Circular Linked List: Round Robin Scheduling Algorithm
    Node: Process
    Attributes: Process ID, Burst Time, Priority
    Functionalities:
    1. Add process
    2. Remove completed process
    3. Execute processes using time quantum
    4. Display queue after each round
    5. Calculate average waiting and turnaround time
*/

class Process{
    int processId;
    int burstTime;
    int remainingTime;
    int priority;
    int completionTime;
    Process next;


    Process(int processId,int burstTime,int priority){
        this.processId=processId;
        this.burstTime=burstTime;
        this.remainingTime=burstTime;
        this.priority=priority;
        this.completionTime=0;
        this.next=null;
    }
}


class RoundRobinQueue{
    Process last;
    int size;
    Process[] allProcesses=new Process[100];
    int totalProcesses;
    int completedCount;

    public void addProcess(int processId,int burstTime,int priority){
        if(burstTime<=0){
            System.out.println("Burst time must be positive");
            return;
        }

        if(totalProcesses==allProcesses.length){
            System.out.println("Process storage is full");
            return;
        }

        Process newProcess=new Process(processId,burstTime,priority);

        if(last==null){
            last=newProcess;
            newProcess.next=newProcess;
        }else{
            newProcess.next=last.next;
            last.next=newProcess;
            last=newProcess;
        }

        allProcesses[totalProcesses++]=newProcess;
        size++;
    }

    public void removeProcess(int processId){
        if(last==null){
            return;
        }
        Process previous=last;
        Process current=last.next;
        do{
            if(current.processId==processId){
                if(current==previous){
                    last=null;
                }else{
                    previous.next=current.next;
                    if(current==last){
                        last=previous;
                    }
                }
                current.next=null;
                size--;
                return;
            }

            previous=current;
            current=current.next;
        }while(current!=last.next);
    }

    public void displayQueue(){
        if(last==null){
            System.out.println("Queue is empty");
            return;
        }
        Process current=last.next;
        do{
            System.out.println("P"+current.processId+ " | Remaining Time: "+current.remainingTime+ " | Priority: "+current.priority);
            current=current.next;
        }while(current!=last.next);
    }

    public void schedule(int timeQuantum){
        if(timeQuantum<=0){
            System.out.println("Time quantum must be positive");
            return;
        }
        if(last==null){
            System.out.println("No processes to execute");
            return;
        }
        int currentTime=0;
        int round=1;
        while(last!=null){
            System.out.println("\nRound "+round);
            int processesInRound=size;
            for(int i=0;i<processesInRound && last!=null;i++){
                Process current=last.next;

                int executionTime=Math.min(timeQuantum,current.remainingTime);
                System.out.println("Executing P"+current.processId+ " for "+executionTime+" units");

                current.remainingTime-=executionTime;
                currentTime+=executionTime;
                if(current.remainingTime==0){
                    current.completionTime=currentTime;
                    completedCount++;
                    removeProcess(current.processId);
                }else{
                    last=current;
                }
            }
            System.out.println("Queue after round "+round+":");
            displayQueue();
            round++;
        }
        calculateAverages();
    }

    public void calculateAverages(){
        if(completedCount==0){
            System.out.println("No completed processes");
            return;
        }
        int totalWaitingTime=0;
        int totalTurnAroundTime=0;
        System.out.println("\nProcess Results:");
        for(int i=0;i<totalProcesses;i++){
            Process p=allProcesses[i];
            if(p.completionTime>0){
                int turnAroundTime=p.completionTime;
                int waitingTime=turnAroundTime-p.burstTime;
                totalTurnAroundTime+=turnAroundTime;
                totalWaitingTime+=waitingTime;
                System.out.println("P"+p.processId+ " | Waiting Time: "+waitingTime+ " | Turnaround Time: "+turnAroundTime);
            }
        }

        System.out.println("Average Waiting Time: "+ (double)totalWaitingTime/completedCount);
        System.out.println("Average Turnaround Time: "+ (double)totalTurnAroundTime/completedCount);
    }
}
public class RoundRobinScheduling{
    public static void main(String[] args){
        RoundRobinQueue queue=new RoundRobinQueue();

        queue.addProcess(1,5,2);
        queue.addProcess(2,3,1);
        queue.addProcess(3,7,3);

        System.out.println("Initial Process Queue:");
        queue.displayQueue();

        queue.schedule(2);
    }
}