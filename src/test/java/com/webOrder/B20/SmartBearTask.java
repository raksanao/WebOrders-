package com.webOrder.B20;

import com.webOrder.pages.LoginPage;
import com.webOrder.utilities.BrowserUtils;
import com.webOrder.utilities.ConfigurationReader;
import com.webOrder.utilities.SmartBearUtilitiesB20;
import com.webOrder.utilities.WebDriverFactoryB20;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartBearTask {
    WebDriver driver;

    @BeforeMethod
    public void seUp() {
        driver = WebDriverFactoryB20.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BrowserUtils.wait(4);
        driver.manage().window().maximize();
        //driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.get(ConfigurationReader.getProperty("url"));
      LoginPage loginPage=new LoginPage();
      loginPage.login();
       // driver.get("url");
        SmartBearUtilitiesB20.loginToSmartBear(driver);

    }
    @Test
    public void test1() {
    }
}
