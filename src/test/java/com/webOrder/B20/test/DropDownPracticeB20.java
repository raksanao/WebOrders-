package com.webOrder.B20.test;

import com.webOrder.B20.utilities.BrowserUtils2;
import com.webOrder.B20.utilities.WebDriverFactoryB20;
import com.webOrder.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownPracticeB20 {
    WebDriver driver;
    @BeforeMethod
    public void seUp() {
        driver = WebDriverFactoryB20.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BrowserUtils.wait(4);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void month_dropDown_deafault_value_test(){
        Select monthDropDown=new Select(driver.findElement(By.xpath("//select[@id='month']")));
String expectedValue = LocalDate.now().getMonth().name();
String actualValue=monthDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualValue.toLowerCase(),expectedValue.toLowerCase());
List<WebElement>actualMonthOptions=monthDropDown.getOptions();
        List<String>expectedMonthOptions=Arrays.asList("January","February","March","April","May","June",
                "July","August","September","October","November","December");

//List<String>actualMonthTexts=new ArrayList<>();
       // for (WebElement each : actualMonthOptions) {
    // actualMonthTexts.add(each.getText());
            Assert.assertEquals( BrowserUtils2.getElementsText(actualMonthOptions),expectedMonthOptions);


        }








    }
