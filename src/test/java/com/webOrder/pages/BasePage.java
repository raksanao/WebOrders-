package com.webOrder.pages;

import com.webOrder.utilities.BrowserUtils;
import com.webOrder.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected WebDriver driver = Driver.getDriver();
    private WebDriverWait wait = new WebDriverWait(driver, 20);

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }

    public void navigateToAllOrders() {
        WebElement allorder = Driver.getDriver().findElement(By.linkText("View all orders"));
        BrowserUtils.wait(3);
        allorder.click();

    }

    public void navigateToAllProduct() {
        WebElement allProduct = Driver.getDriver().findElement(By.linkText("View all products"));
        BrowserUtils.wait(2);
        allProduct.click();

    }
    public void navigateToOrder(){
        WebElement order=Driver.getDriver().findElement(By.linkText("Order"));
        order.click();
BrowserUtils.wait(3);
    }
    public void navigate(String manuitem){
        WebElement manuItem=Driver.getDriver().findElement(By.xpath("//a[text()='"+manuitem+"']"));

        BrowserUtils.wait(6);
    manuItem.click();
    }
    public String getPageSubTitle(){
        WebElement subtitle=Driver.getDriver().findElement(By.tagName("h2"));

BrowserUtils.wait(5);
String subtitleText=subtitle.getText();
return subtitleText;
    }
}