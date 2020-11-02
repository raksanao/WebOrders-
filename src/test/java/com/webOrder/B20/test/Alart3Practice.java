package com.webOrder.B20.test;

import com.webOrder.utilities.BrowserUtils;
import com.webOrder.B20.utilities.BrowserUtils2;
import com.webOrder.B20.utilities.WebDriverFactoryB20;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alart3Practice {
    WebDriver driver;
    @BeforeMethod
    public void seUp() {
        driver = WebDriverFactoryB20.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BrowserUtils.wait(4);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }
    @Test
public  void promtalartPtractice(){
      WebElement clickingtoJS=  driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
      clickingtoJS.click();
        BrowserUtils2.wait(2);
  Alert alert= driver.switchTo().alert();
        alert.sendKeys("hello");
        BrowserUtils2.wait(2);
alert.accept();
   WebElement text=driver.findElement(By.xpath("//p[@id='result']"));
   String textStr=text.getText();
   Assert.assertEquals(textStr,"You entered: hello");
        Assert.assertTrue(text.isDisplayed(),"It didnt display");



    }
}
