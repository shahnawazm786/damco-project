package org.sapients.java.strings;

public class ReverseStringKeepSpecialCharacterAsItIs {
    public static void main(String[] args) {
        reverse("ab#de$klm");
    }
    static void reverse(String str){
        char[] chars=str.toCharArray();
        System.out.println(chars);
        for(int i=0,j=chars.length-1;i<j;){
            if(!Character.isLetterOrDigit(chars[i])){
                i++;
            }
            else if(!Character.isLetterOrDigit(chars[j])){
                j--;
            }
            else{
                char c=chars[i];
                chars[i]=chars[j];
                chars[j]=c;
                i++;
                j--;
            }
        }
        System.out.println(chars);
    }

}
