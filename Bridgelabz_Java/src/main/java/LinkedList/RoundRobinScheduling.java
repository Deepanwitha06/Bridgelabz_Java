package LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

class Process {
    int processId;
    int burstTime;
    int remainingBurstTime;
    int priority;
    int completionTime;
    Process next;

    Process(int processId,int burstTime,int priority) {
        this.processId=processId;
        this.burstTime=burstTime;
        this.remainingBurstTime=burstTime;
        this.priority=priority;
        this.completionTime=0;
        this.next=null;
    }
}

class CircularProcessList {
    private Process head;
    private Process tail;
    private int processCount;

    // Store every process so its scheduling statistics remain available
    private ArrayList<Process> allProcesses=new ArrayList<>();

    public boolean containsProcess(int processId) {
        if(head==null) {
            return false;
        }

        Process current=head;

        do {
            if(current.processId==processId) {
                return true;
            }
            current=current.next;
        } while(current!=head);

        return false;
    }

    // Add a process at the end of the circular linked list
    public void addProcess(int processId,int burstTime,int priority) {
        if(containsProcess(processId)) {
            System.out.println("Process ID already exists.");
            return;
        }

        Process newProcess=new Process(processId,burstTime,priority);

        if(head==null) {
            head=newProcess;
            tail=newProcess;
            tail.next=head;
        } else {
            tail.next=newProcess;
            tail=newProcess;
            tail.next=head;
        }

        allProcesses.add(newProcess);
        processCount++;

        System.out.println("Process added successfully.");
    }

    // Remove the process at the beginning of the circular list
    private void removeHead() {
        if(head==null) {
            return;
        }

        if(head==tail) {
            head=null;
            tail=null;
        } else {
            head=head.next;
            tail.next=head;
        }

        processCount--;
    }

    // Move the front process to the end of the circular queue
    private void moveToNextProcess() {
        if(head!=null && head!=tail) {
            head=head.next;
            tail=tail.next;
        }
    }

    // Display the active circular queue
    public void displayProcesses() {
        if(head==null) {
            System.out.println("No processes in the circular queue.");
            return;
        }

        Process current=head;

        System.out.println("\nCurrent Circular Process Queue:");
        System.out.println("PID\tBurst\tRemaining\tPriority");

        do {
            System.out.println(
                    current.processId+"\t"+
                            current.burstTime+"\t"+
                            current.remainingBurstTime+"\t\t"+
                            current.priority
            );

            current=current.next;
        } while(current!=head);

        System.out.println("The last process points back to the first process.");
    }

    // Simulate Round Robin CPU scheduling
    public void simulateRoundRobin(int timeQuantum) {
        if(head==null) {
            System.out.println("No processes available for scheduling.");
            return;
        }

        if(timeQuantum<=0) {
            System.out.println("Time quantum must be positive.");
            return;
        }

        int currentTime=0;
        int round=1;

        System.out.println("\n--- Round Robin Scheduling Started ---");

        while(head!=null) {
            // Each process present at the start of this round gets one turn
            int processesInRound=processCount;

            System.out.println("\n========== Round "+round+" ==========");

            for(int i=0;i<processesInRound && head!=null;i++) {
                Process current=head;

                int executionTime=Math.min(
                        timeQuantum,current.remainingBurstTime
                );

                System.out.println(
                        "Process P"+current.processId+
                                " executes from time "+currentTime+
                                " to "+(currentTime+executionTime)
                );

                current.remainingBurstTime-=executionTime;
                currentTime+=executionTime;

                if(current.remainingBurstTime==0) {
                    current.completionTime=currentTime;

                    System.out.println(
                            "Process P"+current.processId+
                                    " completed at time "+currentTime
                    );

                    // Remove a process after its execution is complete
                    removeHead();
                } else {
                    System.out.println(
                            "Process P"+current.processId+
                                    " has "+current.remainingBurstTime+
                                    " units remaining."
                    );

                    // Give the next process its turn
                    moveToNextProcess();
                }
            }

            // Display the circular queue after every round
            displayProcesses();
            round++;
        }

        System.out.println("\n--- All Processes Completed ---");
        displaySchedulingResults();
    }

    // Calculate waiting time, turnaround time, and their averages
    private void displaySchedulingResults() {
        if(allProcesses.isEmpty()) {
            System.out.println("No process statistics available.");
            return;
        }

        int totalWaitingTime=0;
        int totalTurnaroundTime=0;

        System.out.println("\nScheduling Results:");
        System.out.println("PID\tBurst\tPriority\tCompletion\tWaiting\tTurnaround");

        for(Process process:allProcesses) {
            // All processes are assumed to arrive at time 0
            int turnaroundTime=process.completionTime;
            int waitingTime=turnaroundTime-process.burstTime;

            totalWaitingTime+=waitingTime;
            totalTurnaroundTime+=turnaroundTime;

            System.out.println(
                    process.processId+"\t"+
                            process.burstTime+"\t"+
                            process.priority+"\t\t"+
                            process.completionTime+"\t\t"+
                            waitingTime+"\t"+
                            turnaroundTime
            );
        }

        double averageWaitingTime=
                (double)totalWaitingTime/allProcesses.size();

        double averageTurnaroundTime=
                (double)totalTurnaroundTime/allProcesses.size();

        System.out.printf(
                "\nAverage Waiting Time: %.2f\n",averageWaitingTime
        );

        System.out.printf(
                "Average Turnaround Time: %.2f\n",averageTurnaroundTime
        );
    }
}

public class RoundRobinScheduling {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        CircularProcessList processList=new CircularProcessList();

        int choice;

        do {
            System.out.println("\n===== Round Robin Scheduling =====");
            System.out.println("1. Add Process");
            System.out.println("2. Display Process Queue");
            System.out.println("3. Simulate Round Robin Scheduling");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice=input.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter Process ID: ");
                    int processId=input.nextInt();

                    System.out.print("Enter Burst Time: ");
                    int burstTime=input.nextInt();

                    System.out.print("Enter Priority: ");
                    int priority=input.nextInt();

                    if(burstTime<=0) {
                        System.out.println(
                                "Burst time must be greater than zero."
                        );
                    } else {
                        processList.addProcess(
                                processId,burstTime,priority
                        );
                    }
                    break;

                case 2:
                    processList.displayProcesses();
                    break;

                case 3:
                    System.out.print("Enter Time Quantum: ");
                    int timeQuantum=input.nextInt();

                    processList.simulateRoundRobin(timeQuantum);
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while(choice!=4);

        input.close();
    }
}