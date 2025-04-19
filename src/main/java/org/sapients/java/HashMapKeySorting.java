package org.sapients.java;

import java.util.*;

/*
 HashMap sorting using keys where it contains one null key
 */
public class HashMapKeySorting {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put(null,"Mohammad");
        map.put("Patna","Kalam");
        map.put("Delhi","Salam");
        map.put("Kolkatta","John");
        map.put("Mumbai","King");
        map.put("Chennai","Clark");
        List<String> list=new ArrayList<>();
        list.addAll(map.keySet());
        System.out.println("All keys");
        System.out.println(list);
        //Collections.sort(list);
        list.sort(Comparator.nullsFirst((o1, o2) -> o1.compareTo(o2)));
        System.out.println("=============");
        System.out.println("Sorted Key");
        System.out.println(list);
        System.out.println("==========");
        for(String s:list){
            System.out.print("Key is =>"+ s);
            System.out.println("\t Value is =>"+map.get(s));
        }
        /*for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }*/
//        TreeMap<String,String> treeMap=new TreeMap<>();
//        treeMap.putAll(map);
//        System.out.println(treeMap);
    }
}
