package org.tests.mobile;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public abstract class MobileBaseTest {
    AndroidDriver driver;
    DesiredCapabilities capabilities;
    @BeforeClass
    public void set()  throws MalformedURLException{
    capabilities=new DesiredCapabilities();
    // connected with real device for assessment project
    capabilities.setCapability("appium:deviceName","OnePlus 10R 5G");
    // adb devices -l to list the connected devices
    capabilities.setCapability("appium:udid","GMSCSCBIVK65W4SW");
    capabilities.setCapability("platformName","Android");
    capabilities.setCapability("appium:platformVersion","14");
    capabilities.setCapability("appium:ignoreHiddenApiPolicyError",true);
    capabilities.setCapability("appium:noReset",true);
    capabilities.setCapability("appium:app","c:/apk_file/Calculator.apk");
    driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    }
    @AfterClass
    public void down(){
        if(driver!=null){
            driver.quit();
        }
    }
}
