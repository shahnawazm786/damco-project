package org.sapients.java.strings;

import java.util.ArrayList;
import java.util.List;

public class FilterSpecialCharacterFromString {
    public static void main(String[] args) {
        filter("m79&fg%3^");
        removeSepcialCharacter("a##$$bcd%^789$$%%");
        keepSpecialCharacter("a##$$bcd%^789$$%%  asd$$  ghj768");
    }
    static void filter(String sentence){
        List<Character> characters=new ArrayList<>();
        for(char c: sentence.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                characters.add(c);
            }
        }
        System.out.println(characters);
    }
    static void removeSepcialCharacter(String sentence){
        String cleaned=sentence.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(cleaned);
    }
    static void keepSpecialCharacter(String sentence){
        String cleaned=sentence.replaceAll("[a-zA-Z0-9\\s]","");
        System.out.println(cleaned);
    }
}
