package org.sapients.seleniums;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//How can we run test method and test class multiple times like 100 times?

public class TestRunHundredTimes {
    //@BeforeClass()
    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before Class");
    }
    @Test(invocationCount = 10,threadPoolSize = 3,testName = "test1")
    public void test1(){
        System.out.println("Test1");
    }
}
