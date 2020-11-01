package com.webOrder.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.webOrder.utilities.BrowserUtils;
import com.webOrder.utilities.ConfigurationReader;
import com.webOrder.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
protected WebDriver driver= Driver.getDriver();

protected static ExtentReports extentReports;
protected  static ExtentHtmlReporter extentHtmlReporter;
protected  static ExtentTest extentTest;


@BeforeMethod
public void setup(){
    driver = Driver.getDriver();
    driver.get(ConfigurationReader.getProperty("url"));
BrowserUtils.wait(4);
    driver.manage().window().maximize();




}
@AfterMethod
public void after(ITestResult iTestResult){
    if(iTestResult.getStatus()==ITestResult.FAILURE){
        String screenshortResult= BrowserUtils.getScreenshot(iTestResult.getName());
    }
    BrowserUtils.wait(3);
Driver.closeDriver();

}

}
