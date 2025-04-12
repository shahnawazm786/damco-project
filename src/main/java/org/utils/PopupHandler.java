package org.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PopupHandler {
    WebDriver driver;
    public PopupHandler(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,(int)IWaitDurations.ELEMENT_WAIT),this);
    }
    @FindBy(css="span.commonModal__close")
    private WebElement modelButtonClose;
    public PopupHandler clickToClose(){
        SeleniumPageActions.click(driver,modelButtonClose);
        return this;
    }
    public PopupHandler build(){
        return new PopupHandler(this.driver);
    }
}
