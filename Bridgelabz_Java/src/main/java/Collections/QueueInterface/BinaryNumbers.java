package Collections.QueueInterface;
import java.util.LinkedList;
import java.util.Queue;

/*
         queue to genrate binary numbers
 */

public class BinaryNumbers {
    public static void binary(int n){
        Queue<String > queue=new LinkedList<>();
        /*for(int i=1;i<n+1;i++){
            queue.add(Integer.toBinaryString(i));
        }

        for(String num:queue){
            System.out.println(num);
        }
        */

        queue.add("1");
        for(int i=0;i<n;i++){
            String binary= queue.poll();
            System.out.print("\""+binary+"\"");
            if(i<n-1){
                System.out.print(", ");
            }
            queue.add(binary+"0");
            queue.add(binary+"1");
        }
    }

    public static void main(String[] args){
        binary(5);
    }
}
