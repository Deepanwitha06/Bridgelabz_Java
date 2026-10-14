package Collections.ListInterface;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/*
       problem: reverse a list
       use: arrauylist and linkedlist
 */
public class ReverseList {
    public static void reverseUsingArraylist(int[] arr){

        //array to arraylist
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr){
            list.add(num);
        }

        //reverse the list
        int left=0;
        int right=list.size()-1;
        while(left<right){
            int temp=list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
        System.out.println("Reverse: ");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void reversUsingLinkedlist(int[] arr){

        //array to linkelist
        LinkedList<Integer> list=new LinkedList<>();
        for(int num:arr){
            list.add(num);
        }

        //reverse of linkedlist
        int left=0;
        int right=list.size()-1;
        while(left<right){
            int temp=list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
        System.out.println("Reverse: ");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args){
        String text="Hello!";
        int[] arr={1,2,3};
        reverseUsingArraylist(arr);
        reversUsingLinkedlist(arr);
    }
}
