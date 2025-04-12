package org.tests.web;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.pages.FlightSearchPage;
import org.pages.ItineraryPage;
import org.utils.PopupHandler;

public class FlightPriceTest extends BaseTest{

    @BeforeMethod
    public void beforeMethod(){

    }
    @Test
    public  void flightTest(){
        new PopupHandler(driver).clickToClose().build();
        new FlightSearchPage((driver))
                .clickFromCity()
                .enterFromCity("Delhi")
                .selectFromCity()
                .clickToCity()
                .enterToCity("Mumbai")
                .selectToCity()
                .clickOnDay()
                .clickSearch()
                .build();
        new ItineraryPage(driver)
                .clickOverlay()
                .clickSortButton()
                .clickEarlyDepatrure()
                .getSecondFlightPrice()
                .getSecondFlightName()
                .build();
    }
    @AfterMethod
    public void afterMethod(){
    }
}
