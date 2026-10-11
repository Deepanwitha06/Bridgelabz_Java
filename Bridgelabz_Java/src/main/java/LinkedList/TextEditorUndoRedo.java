package LinkedList;
import java.util.Scanner;
/*
     methods:Add a new text state at the end of the list every time the user types or performs an action.
     Implement the undo functionality (revert to the previous state).
     Implement the redo functionality (revert back to the next state after undo).
     Limit the undo/redo history to a fixed size (e.g., last 10 states).

 */
class TextState{
    String text;
    TextState next;
    TextState prev;

    TextState(String text){
        this.text=text;
        this.prev=null;
        this.next=null;
    }
}

class TextEditor{
    TextState head;
    TextState current;
    int size;
    int maxSize=10;

    public void addText(String additionalText){
        String newText;

        if(current==null){
            newText=additionalText;
        }else{
            newText=current.text+additionalText;
        }
        TextState newstate=new TextState(newText);
        if(current==null){
            head=newstate;
            current=newstate;
            size++;
        }else{
            TextState temp=current.next;
            while(temp!=null){
                size--;
                temp=temp.next;
            }
            current.next=null;
            newstate.prev=current;
            current.next=newstate;
            current=newstate;
            size++;
        }
        if(size>maxSize){
            head=head.next;
            head.prev=null;
            size--;
        }
    }

    public void undo(){
        if(current!=null && current.prev!=null){
            current=current.prev;
            return;
        }else{
            System.out.println("Nothing to undo");
            return;
        }
    }

    public void redo(){
        if(current!=null && current.next!=null){
            current=current.next;
            return;
        }else{
            System.out.println("Nothing to redo");
            return;
        }
    }

    // Display current text
    public void displayCurrent(){
        if(current==null){
            System.out.println("Text is empty");
            return;
        }

        System.out.println("Current text: "+current.text);
    }

    // Display all retained history
    public void displayHistory(){
        TextState temp=head;

        if(temp==null){
            System.out.println("No history available");
            return;
        }

        System.out.println("Text history:");

        while(temp!=null){
            if(temp==current){
                System.out.println("-> "+temp.text+" (Current)");
            }else{
                System.out.println("   "+temp.text);
            }

            temp=temp.next;
        }

        System.out.println("Total states: "+size);
    }
}

public class TextEditorUndoRedo{
    public static void main(String[] args){
        TextEditor editor=new TextEditor();

        editor.addText("Hello");
        editor.addText(" World");
        editor.addText("!");

        editor.displayCurrent();

        // Undo
        editor.undo();
        editor.displayCurrent();

        // Redo
        editor.redo();
        editor.displayCurrent();

        // Undo and add a new state
        editor.undo();
        editor.addText("Hello Java");

        // Redo is no longer available
        editor.redo();

        editor.displayCurrent();
        editor.displayHistory();
    }
}