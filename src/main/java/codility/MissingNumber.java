package codility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MissingNumber {
    List<Integer> aList=new ArrayList<>();
    HashSet<Integer> aHash=new HashSet<>();
    public  int Solution(int[] A){
        for(int i=1;i<=A.length+1;i++){
            aList.add(i);
        }
        for(int i=0;i<A.length;i++){
            aList.remove(Integer.valueOf(A[i]));
        }
        return aList.get(0);
    }
    public  int Solution1(int[] A){
        for(int i=1;i<=A.length+1;i++){
            aHash.add(i);
        }
        for(int i=0;i<A.length;i++){
            aHash.remove(Integer.valueOf(A[i]));
        }
        return aHash.iterator().next();
    }
    public static void main(String[] args) {
        MissingNumber mn=new MissingNumber();
        System.out.println(mn.Solution(new int[]{1,2,3,5}));
        System.out.println(mn.Solution1(new int[]{1,2,3,5}));
        System.out.println(mn.Solution1(new int[]{}));
    }
}
