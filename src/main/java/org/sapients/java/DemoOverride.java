package org.sapients.java;
// we can override the static method as well
public class DemoOverride {
    public static void main(String[] args) {
        StaticMethodOverride st=new parent();
        st.show();
        parent.show();
        StaticMethodOverride.show();

    }
}
