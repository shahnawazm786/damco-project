package org.sapients.java;

import org.openqa.selenium.WebDriver;

// Can we override and overload static methods in java?
// We can overload static method
public class StaticMethodOverLoad {
    static void click(){
        System.out.println("Click method");
    }
    static void click(WebDriver driver){
        System.out.println("Click method overload");
    }
}
