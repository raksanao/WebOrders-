package com.webOrder.B20.test;

import com.webOrder.B20.utilities.WebDriverFactoryB20;
import com.webOrder.utilities.BrowserUtils;
import com.webOrder.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UplodingPicture {
    @Test
    public void uoploadingfile(){
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        Driver.getDriver().manage().window().maximize();
        String path="/Users/ABC/Desktop/Screen\\ Shot\\ 2020-10-26\\ at\\ 5.49.54\\ PM.png";
        WebElement uploadeInput=Driver.getDriver().findElement(By.id("file-ipload"));
        uploadeInput.sendKeys(path);
    }

}
