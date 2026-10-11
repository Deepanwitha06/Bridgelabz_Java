package StackQueueHashMapAndFunction.StackAndQueue;
import java.util.LinkedList;
import java.util.Queue;
public class CircularTour {
    public static int findStart(int[] petrol,int[] distance) {
        Queue<Integer> queue=new LinkedList<>();
        int totalPetrol=0;
        int totalDistance=0;
        int balance=0;
        int start=0;
        for(int i=0;i<petrol.length;i++) {
            totalPetrol+=petrol[i];
            totalDistance+=distance[i];
            balance+=petrol[i]-distance[i];
            queue.add(i);
            if(balance<0) {
                start=i+1;
                balance=0;
                queue.clear();
            }
        }

        if(totalPetrol<totalDistance) {
            return -1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] petrol={4,6,7,4};
        int[] distance={6,5,3,5};
        int start=findStart(petrol,distance);
        if(start==-1) {
            System.out.println("Circular tour is not possible");
        } else {
            System.out.println("Starting petrol pump: "+start);
        }
    }
}