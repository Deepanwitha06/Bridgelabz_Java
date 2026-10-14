package Collections.MapInterface;
import java.util.HashMap;
import java.util.Map;
/*
    Merge two maps such that if a key exists in both, sum their values.
 */

public class MergeMaps {
    public static void mergeMaps(Map<String,Integer> map1,Map<String,Integer> map2){
        Map<String,Integer> resultMap=new HashMap<>(map1);

        for(Map.Entry<String,Integer> entry: map2.entrySet()){
            String key=entry.getKey();
            int value= entry.getValue();;

            // below is also another approach
            /*if(resultMap.containsKey(key)){
                resultMap.put(key,value+resultMap.get(key));
            }else{
                resultMap.putIfAbsent(key,value);
            }*/

            //another approach: just while put if we use getOrDefault(key,0) gives value if key exist or gives 0 if doesnot exist
            resultMap.put(key,resultMap.getOrDefault(key,0)+value);
        }

        System.out.println(resultMap);
    }

    public static void main(String[] args){
        Map<String,Integer> map1=new HashMap<>(Map.of("A",1,"B",2));
        Map<String,Integer> map2=new HashMap<>(Map.of("B",3,"C",4));
        mergeMaps(map1,map2);
    }
}
