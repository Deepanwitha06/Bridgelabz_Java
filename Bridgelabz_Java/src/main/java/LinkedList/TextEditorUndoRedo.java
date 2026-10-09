package LinkedList;
import java.util.Scanner;

class TextState {
    String content;
    TextState prev;
    TextState next;

    TextState(String content) {
        this.content=content;
        this.prev=null;
        this.next=null;
    }
}

class TextEditor {
    private TextState head;
    private TextState tail;
    private TextState current;
    private int historySize;
    private final int MAX_HISTORY=10;

    // Initialize the editor with an empty text state
    TextEditor() {
        head=new TextState("");
        tail=head;
        current=head;
        historySize=1;
    }

    // Add a new state after typing or editing
    public void addTextState(String content) {
        // Remove redo history if a new edit is made after undo
        TextState temp=current.next;

        while(temp!=null) {
            TextState nextState=temp.next;
            temp.prev=null;
            temp.next=null;
            temp=nextState;
            historySize--;
        }

        current.next=null;
        tail=current;

        // Create and attach the new state
        TextState newState=new TextState(content);

        current.next=newState;
        newState.prev=current;

        current=newState;
        tail=newState;
        historySize++;

        // Remove the oldest state if history exceeds the limit
        while(historySize>MAX_HISTORY) {
            TextState oldHead=head;
            head=head.next;
            head.prev=null;

            oldHead.next=null;
            historySize--;
        }

        System.out.println("Text updated successfully.");
    }

    // Undo to the previous state
    public void undo() {
        if(current.prev==null) {
            System.out.println("Nothing to undo.");
            return;
        }

        current=current.prev;
        System.out.println("Undo successful.");
        displayCurrentState();
    }

    // Redo to the next state
    public void redo() {
        if(current.next==null) {
            System.out.println("Nothing to redo.");
            return;
        }

        current=current.next;
        System.out.println("Redo successful.");
        displayCurrentState();
    }

    // Display the current text
    public void displayCurrentState() {
        System.out.println("\nCurrent Text:");
        System.out.println("--------------------");
        System.out.println(current.content);
        System.out.println("--------------------");
    }

    // Display all states in the retained history
    public void displayHistory() {
        if(head==null) {
            System.out.println("No history available.");
            return;
        }

        TextState temp=head;
        int stateNumber=1;

        System.out.println("\nText History:");

        while(temp!=null) {
            String marker="";

            if(temp==current) {
                marker=" <-- Current State";
            }

            System.out.println(
                    stateNumber+". "+temp.content+marker
            );

            temp=temp.next;
            stateNumber++;
        }

        System.out.println("Total retained states: "+historySize);
    }
}

public class TextEditorUndoRedo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        TextEditor editor=new TextEditor();

        int choice;

        do {
            System.out.println("\n===== Text Editor =====");
            System.out.println("1. Type or Replace Text");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display Current Text");
            System.out.println("5. Display History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice=input.nextInt();
            input.nextLine();

            switch(choice) {
                case 1:
                    System.out.println(
                            "Enter the complete text for the new state:"
                    );
                    String content=input.nextLine();

                    editor.addTextState(content);
                    break;

                case 2:
                    editor.undo();
                    break;

                case 3:
                    editor.redo();
                    break;

                case 4:
                    editor.displayCurrentState();
                    break;

                case 5:
                    editor.displayHistory();
                    break;

                case 6:
                    System.out.println("Exiting text editor.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while(choice!=6);

        input.close();
    }
}