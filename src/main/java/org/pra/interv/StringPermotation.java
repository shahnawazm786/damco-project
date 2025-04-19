package org.pra.interv;

public class StringPermotation {
    public static void main(String[] args) {
        String str="abc";
        Permotations(str,"");
    }

    static void Permotations(String ques,String asf){
        if(ques.length()==0) {
            System.out.println(asf);
            return;
        }
        for(int i=0;i<ques.length();i++){
            char c=ques.charAt(i);
            String lpart=ques.substring(0,i);
            String rpart=ques.substring(i+1);
            String roq=lpart + rpart;
            Permotations(roq,asf+c);
        }

    }
}
