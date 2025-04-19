package org.sapients.java;

import java.util.HashMap;
import java.util.Map;
// Question
/*
 Does Map supports null keys?
 */
public class CheckNullKeyAllowInMap {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put(null,"Arham");
        map.put("Name","Hanan");
        System.out.println(map);
    }
}
