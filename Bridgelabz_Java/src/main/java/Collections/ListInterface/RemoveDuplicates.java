package Collections.ListInterface;

import java.util.LinkedList;

/*
      remove duplicates
 */
public class RemoveDuplicates {
    public static void removeDuplicates(int[] arr){
        LinkedList<Integer> list=new LinkedList<>();

        for(int num:arr){
            if(!list.contains(num)){
                list.add(num);
            }
        }

        System.out.print("Output: ");
        for(int num:list){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args){
        int[] arr={3,2,1,2,3,4};
        removeDuplicates(arr);
    }
}
