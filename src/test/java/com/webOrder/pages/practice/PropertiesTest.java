package com.webOrder.pages.practice;

import com.webOrder.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PropertiesTest {
    @Test
    public void test(){
      String browser=ConfigurationReader.getProperty("browser");
        System.out.println(browser);
        System.out.println(ConfigurationReader.getProperty("url"));
    }
}
