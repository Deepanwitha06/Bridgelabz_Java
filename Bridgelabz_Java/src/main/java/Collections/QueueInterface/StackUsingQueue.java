package Collections.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

/*
      stack using queue
      methods: push,pop,top
 */
public class StackUsingQueue {
    Queue<Integer> queue=new LinkedList<>();
    Queue<Integer> reverseQueue=new LinkedList<>();

    public void push(int a){
        reverseQueue.add(a);

        while(!queue.isEmpty()){
            reverseQueue.add(queue.poll());
        }

        Queue<Integer> temp=reverseQueue;
        reverseQueue=queue;
        queue=temp;
    }

    public int pop(){
        if(queue.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return queue.poll();

    }

    public int top(){
        if(queue.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return queue.peek();
    }

    public static void main(String[] args){
        StackUsingQueue stack=new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: "+stack.top());
        System.out.println("Pop: "+stack.pop());
        System.out.println("Top after pop: "+stack.top());
    }
}
