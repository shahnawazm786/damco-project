package org.sapients.java.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("aabbccdd ll mm nn "));
        System.out.println(removeDuplicateUsingArray("aabbccdd ll mm nn "));
    }
    static String removeDuplicate(String str){
        StringBuilder sb=new StringBuilder();
        HashSet<Character> unique=new HashSet<>();
        for(char c:str.toCharArray()){
            if(!unique.contains(c)){
                unique.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
    static  String removeDuplicateUsingArray(String str){
        StringBuilder sb=new StringBuilder();
        List<Character> unique=new ArrayList<>();
        for(char c:str.toCharArray()){
            if(!unique.contains(c)){
                unique.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
