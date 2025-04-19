package org.pra.interv;

public class PermotationExample {
    public static void main(String[] args) {
    generatePermutation("ABC","");
    }
    static void generatePermutation(String str,String prefix){
        if(str.length()==0)
            System.out.println(prefix);
        else {
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                String remain=str.substring(0,i)+ str.substring(i+1);
                generatePermutation(remain,prefix+c);
            }
        }
    }
}
