package org.sapients.seleniums;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

//Why do we use constructors in selenium?
// Page Object Model we are using the constructor to pass the driver and intialize the locator
public class ConstructorInSelenium {
    WebDriver driver;
    public ConstructorInSelenium(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);
    }
    @FindBy(css="input[name='firstName']")
    private WebElement element1;
}
