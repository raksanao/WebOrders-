package com.webOrder.B20.test;

import com.webOrder.utilities.BrowserUtils;
import com.webOrder.B20.utilities.WebDriverFactoryB20;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {
    WebDriver driver;
    @BeforeMethod
    public void seUp() {
        driver = WebDriverFactoryB20.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BrowserUtils.wait(4);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/iframe");

    }
    @Test
    public void test1(){
        driver.switchTo().frame(0);
        WebElement text=driver.findElement(By.xpath("//p[.='Your content goes here.'] "));
        Assert.assertTrue(text.isDisplayed(),"If not displaied it failes");
        driver.switchTo().defaultContent();
        WebElement editor=driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(editor.isDisplayed(),"Heder not diplayd test failed");
    }
    }
