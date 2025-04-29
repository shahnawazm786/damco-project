package org.sapients.java.oops;

public class Experiemnt {
    public static void main(String[] args) {
        ChildClass c=new ChildClass();
        c.a=70;
        c.display();
        ParentClass p=new ChildClass();
        p.a=100;
        p.display(p.a);
    }
}
