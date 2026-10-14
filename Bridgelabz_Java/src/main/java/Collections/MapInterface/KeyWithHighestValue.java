package Collections.MapInterface;
import java.util.HashMap;
import java.util.Map;
/*
    Given a Map<String, Integer>
    To find the key with the maximum value.
 */
public class KeyWithHighestValue {
    public static void highestValuedKey(Map<String,Integer> map){
        int maxValue=Integer.MIN_VALUE;
        String Index=null;

        //using the enhanced for loop, we create a key:value pair variable entry
        //the map.entrySet() contains all the key:value pairs from the map
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(maxValue<entry.getValue()){
                maxValue=entry.getValue();
                Index=entry.getKey();
            }
        }
        System.out.println(Index);
    }

    public static void main(String[] args){
        Map<String,Integer> map=new HashMap<>(Map.of("A",10, "B",20, "C",15));
        highestValuedKey(map);
    }
}
