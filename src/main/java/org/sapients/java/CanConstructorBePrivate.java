package org.sapients.java;

import lombok.val;

//Can Constructor be private?
public class CanConstructorBePrivate {
    int value;
    private  CanConstructorBePrivate(int value){
        this.value=value;
    }

    public static void main(String[] args) {
        CanConstructorBePrivate c=new CanConstructorBePrivate(10);
        System.out.println(c.value);
    }
}
