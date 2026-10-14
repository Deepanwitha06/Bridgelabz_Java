package Collections.MapInterface;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/*
      Read a text file and count the frequency of each word
      using a HashMap.
      Ignore case and punctuation.
 */
public class WordFrequencyCounter {
    public static void frequencyCounter(String text){
        text=text.toLowerCase();
        text=text.replaceAll("[^a-zA-Z\\s]","");
        String[] words=text.trim().split("\\s+");
        Map<String ,Integer> frequency=new HashMap<>();
        for(String word:words){
            frequency.put(word, frequency.getOrDefault(word,0)+1);
        }

        System.out.println(frequency);
    }

    public static void main(String[] args){
        String text="Hello world, hello Java!";
        frequencyCounter(text);
    }
}
