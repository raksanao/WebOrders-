package com.webOrder.B20.test;

import com.webOrder.utilities.BrowserUtils;
import com.webOrder.B20.utilities.WebDriverFactoryB20;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Windowhandletask {


    WebDriver driver;

    @BeforeMethod
    public void seUp() {
        driver = WebDriverFactoryB20.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BrowserUtils.wait(4);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/windows");

    }

    @Test
    public void windwohandletask() {
        //
        String actualtitle = driver.getTitle();
        System.out.println("actualTitle " + actualtitle);
        // String mainHandle = driver.getTitle();
        Assert.assertTrue(actualtitle.equals("Practice"));
        WebElement openNewWin = driver.findElement(By.xpath("//a[.='Click Here']"));
        openNewWin.click();

        String titleAftetclick = driver.getTitle();
        System.out.println("titleAftetclick = " + titleAftetclick);
        String mainWindowhandle = driver.getWindowHandle();
        System.out.println("mainWindowhandle = " + mainWindowhandle);
        Set<String> windowhandles = driver.getWindowHandles();

        for (String each : windowhandles) {
            driver.switchTo().window(each);

            System.out.println("Current title " + driver.getTitle());
            System.out.println("current window handle" + driver.getWindowHandle());
        }
        // System.out.println(driver.getTitle()+" second window");
        Assert.assertTrue(driver.getTitle().equals("New Window"));
        BrowserUtils.wait(2);
        driver.switchTo().window(mainWindowhandle);
        driver.quit();


    }
    @Test
    public void p6handling_more_windows(){
driver.get("https://amazon.com");
        ( (JavascriptExecutor)driver).executeScript("window.open('http://google.com','_blank');");
        ( (JavascriptExecutor)driver).executeScript("window.open('http://etsy.com','_blank');");
        ( (JavascriptExecutor)driver).executeScript("window.open('http://facebook.com','_blank');");

        Set<String>windowhandles=driver.getWindowHandles();
        for (String each : windowhandles) {
            driver.switchTo().window(each);
            System.out.println(driver.getTitle());
            if(driver.getCurrentUrl().contains("amazon")){
                Assert.assertTrue(driver.getTitle().contains("Amazon"));
                break;
            }

        }





    }
}

