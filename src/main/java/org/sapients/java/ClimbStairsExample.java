package org.sapients.java;

public class ClimbStairsExample {
    static int climbingStairs(int i,int n){
        if(i>n)
            return  0;
        if (i==n)
            return 1;
        return climbingStairs(i+1,n) + climbingStairs(i+2,n);

    }
    static int countClimbingStairs(int n){
        return  climbingStairs(0,n);
    }

    public static void main(String[] args) {
        System.out.println(countClimbingStairs(5));
    }
}
