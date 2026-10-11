package LinkedList;
import java.util.Scanner;

/*
     using circular linked list , task schedular
     methods: Add a task at the beginning, end, or at a specific position in the circular list.
              Remove a task by Task ID.
              View the current task and move to the next task in the circular list.
              Display all tasks in the list starting from the head node.
              Search for a task by Priority.

 */
class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId=taskId;
        this.taskName=taskName;
        this.priority=priority;
        this.dueDate=dueDate;
        this.next=null;
    }
}

class TaskLinkedList{
    Task head;
    Task current;

    //add a task at beginning
    public void inserAtBeginning(int taskId, String taskName, int priority, String dueDate){
        Task newtask=new Task( taskId,  taskName,  priority,  dueDate);
        if (head==null) {
            head = newtask;
            newtask.next = head;
            return;
        }
        Task current=head;
        while(current.next!=head){
            current=current.next;
        }
        newtask.next=head;
        current.next=newtask;
        head=newtask;
    }

    //add at end
    public void inserAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newtask = new Task(taskId, taskName, priority, dueDate);
        if(head==null){
            head=newtask;
            newtask.next=head;
            return;
        }
        Task current=head;
        while(current.next!=head){
            current=current.next;
        }
        current.next=newtask;
        newtask.next=head;
        return;
    }

    //add at speciic position
    public void insertAtPosition(int taskId, String taskName, int priority, String dueDate, int position) {
        Task newtask = new Task(taskId, taskName, priority, dueDate);
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            inserAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        if(head==null) {
            System.out.println("Invalid position");
            return;
        }
        Task current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
            if (current == head) {
                System.out.println("Invalid position");
                return;
            }
        }
        newtask.next = current.next;
        current.next = newtask;
        return;
    }

    // Remove task by ID
    public void deleteById(int targetTaskId) {
        if(head==null) {
            System.out.println("No tasks");
            return;
        }

        Task current=head;
        Task previous=null;

        do {
            if(current.taskId==targetTaskId) {
                if(current.next==current) {
                    head=null;
                    System.out.println("Task deleted");
                    current=null;
                    return;
                }

                if(current==head) {
                    Task last=head;

                    while(last.next!=head) {
                        last=last.next;
                    }

                    head=head.next;
                    last.next=head;
                } else {
                    previous.next=current.next;
                }

                System.out.println("Task deleted");
                current=null;
                return;
            }

            previous=current;
            current=current.next;
        } while(current!=head);

        System.out.println("Task not found");
    }

    //view current task and move to the next task
    public void viewCurrenttask(){
        if(head==null){
            System.out.println("No tasks");
            return;
        }
        if(current==null){
            current=head;
        }
        System.out.println("Current task: "+current.taskName);
        current=current.next;
    }

    //display the tasks
    public void display(){
        if(head==null){
            System.out.println("No tasks");
            return;
        }
        Task current=head;
        int i=0;
        do{
            System.out.println("Task "+(i)+" details: "+"\nTask id: "+current.taskId+"\nTask name: "+current.taskName+"\nPriority: "+current.priority+"\nDue date: "+current.dueDate+"\n");
            current=current.next;
            i++;
        }while(current!=head);
    }

    //search byb priority
    public boolean searchByPriority(int targetPriority){
        if(head==null){
            return false;
        }
        Task current=head;
        do{
            if(current.priority==targetPriority){
                return  true;
            }
            current=current.next;
        }while(current!=head);
        return false;
    }
}


public class TaskScheduler {
    public static void main(String[] args) {
        TaskLinkedList list=new TaskLinkedList();

        //add tasks
        list.inserAtBeginning(1,"Complete Java",1,"2026-10-12");
        list.inserAtEnd(2,"Practice DSA",2,"2026-10-13");
        list.inserAtEnd(3,"Revise OOP",3,"2026-10-14");

        //display all tasks
        System.out.println("All Tasks:");
        list.display();

        //insert at a specific position
        list.insertAtPosition(4,"Practice SQL",2,"2026-10-15",1);
        System.out.println("After inserting at position 1:");
        list.display();

        //view current task and move to next
        System.out.println("Viewing current tasks:");
        list.viewCurrenttask();
        list.viewCurrenttask();

        //search by priority
        int targetPriority=2;
        if(list.searchByPriority(targetPriority)){
            System.out.println("Task with priority "+targetPriority+" found");
        }else{
            System.out.println("Task with priority "+targetPriority+" not found");
        }

        //delete a task by ID
        list.deleteById(3);
        System.out.println("After deleting task ID 3:");
        list.display();
    }
}
