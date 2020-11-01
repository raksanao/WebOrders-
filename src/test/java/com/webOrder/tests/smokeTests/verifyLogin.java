package com.webOrder.tests.smokeTests;

import com.webOrder.pages.LoginPage;
import com.webOrder.tests.BaseTest;
import com.webOrder.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyLogin extends BaseTest {
    @Test(description = "verify Login test thour page title")
    public void logintes(){
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        String expectedTitel="Web Orders";
        String actual= Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitel,actual,"wrong title");
    }
}
