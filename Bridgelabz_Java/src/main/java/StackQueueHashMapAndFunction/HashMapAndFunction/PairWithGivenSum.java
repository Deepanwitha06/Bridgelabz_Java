package StackQueueHashMapAndFunction.HashMapAndFunction;
import java.util.HashMap;
public class PairWithGivenSum {
    public static boolean findPair(int[] arr,int target) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int num:arr) {
            int complement=target-num;
            if(map.containsKey(complement)) {
                System.out.println("Pair found: "+complement+" and "+num);
                return true;
            }
            map.put(num,true);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        if(!findPair(arr,target)) {
            System.out.println("No pair found");
        }
    }
}