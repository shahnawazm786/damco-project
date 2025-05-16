package org.sapients.java.dbs_bank;

public class ArrayIsNull {
    public static void main(String[] args) {
        int[] a=null;
        int[] b={};
        int[] c={10,20,30};
        if(a==null || a.length==0){
            System.out.println("Array is null");
        }
        if(b==null||b.length==0){
            System.out.println("Empty");
        }
        if(c!=null || c.length!=0){
            System.out.println("Not empty not null");
        }
    }
}
