package LinkedList;
import java.util.Scanner;

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

class CircularTaskList {
    private Task head;
    private Task tail;
    private Task currentTask;

    // Count the tasks in the circular list
    private int size() {
        if(head==null) {
            return 0;
        }

        int count=0;
        Task current=head;

        do {
            count++;
            current=current.next;
        } while(current!=head);

        return count;
    }

    // Add task at the beginning
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask=new Task(taskId,taskName,priority,dueDate);

        if(head==null) {
            head=tail=currentTask=newTask;
            newTask.next=head;
        } else {
            newTask.next=head;
            head=newTask;
            tail.next=head;
        }

        System.out.println("Task added at the beginning.");
    }

    // Add task at the end
    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask=new Task(taskId,taskName,priority,dueDate);

        if(head==null) {
            head=tail=currentTask=newTask;
            newTask.next=head;
        } else {
            tail.next=newTask;
            tail=newTask;
            tail.next=head;
        }

        System.out.println("Task added at the end.");
    }

    // Add task at a specific position (1-based indexing)
    public void addAtPosition(int taskId, String taskName, int priority, String dueDate, int position) {
        int count=size();

        if(position<1 || position>count+1) {
            System.out.println("Invalid position.");
            return;
        }

        if(position==1) {
            addAtBeginning(taskId,taskName,priority,dueDate);
            return;
        }

        if(position==count+1) {
            addAtEnd(taskId,taskName,priority,dueDate);
            return;
        }

        Task newTask=new Task(taskId,taskName,priority,dueDate);
        Task current=head;

        for(int i=1;i<position-1;i++) {
            current=current.next;
        }

        newTask.next=current.next;
        current.next=newTask;

        System.out.println("Task added at position "+position+".");
    }

    // Remove task by Task ID
    public void removeTask(int taskId) {
        if(head==null) {
            System.out.println("No tasks available.");
            return;
        }

        Task current=head;
        Task previous=tail;

        do {
            if(current.taskId==taskId) {
                if(current==head && current==tail) {
                    head=tail=currentTask=null;
                } else {
                    previous.next=current.next;

                    if(current==head) {
                        head=current.next;
                    }

                    if(current==tail) {
                        tail=previous;
                    }

                    tail.next=head;

                    if(currentTask==current) {
                        currentTask=current.next;
                    }
                }

                System.out.println("Task removed successfully.");
                return;
            }

            previous=current;
            current=current.next;
        } while(current!=head);

        System.out.println("Task not found.");
    }

    // View the current task
    public void viewCurrentTask() {
        if(currentTask==null) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\n--- Current Task ---");
        displayTask(currentTask);
    }

    // Move to the next task
    public void moveToNextTask() {
        if(currentTask==null) {
            System.out.println("No tasks available.");
            return;
        }

        currentTask=currentTask.next;

        System.out.println("Moved to the next task.");
        displayTask(currentTask);
    }

    // Display all tasks starting from head
    public void displayAllTasks() {
        if(head==null) {
            System.out.println("No tasks available.");
            return;
        }

        Task current=head;
        System.out.println("\n--- All Tasks ---");

        do {
            displayTask(current);
            current=current.next;
        } while(current!=head);
    }

    // Search tasks by priority
    public void searchByPriority(int priority) {
        if(head==null) {
            System.out.println("No tasks available.");
            return;
        }

        Task current=head;
        boolean found=false;

        do {
            if(current.priority==priority) {
                displayTask(current);
                found=true;
            }

            current=current.next;
        } while(current!=head);

        if(!found) {
            System.out.println("No tasks found with this priority.");
        }
    }

    // Display one task
    private void displayTask(Task task) {
        System.out.println("Task ID: "+task.taskId);
        System.out.println("Task Name: "+task.taskName);
        System.out.println("Priority: "+task.priority);
        System.out.println("Due Date: "+task.dueDate);
        System.out.println("-----------------------------");
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CircularTaskList list=new CircularTaskList();
        int choice;

        do {
            System.out.println("\n===== Task Scheduler =====");
            System.out.println("1. Add task at beginning");
            System.out.println("2. Add task at end");
            System.out.println("3. Add task at specific position");
            System.out.println("4. Remove task by ID");
            System.out.println("5. View current task");
            System.out.println("6. Move to next task");
            System.out.println("7. Display all tasks");
            System.out.println("8. Search task by priority");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                case 2:
                case 3: {
                    System.out.print("Enter task ID: ");
                    int taskId=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter task name: ");
                    String taskName=sc.nextLine();

                    System.out.print("Enter priority (1 = highest): ");
                    int priority=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter due date (DD-MM-YYYY): ");
                    String dueDate=sc.nextLine();

                    if(choice==1) {
                        list.addAtBeginning(taskId,taskName,priority,dueDate);
                    } else if(choice==2) {
                        list.addAtEnd(taskId,taskName,priority,dueDate);
                    } else {
                        System.out.print("Enter position (starting from 1): ");
                        int position=sc.nextInt();
                        sc.nextLine();

                        list.addAtPosition(taskId,taskName,priority,dueDate,position);
                    }
                    break;
                }

                case 4:
                    System.out.print("Enter task ID to remove: ");
                    int deleteId=sc.nextInt();
                    list.removeTask(deleteId);
                    break;

                case 5:
                    list.viewCurrentTask();
                    break;

                case 6:
                    list.moveToNextTask();
                    break;

                case 7:
                    list.displayAllTasks();
                    break;

                case 8:
                    System.out.print("Enter priority to search: ");
                    int searchPriority=sc.nextInt();
                    list.searchByPriority(searchPriority);
                    break;

                case 9:
                    System.out.println("Exiting Task Scheduler.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice!=9);

        sc.close();
    }
}