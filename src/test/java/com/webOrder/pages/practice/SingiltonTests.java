package com.webOrder.pages.practice;

import com.webOrder.utilities.ConfigurationReader;
import com.webOrder.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingiltonTests {
    @Test
    public void test1(){
       String s1=Singilton.getInstance();
       String s2=Singilton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
    @Test
    public  void test2(){
        WebDriver driver= Driver.getDriver();
        String url= ConfigurationReader.getProperty("url");
        driver.get(url);
        System.out.println(driver.getTitle());
        driver.close();

    }
}
