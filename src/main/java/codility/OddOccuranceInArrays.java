package codility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class OddOccuranceInArrays {
    List<Integer> aList=new ArrayList<>();
    HashSet<Integer> aHash=new HashSet<>();
    public int Solution(int[] A){
        //for(int i=0;i<A.length;i++){
        for(int a:A){
            //int a=A[i];
            if(aList.contains(a)){
                aList.remove(Integer.valueOf(a));
            }
            else {
                aList.add(a);
            }

        }
        return aList.get(0);
    }
    public int Solution1(int[] A){
        //for(int i=0;i<A.length;i++){
        for(int a:A){
            //int a=A[i];
            if(aHash.contains(a)){
                aHash.remove(Integer.valueOf(a));
            }
            else {
                aHash.add(a);
            }

        }
        return aHash.iterator().next();
        //return aList.get(0);
    }
    public static void main(String[] args) {
        OddOccuranceInArrays oi=new OddOccuranceInArrays();
        System.out.println(oi.Solution(new int[]{9,3,9,3,9,7,9}));
        System.out.println(oi.Solution1(new int[]{9,3,9,3,9,7,9}));
    }
}
