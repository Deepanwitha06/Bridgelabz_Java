package Collections.SetInterface;
import java.util.*;

/*
      convert a hash set of integers into a sorted list
 */
public class ToSortedList {
    public static void sortSettoList(Set<Integer> set){
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        System.out.print("sorted list: "+list);
    }

    public static void main(String[] args){
        Set<Integer> set=Set.of(5,3,9,1);
        sortSettoList(set);
    }
}
