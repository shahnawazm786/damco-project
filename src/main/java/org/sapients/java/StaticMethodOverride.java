package org.sapients.java;
//Can we override static methods in java?
//
public class StaticMethodOverride {
    static void show(){
        System.out.println("show Method in parent class");
    }

}
class parent extends  StaticMethodOverride{
    static  void show(){
        System.out.println("show method in child class");
    }
}

