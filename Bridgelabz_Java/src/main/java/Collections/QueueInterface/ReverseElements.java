package Collections.QueueInterface;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

/*
     reverse a string
     using queue interface
 */
public class ReverseElements {
    public static void reverseQueue(Queue<Integer> queue){
        if(queue.isEmpty()){
            return;
        }
        int element=queue.poll();
        reverseQueue(queue);
        queue.add(element);
    }

    public static void  main(String[] args){
        Queue<Integer> queue=new LinkedList<>();
        queue.addAll(List.of(1,2,3));
        reverseQueue(queue);
        System.out.println(queue);
    }
}
