package org.sapients.seleniums;

import org.testng.annotations.Test;
//Does priority in TestNG will have negative values and 0 value?
public class TestPriority {
    @Test(priority = -6)
    public void Login(){
        System.out.println("Test1 priority 1");
    }
    @Test(priority = 0)
    public void Home(){
        System.out.println("Test2 priority 0");
    }
    @Test(priority = -5)
    public void Screen(){
        System.out.println("Test3 priority -1");
    }
    @Test(priority = 0)
    public void Test3(){
        System.out.println("Test3 priority -1");
    }

}
