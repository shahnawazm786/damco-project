package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.utils.IWaitDurations;
import org.utils.SeleniumPageActions;

import java.util.List;

public class FlightSearchPage {
    WebDriver driver;
    public FlightSearchPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, IWaitDurations.FACTORY_WAIT),this);
    }
    //fromCity
    @FindBy(id="fromCity")
    private WebElement fromCityBox;
    @FindBy(id="toCity")
    private WebElement toCityBox;
    @FindBy(css = "a.widgetSearchBtn")
    private WebElement searchButton;
    public FlightSearchPage clickFromCity(){
        SeleniumPageActions.click(this.driver,fromCityBox);
        return this;
    }
    @FindBy(css="input[placeholder='From']")
    private WebElement fromInputBox;
    public FlightSearchPage enterFromCity(String fromCity){
        //try{Thread.sleep(2000);}catch(InterruptedException ie){}
        SeleniumPageActions.click(this.driver,fromInputBox);
        SeleniumPageActions.send_keys(this.driver,fromInputBox,fromCity);
        return this;
    }
    @FindBy(xpath="//p[text()='New Delhi, India']")
    private WebElement optionsDelhi;
    public FlightSearchPage selectFromCity(){
        SeleniumPageActions.click(this.driver,optionsDelhi);
        return this;
    }

    public FlightSearchPage clickToCity(){
        SeleniumPageActions.click(this.driver,toCityBox);
        return this;
    }
    @FindBy(css="input[placeholder='To']")
    private WebElement toInputBox;
    public FlightSearchPage enterToCity(String toCity){
        SeleniumPageActions.send_keys(this.driver,toInputBox,toCity);
        return this;
    }
    @FindBy(xpath="//p[text()='Mumbai, India']")
    private WebElement toCityOption;
    public FlightSearchPage selectToCity(){
        SeleniumPageActions.click(this.driver,toCityOption);
        return this;
    }
    @FindBy(css="div.dateInnerCell>p")
    private List<WebElement> calendarDay;
    public FlightSearchPage clickOnDay(){
        SeleniumPageActions.click(this.driver,calendarDay.get(10));
        return this;
    }


    public FlightSearchPage clickSearch(){

        SeleniumPageActions.click(this.driver,searchButton);
        return this;
    }
    public FlightSearchPage build(){
        return new FlightSearchPage(this.driver);
    }
}

