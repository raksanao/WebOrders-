package com.webOrder.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtilitiesB20 {


    /*1.-create a new class called SmartBearUtilities
2.- create static method called loginSmartBear
3.- This method simply logs in to SmartBear when you call it
4.- Accept WebDriver type as parameters*/
    public static void loginToSmartBear(WebDriver driver) {

    }

    /*@param: Method takes WebDriver object and String(name)
     * Method should verify if given name exist in orders
     * This method should simply accepts a name (String) and assert whether given name is in the list or not
     * Create a new TestNJ test to test if the methods is working as expected*/
    public static void verifyOrder(WebDriver driver, String name) {

        List<WebElement> nameList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[2]"));

        for (WebElement each : nameList) {
            if (each.getText().equals(name)) {
                Assert.assertTrue(true);
                return;//it exist the method
                //if we say break it stops

            }


        }

    }



        public static void printNamesAndCities(WebDriver driver ){

            List<WebElement> nameList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[2]"));

List<WebElement>nameCity=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[7]"));

            for (int i = 0; i <nameList.size() ; i++) {
                System.out.println("Name "+i+": "+nameList.get(i).getText()+"City "+(+i+1)+" "+nameList.get(i).getText());


            }










    }
}