package com.webOrder.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverB20 {
    private DriverB20(){}
    private static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver==null){
            String browser=ConfegurationReaderB20.getProperties("browser");
            switch (browser){
                case"chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;

            }
        }
        return driver;
    }
    public static void closedriver(){
        if(driver==null){
            driver.quit();
            driver=null;
        }
    }
}
