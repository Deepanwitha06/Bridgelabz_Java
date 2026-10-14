package Collections.ListInterface;

import java.util.LinkedList;

/*
     rotate elements in a list
 */
public class RotateElements {
    public static void rotateElementsInList(int[] arr,int pos) {
        pos=pos%arr.length;
        /*LinkedList<Integer> list=new LinkedList<>();
        for(int i=pos-1;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<pos;i++){
            list.add(arr[i]);
        }*/

        LinkedList<Integer> list = new LinkedList<>();
        for (int num : arr) {
            list.add(num);
        }

        int j=0;
        while(j!=pos){
            int temp=list.remove(0);
            j++;
            System.out.println("Removed: "+temp);
            list.add(temp);
        }

        System.out.println("Output: ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }

    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int pos=2;
        rotateElementsInList(arr,pos);
    }
}
