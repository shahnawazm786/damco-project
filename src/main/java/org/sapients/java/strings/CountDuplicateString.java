package org.sapients.java.strings;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateString {
    public static void main(String[] args) {
    countWord("java programming language java is not programming java is oops concept");
    }

    static void countWord(String str) {
        String[] words;
        Map<String, Integer> countWords = new HashMap<>();
            words = str.split(" ");
            for (String w : words) {
                //if (!countWords.containsKey(w)) {
                    countWords.put(w, countWords.getOrDefault(w, 0) + 1);
                //}
            }
            for(Map.Entry<String,Integer> m:countWords.entrySet()){
                if(m.getValue()>1){
                    System.out.println(m.getKey() + "\t=>\t"+m.getValue());
                }
            }
            System.out.println(countWords);
    }
}
