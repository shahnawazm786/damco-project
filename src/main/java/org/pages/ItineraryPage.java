package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.utils.IWaitDurations;
import org.utils.SeleniumPageActions;

import java.util.List;
import java.util.Optional;

public class ItineraryPage {
    WebDriver driver;
    public ItineraryPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, IWaitDurations.FACTORY_WAIT),this);
    }
    @FindBy(css="span[data-testid$='coachmark-overlay-button']")
    private WebElement overlayGotItButton;
    public ItineraryPage clickOverlay(){
        SeleniumPageActions.click(this.driver,overlayGotItButton);
        return this;
    }


    @FindBy(xpath="(//span[contains(@class,'sortTabIcon')])[4]")
   private WebElement sortButton;
    public ItineraryPage clickSortButton(){
        SeleniumPageActions.click(this.driver,sortButton);
        return this;
    }
    @FindBy(xpath = "//span[contains(text(),'Early Departure')]")
    private WebElement earlyDepartureOption;
    public ItineraryPage clickEarlyDepatrure(){
        SeleniumPageActions.click(this.driver,earlyDepartureOption);
        return this;
    }
    @FindBy(css="p.airlineName")
    private List<WebElement> airlineNameText;
    @FindBy(css="div.clusterViewPrice")
    private List<WebElement> clusterViewPriceText;
    public ItineraryPage getSecondFlightPrice(){
        Optional<WebElement> element =clusterViewPriceText.stream().sorted().skip(1).findFirst();
        System.out.println("Price "+ element.get().getText());
        return this;
    }
    public ItineraryPage getSecondFlightName(){
        Optional<WebElement> element =airlineNameText.stream().sorted().skip(1).findFirst();
        System.out.println("Price "+ element.get().getText());
        return  this;
    }
    public ItineraryPage build(){
        return new ItineraryPage(this.driver);
    }
}
