package Collections.SetInterface;
import java.util.HashSet;
import java.util.Set;
/*
         check if two sets are equal
         use set interface
 */
import java.util.HashSet;
import java.util.Set;

public class ifEqual {
    public static boolean checkEqual(int[] arr1, int[] arr2){
    Set<Integer> set1=new HashSet<>();
    Set<Integer> set2=new HashSet<>();
    for(int num:arr1){
        set1.add(num);
    }
    for(int num:arr2){
        set2.add(num);
    }
    if(set1.size()==set2.size()) {
        for (int num : set1) {
            if (!set2.contains(num)) {
                return false;
            }
        }
        return true;
    }else{
        return false;
    }

        /*
              another approach: return set1.equals(set2);         */
}

    public static void main(String[] args){
        int[] arr1={1,2,3};
        int[] arr2={3,2,1};
        System.out.print("Both has same elements: "+checkEqual(arr1,arr2));
    }
}
