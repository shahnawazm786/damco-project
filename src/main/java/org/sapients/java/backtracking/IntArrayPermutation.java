package org.sapients.java.backtracking;

import java.util.ArrayList;
import java.util.List;

public class IntArrayPermutation {

    public static void main(String[] args) {
        int[] num={1,2,3};
        List<List<Integer>> result=new ArrayList<>();
        getPermutaion(num,0,result);
        for(List<Integer> p:result){
            System.out.println(p);
        }
    }
    static void getPermutaion(int[] num,int start,List<List<Integer>> results){
        if(start==num.length){
            List<Integer> current=new ArrayList<>();
            for(int nm:num)
                current.add(nm);
            results.add(new ArrayList<>(current));
            return;
        }
        for(int i=start; i<num.length; i++){
            swap(num,i,start);
            getPermutaion(num, start+1, results);
            swap(num,i,start);
        }
    }
    static void swap(int[] num,int i,int j){
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }
}
