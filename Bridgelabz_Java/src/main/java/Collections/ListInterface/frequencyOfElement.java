package Collections.ListInterface;
import java.util.HashMap;
import java.util.Map;
/*
    rfrequency of elements
    map<String,Integer>
 */
public class frequencyOfElement {
    public static void frequencyOfElements(String[] arr){
        Map<String ,Integer> text=new HashMap<>();
        for(String str:arr){
            text.put(str,text.getOrDefault(str,0)+1);
        }

        System.out.println("output: \n"+text);
    }
    public static void main(String[] args){
        String[] arr={"apple", "banana", "apple", "orange"};
        frequencyOfElements(arr);
    }
}
