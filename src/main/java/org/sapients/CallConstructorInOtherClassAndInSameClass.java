package org.sapients;
// How to call constructors of other classes and same class in this class
// This is an example of constructor called in the same class
public class CallConstructorInOtherClassAndInSameClass {
    void show(){
        System.out.println("Show method");
    }
    public CallConstructorInOtherClassAndInSameClass(){

    }
    public static void main(String[] args) {
        CallConstructorInOtherClassAndInSameClass c=new CallConstructorInOtherClassAndInSameClass();
        c.show();
    }
}
