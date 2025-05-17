package org.dbs_bank;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
    sort(new int[]{10,5,7,2,14,3});
    }
    static  void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
