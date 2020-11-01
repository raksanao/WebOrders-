package com.webOrder.B20;

import com.webOrder.utilities.BrowserUtils;
import com.webOrder.utilities.BrowserUtils2;
import com.webOrder.utilities.WebDriverFactoryB20;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alarts {
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
public void p1_information_alart_practice(){


    WebElement warningAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Alert']")) ;
    warningAlertButton.click();
    Alert alert=driver.switchTo().alert();
    BrowserUtils2.wait(3);
    alert.accept();

    WebElement result=driver.findElement(By.xpath("//p[@id='result']"));
    String actual=result.getText();
   // Assert.assertEquals(result.getText(),actual);
Assert.assertTrue(result.isDisplayed(),"Result is not displaid, Verification failed");
    }
    @Test
    public void p2_confirmation_alerts(){
        WebElement warningAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Confirm']")) ;
        warningAlertButton.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        WebElement result=driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(result.isDisplayed(),"Result is not displayed");
    }
}