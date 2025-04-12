package org.tests.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.util.enums.BrowserName;
import org.util.prop.PropertiesFile;
import java.time.Duration;

public abstract class BaseTest {
    WebDriver driver=null;
    ChromeOptions chromeOptions=null;
    FirefoxOptions firefoxOptions=null;
    EdgeOptions edgeOptions=null;
    SafariOptions safariOptions=null;
    @BeforeClass
    public void setup() throws Exception{
        this.driver=getDriver(browserName());
        this.driver.manage().window().maximize();
        this.driver.manage().deleteAllCookies();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        this.driver.get(PropertiesFile.get("webURL"));
    }
    private String browserName() throws Exception {
        return PropertiesFile.get("browserName");
    }
    private WebDriver getDriver(String browserName){
        switch (browserName.toUpperCase()){
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                chromeOptions=new ChromeOptions();
                //chromeOptions.addArguments("test-type");
                chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
                chromeOptions.addArguments("start-maximized");
                chromeOptions.addArguments("--window-size=1920,1080");
                chromeOptions.addArguments("--enable-precise-memory-info");
                chromeOptions.addArguments("--disable-popup-blocking");
                chromeOptions.addArguments("--disable-default-apps");
                chromeOptions.addArguments("--incognito");
               // chromeOptions.addArguments("test-type=browser");
                this.driver=new ChromeDriver(chromeOptions);
                break;
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                firefoxOptions=new FirefoxOptions();
                firefoxOptions.addArguments("");
                this.driver=new FirefoxDriver(firefoxOptions);
                break;
            case "EDGE":
                WebDriverManager.edgedriver().setup();
                edgeOptions=new EdgeOptions();
                edgeOptions.addArguments("");
                this.driver=new EdgeDriver(edgeOptions);
                break;
            case "SAFARI":
                WebDriverManager.safaridriver().setup();
                safariOptions=new SafariOptions();
                this.driver=new SafariDriver();
                break;
        }
        return driver;
    }
    @AfterClass
    public void tearDown(){
        System.out.println("After class");
        try{
            if(driver!=null){
                //driver.quit();
            }
        }catch (Exception  ex){}
    }
}
