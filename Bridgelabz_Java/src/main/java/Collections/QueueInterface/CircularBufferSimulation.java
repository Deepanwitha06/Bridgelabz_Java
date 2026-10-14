package Collections.QueueInterface;

import java.util.ArrayList;

/*
         a circular buffer (fixed-size queue) using an array-based queue.
         When full, overwrite the oldest element.
 */
public class CircularBufferSimulation {
    int[] buffer;
    int front=0;
    int size=0;
    int capacity;

    public CircularBufferSimulation(int capacity){
        this.capacity=capacity;
        buffer=new int[capacity];
    }

    public void insert(int value){
        if(size<capacity){
            int rear=(front+size)%capacity;
            buffer[rear]=value;
            size++;
        }
        else{
            buffer[front]=value;
            front=(front+1)%capacity;
        }
    }
    public void display(){
        System.out.print("Buffer: [");

        for(int i=0;i<size;i++){
            System.out.print(buffer[(front+i)%capacity]);

            if(i<size-1){
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    public static void main(String[] args){
        CircularBufferSimulation cb=new CircularBufferSimulation(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();

        cb.insert(4);
        cb.display();
    }
}
