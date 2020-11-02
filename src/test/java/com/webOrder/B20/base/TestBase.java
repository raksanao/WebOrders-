package com.webOrder.B20.base;

import com.webOrder.B20.utilities.WebDriverFactoryB20;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
   protected WebDriver driver;
   @BeforeMethod
    public void setup() {
       driver = WebDriverFactoryB20.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }
       @AfterMethod
               public void tardown(){
           driver.close();
       }
   }
