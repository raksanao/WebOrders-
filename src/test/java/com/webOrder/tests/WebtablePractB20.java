package com.webOrder.tests;

import com.webOrder.pages.LoginPage;
import com.webOrder.utilities.BrowserUtils;
import com.webOrder.utilities.ConfigurationReader;
import com.webOrder.utilities.Driver;
import com.webOrder.utilities.SmartBearUtilitiesB20;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebtablePractB20 {
    WebDriver driver;
    @BeforeMethod
    public void seUp(){
        driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("url"));
        BrowserUtils.wait(4);
        driver.manage().window().maximize();
       LoginPage login= new LoginPage();
        login.login();
        SmartBearUtilitiesB20.loginToSmartBear(driver);
    }
    @Test
    public void task4verifyOrder(){
        SmartBearUtilitiesB20.verifyOrder(driver,"Mark Smith");
    }

    @Test
    public void task5TestCities(){
SmartBearUtilitiesB20.printNamesAndCities(driver);
    }







}
