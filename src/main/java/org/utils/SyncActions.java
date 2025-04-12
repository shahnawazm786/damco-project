package org.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SyncActions {
    static WebDriverWait wait;
    public static void waitTillPageLoad(WebDriver driver){
        wait=new WebDriverWait(driver,Duration.ofSeconds(IWaitDurations.PAGE_WAIT));
        wait.pollingEvery(Duration.ofMillis(IWaitDurations.PAGE_POLLING_WAIT));
        wait.until(ExpectedConditions.titleIs(""));
    }

    /**
     * Mohammad Shahnawaz
     * @param driver
     * @param element
     * @param time
     *
     */
    public static void waitTillElementVisible(WebDriver driver,WebElement element,long... time){
        if(time.length>0) {
            wait = new WebDriverWait(driver, Duration.ofSeconds(time[0]));
        }
        else{
            wait = new WebDriverWait(driver, Duration.ofSeconds(IWaitDurations.ELEMENT_WAIT));
        }
            wait.pollingEvery(Duration.ofMillis(IWaitDurations.PAGE_POLLING_WAIT));
            wait.until(ExpectedConditions.visibilityOf(element));

    }

    /**
     * Mohammad Shahnawaz
     * @param driver
     * @param element
     * @param time
     *
     */
    public static void waitTillElementClickable(WebDriver driver,WebElement element,long... time){

        if(time.length>0) {
            wait = new WebDriverWait(driver, Duration.ofSeconds(time[0]));
        }
        else{
            wait = new WebDriverWait(driver, Duration.ofSeconds(IWaitDurations.ELEMENT_WAIT));
        }
        wait.pollingEvery(Duration.ofMillis(IWaitDurations.PAGE_POLLING_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
