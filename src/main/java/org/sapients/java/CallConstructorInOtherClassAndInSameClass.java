package org.sapients.java;
// How to call constructors of other classes and same class in this class
// This is an example of constructor called in the same class
public class CallConstructorInOtherClassAndInSameClass {
    int value;
    void show(){
        System.out.println("Show method");
        System.out.println("Value is"+this.value);
    }
    public CallConstructorInOtherClassAndInSameClass(){
        this(0);
    }
    public CallConstructorInOtherClassAndInSameClass(int value){
        this.value=value;
    }
    public static void main(String[] args) {
        CallConstructorInOtherClassAndInSameClass c=new CallConstructorInOtherClassAndInSameClass(10);
        c.show();
    }
}
