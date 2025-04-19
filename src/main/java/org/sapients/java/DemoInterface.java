package org.sapients.java;

public class DemoInterface extends  AbstractClass implements Interface1{

    @Override
    public void iphone() {
        System.out.println("Interface -1 => Iphone");
    }

    @Override
    public void samsung() {
        System.out.println("Interface -1 => Samsung");
    }

    @Override
    public void nokia() {
        System.out.println("Interface -1 => Nokia");

    }

    @Override
    public void vivo() {
        System.out.println("Interface -1 => Vivo");
    }

    @Override
    void htc() {
        super.htc();
    }

    @Override
    public void realme() {
        super.realme();
    }
}
