package org.tests.mobile;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.pages.CalculatorFirstPage;
public class MobileTest extends MobileBaseTest{
    CalculatorFirstPage cal;
    @BeforeMethod
    public void init(){
        System.out.println("init method of before method");
        cal=new CalculatorFirstPage(driver);
    }
    @Test(description = "Addition")
    public void add(){
        cal.addOperation(5,6);
    }
    @Test(description = "Substraction")
    public void substract(){
        cal.substractOperation(5,6);
    }
    @Test(description = "Multiplication")
    public void multiply(){
    cal.multiplyOperation(8,9);
    }
    @Test(description = "Division of two number")
    public void div(){
        cal.divisionOperation(8,2);
    }

}
