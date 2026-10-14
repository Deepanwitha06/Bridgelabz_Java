package Collections.MapInterface;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
/*
      To invert a Map<K, V> to produce a Map<V, K>.
      Handle duplicate values by storing them in a list.

 */
public class InvertMap {
    public static void invert(Map<String,Integer> map){
        //create a new map
        Map<Integer, LinkedList<String>> invertedMap=  new HashMap<>();

        //using the enhanced for loop, we create a key:value pair variable entry
        //the map.entrySet() contains all the key:value pairs from the map
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            //get the key and value to word and num respectively
            String word=entry.getKey();
            int num=entry.getValue();

            //if the key doesnot exist we create new key and new linkedlist for that key, using putIfAbsence
            invertedMap.putIfAbsent(num,new LinkedList<>());
            //invertMao.get(num) gives the values for that particular key which is the list
            //for that list we now add the word
            invertedMap.get(num).add(word);
        }

        System.out.println(invertedMap);
    }

    public static void main(String[] args){
        Map<String ,Integer> map=new HashMap<>(Map.of("A",1, "B",2, "C",1));
        invert(map);
    }
}
