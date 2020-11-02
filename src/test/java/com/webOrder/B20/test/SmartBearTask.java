package com.webOrder.B20.test;

import com.webOrder.B20.base.TestBase;
import com.webOrder.utilities.BrowserUtils;
import com.webOrder.utilities.ConfigurationReader;
import com.webOrder.B20.utilities.SmartBearUtilitiesB20;
import com.webOrder.B20.utilities.WebDriverFactoryB20;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearTask extends TestBase {
//    WebDriver driver;
//
//    @BeforeMethod
//    public void seUp() {
//        driver = WebDriverFactoryB20.getDriver("chrome");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        BrowserUtils.wait(4);
//        driver.manage().window().maximize();
//        //driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//        driver.get(ConfigurationReader.getProperty("url"));
//        SmartBearUtilitiesB20.loginToSmartBear(driver);


    @Test
    public void test1() {
        driver.get(ConfigurationReader.getProperty("url"));
        SmartBearUtilitiesB20.loginToSmartBear(driver);
        WebElement checkbox = driver.findElement(By.xpath("//tbody/tr[3]/td[1]"));
        checkbox.click();

        WebElement delete = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_btnDelete']"));
        delete.click();

//        List<WebElement> alltable = driver.findElements(By.xpath("//table[@class= 'SampleTable']/tbody/tr"));
//
//        for (WebElement each : alltable) {
//
//            if(each.getText().contains("Mark Smith")) {
//
//                System.out.println("test failed");
//            }else {
//                System.out.println("Mark smith removed");
//            }
//                Assert.assertFalse(alltable.equals("Mark Smith"));
        //SmartBearUtilitiesB20.verifyOrder(driver,"Mark Smith");

        List<WebElement> names = driver.findElements(By.xpath("//table[@class='SampleTable']//tr/td[2] "));
        for (WebElement each : names) {

            Assert.assertFalse(each.getText().equals("Mark Smith"));
        }
    }
    }
