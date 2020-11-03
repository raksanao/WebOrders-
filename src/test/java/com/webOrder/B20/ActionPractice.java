package com.webOrder.B20;

import com.webOrder.utilities.Driver;
import com.webOrder.utilities.DriverB20;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class ActionPractice {
    @Test
    public void hover_over_test(){
       Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        WebElement img1=Driver.getDriver().findElement(By.xpath("(//div[@class='figure'])[1]"));
        WebElement img2=Driver.getDriver().findElement(By.xpath("(//div[@class='figure'])[2]"));
        WebElement img3=Driver.getDriver().findElement(By.xpath("(//div[@class='figure'])[3]"));


        WebElement user=Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2=Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3=Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(img1).perform();
        Assert.assertTrue(user.isDisplayed(),"image 1 is not displayed");


    }

}
