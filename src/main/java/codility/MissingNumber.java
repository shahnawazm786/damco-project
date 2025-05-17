package codility;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
    List<Integer> aList=new ArrayList<>();
    public  int Solution(int[] A){
        for(int i=1;i<=A.length+1;i++){
            aList.add(i);
        }
        for(int i=0;i<A.length;i++){
            aList.remove(Integer.valueOf(A[i]));
        }
        return aList.get(0);
    }
    public static void main(String[] args) {
        MissingNumber mn=new MissingNumber();
        System.out.println(mn.Solution(new int[]{1,2,3,5}));
    }
}
