package StackQueueHashMapAndFunction.HashMapAndFunction;
import java.util.LinkedList;
public class CustomHashMap {
    LinkedList<Integer>[] map=new LinkedList[10];

    // Insert key
    public void put(int key) {
        int index=key%10;
        if(map[index]==null) {
            map[index]=new LinkedList<>();
        }
        if(!map[index].contains(key)) {
            map[index].add(key);
        }
    }

    // Search key
    public boolean get(int key) {
        int index=key%10;

        if(map[index]!=null) {
            return map[index].contains(key);
        }

        return false;
    }

    // Delete key
    public void remove(int key) {
        int index=key%10;

        if(map[index]!=null) {
            map[index].remove(Integer.valueOf(key));
        }
    }

    public static void main(String[] args) {
        CustomHashMap obj=new CustomHashMap();

        obj.put(10);
        obj.put(20);
        obj.put(15);

        System.out.println(obj.get(10));
        System.out.println(obj.get(20));

        obj.remove(10);

        System.out.println(obj.get(10));
    }
}