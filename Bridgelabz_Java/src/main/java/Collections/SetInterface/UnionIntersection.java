package Collections.SetInterface;
import java.util.Set;
import java.util.HashSet;
/*
        union and intersection of two sets
        union- all the elements of two sets
        intersection - common elemenrs of both sets
 */
public class UnionIntersection {
    public static void union(Set<Integer> set1,Set<Integer> set2){
        Set<Integer> union=new HashSet<>(set1);
        union.addAll(set2);

        System.out.println("Union: "+union);
    }

    public static void intersection(Set<Integer> set1,Set<Integer> set2){
        Set<Integer> intersection=new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: "+intersection);
    }

    public static void main(String[] args){
        Set<Integer> set1=Set.of(1,2,3);
        Set<Integer> set2=Set.of(3,4,5);
        union(set1,set2);
        intersection(set1,set2);
    }
}
