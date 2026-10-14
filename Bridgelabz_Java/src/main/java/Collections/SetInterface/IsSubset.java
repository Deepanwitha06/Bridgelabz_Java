package Collections.SetInterface;
import java.util.*;
/*
      To find whether one set is subset of another set
 */
public class IsSubset {
    public static boolean isSubset(Set<Integer> set1,Set<Integer> set2){
        if(set2.containsAll(set1)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Set<Integer> set1=Set.of(2,3);
        Set<Integer> set2=Set.of(1,2,3,4);
        System.out.println("One set is subset of another: "+isSubset(set1,set2));
    }
}
