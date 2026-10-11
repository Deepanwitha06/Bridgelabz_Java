package StackQueueHashMapAndFunction.HashMapAndFunction;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public static int[] findTwoSum(int[] arr,int target) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++) {
            int complement=target-arr[i];

            if(map.containsKey(complement)) {
                return new int[]{map.get(complement),i};
            }

            map.put(arr[i],i);
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;

        int[] result=findTwoSum(arr,target);

        if(result[0]!=-1) {
            System.out.println("Indices: "+Arrays.toString(result));
            System.out.println("Numbers: "+arr[result[0]]+" and "+arr[result[1]]);
        } else {
            System.out.println("No pair found");
        }
    }
}