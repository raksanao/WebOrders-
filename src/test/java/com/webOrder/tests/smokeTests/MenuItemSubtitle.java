package com.webOrder.tests.smokeTests;

import com.webOrder.pages.LoginPage;
import com.webOrder.tests.BaseTest;
import com.webOrder.utilities.BrowserUtils;
import com.webOrder.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MenuItemSubtitle extends BaseTest {

    @DataProvider(name="menuData")
    public Object[][]data(){
        return new Object[][]{
            {"View all orders","List of All Orders"},
            {"View all products","List of Products"},
            {"Order","Order"}
        };
    }

@Test(dataProvider = "menuData")
public void manuItemtest(String menuItem,String pageSubtitle){
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        loginPage.navigate(menuItem);
        String expectedTitle=pageSubtitle;
        String actualTitle=loginPage.getPageSubTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Page subtitle is wrong");
}



    @Test(description = "Verify that page subtitle is correct")
    public void test1() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.navigate("View all orders");

        String expectedTitle = "List of All Orders";
        String actualtitle = loginPage.getPageSubTitle();
        Assert.assertEquals(expectedTitle, actualtitle, "wrong title");
    }



    @Test(description = "verify page title for list of products")
        public void test2() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        BrowserUtils.wait(3);
        loginPage.navigate("View all products");//navigateToAllProduct();
        String expectedTitle = "List of Products";
        String actualtitle =loginPage.getPageSubTitle();
        Assert.assertEquals(expectedTitle, actualtitle, "wrong title");
    }


    @Test(description = "verifyle title name Order")
        public void test3(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        BrowserUtils.wait(3);
        loginPage.navigate("Order");
        String expectedTitle = "Order";
       String actualSubtitle= loginPage.getPageSubTitle();

        Assert.assertEquals(expectedTitle, actualSubtitle, "wrong title");


    }
}
