package org.sapients.java.backtracking;

public class StringPermutation {
    public static void main(String[] args) {
        getPermutation("abcd","");
    }
    public static void getPermutation(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            String lpart=ques.substring(0,i);
            String rpart=ques.substring(i+1);
            String ro=lpart + rpart;
            getPermutation(ro,ans+ch);
        }
    }
}
