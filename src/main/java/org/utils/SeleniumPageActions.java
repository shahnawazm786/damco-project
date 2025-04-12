package org.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumPageActions {
    public static void click(WebDriver driver, WebElement element){
        SyncActions.waitTillElementClickable(driver,element,IWaitDurations.ELEMENT_WAIT);
        element.click();
    }
    public static void send_keys(WebDriver driver,WebElement element,String text){
        SyncActions.waitTillElementClickable(driver,element,IWaitDurations.ELEMENT_WAIT);
        element.clear();
        element.sendKeys(text);
    }
}
