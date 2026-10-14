package Collections.SetInterface;
import java.util.HashSet;
import java.util.Set;
/*
    symmetric difference: elements in sither set but not in both
 */
public class SymmetricDifference {
    public static void symmetricDifference(Set<Integer> set1,Set<Integer>set2){

        //union for all the elements
        Set<Integer> union=new HashSet<>(set1);
        union.addAll(set2);

        //intersection for the common elements
        Set<Integer> intersection=new HashSet<>(set1);
        intersection.retainAll(set2);

        //difference for removing the intersection from union
        Set<Integer> difference=new HashSet<>(union);
        difference.removeAll(intersection);
        System.out.print("Symmetric difference: "+difference);
    }

    public static void main(String[] args){
        Set<Integer> set1=Set.of(1,2,3);
        Set<Integer> set2=Set.of(3,4,5);
        symmetricDifference(set1,set2);
    }
}
