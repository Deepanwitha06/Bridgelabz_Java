package StackQueueHashMapAndFunction.HashMapAndFunction;
import java.util.HashMap;
public class ZeroSumSubarrays {
    public static void findSubarrays(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
            if(map.containsKey(sum)) {
                System.out.println("Zero-sum subarray ends at index "+i);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,-3,3,-1,2};
        findSubarrays(arr);
    }
}