package org.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import org.utils.IWaitDurations;

public class CalculatorFirstPage {
    AndroidDriver driver;
    public CalculatorFirstPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, IWaitDurations.FACTORY_WAIT),this);
    }
    @FindBy(id="com.example.calculator:id/b1")
    private WebElement ButtonOne;
    @FindBy(id="com.example.calculator:id/b2")
    private WebElement ButtonTwo;
    @FindBy(id="com.example.calculator:id/b3")
    private WebElement ButtonThree;
    @FindBy(id="com.example.calculator:id/b4")
    private WebElement ButtonFour;
    @FindBy(id="com.example.calculator:id/b5")
    private WebElement ButtonFive;
    @FindBy(id="com.example.calculator:id/b6")
    private WebElement ButtonSix;
    @FindBy(id="com.example.calculator:id/b7")
    private WebElement ButtonSeven;
    @FindBy(id="com.example.calculator:id/b8")
    private WebElement ButtonEight;
    @FindBy(id="com.example.calculator:id/b9")
    private WebElement ButtonNine;
    @FindBy(id="com.example.calculator:id/b0")
    private WebElement ButtonZero;
    @FindBy(id="com.example.calculator:id/bplus")
    private WebElement ButtonPlus;
    @FindBy(id="com.example.calculator:id/bminus")
    private WebElement ButtonMinus;
    @FindBy(id="com.example.calculator:id/bmod")
    private WebElement ButtonMultiply;
    @FindBy(id="com.example.calculator:id/bdiv")
    private WebElement ButtonDiv;
    @FindBy(id="com.example.calculator:id/bequal")
    private WebElement ButtonEqual;
    @FindBy(id="com.example.calculator:id/tvmain")
    private WebElement resultText;

    private void clickNumericButton(int number){
        switch (number){
            case 1:
                ButtonOne.click();
                break;
            case 2:
                ButtonTwo.click();
                break;
            case 3:
                ButtonThree.click();
                break;
            case 4:
                ButtonFour.click();
                break;
            case 5:
                ButtonFive.click();
                break;
            case 6:
                ButtonSix.click();
                break;
            case 7:
                ButtonSeven.click();
                break;
            case 8:
                ButtonEight.click();
                break;
            case 9:
                ButtonNine.click();
                break;
            case 0:
                ButtonZero.click();
                break;

        }
    }
    private void operationButton(String symbol){
        switch (symbol){
            case "+":
                ButtonPlus.click();
                break;
            case "-":
                ButtonMinus.click();
                break;
            case "*":
                ButtonMultiply.click();
                break;
            case "%":
                ButtonDiv.click();
                break;
            case "=":
                ButtonEqual.click();
                break;
        }
    }
    private void getResult(double result){
        String res=resultText.getText();
        Assert.assertEquals(Double.parseDouble(res),result);
    }
    public void addOperation(int a,int b){
        clickNumericButton(a);
        operationButton("+");
        clickNumericButton(b);
        operationButton("=");
        getResult(a+b);
    }
    public void substractOperation(int a,int b){
        clickNumericButton(a);
        operationButton("-");
        clickNumericButton(b);
        operationButton("=");
        getResult(a-b);
    }
    public void multiplyOperation(int a,int b){
        clickNumericButton(a);
        operationButton("*");
        clickNumericButton(b);
        operationButton("=");
        getResult(a*b);
    }
    public void divisionOperation(int a,int b){
        if(b==0){
            throw new ArithmeticException("Number can't devide by zero");
        }else {
            clickNumericButton(a);
            operationButton("%");
            clickNumericButton(b);
            operationButton("=");
            getResult(a % b);
        }
    }
}
