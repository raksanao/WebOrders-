package com.webOrder.tests;

import com.webOrder.pages.LoginPage;
import com.webOrder.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
@Test(description = "Verify login")
    public void login(){

LoginPage login= new LoginPage();
login.login();
    System.out.println(Driver.getDriver().getTitle());
    login.navigateToAllOrders();
    login.navigateToAllProduct();
    login.navigateToOrder();

    String expected="Web Orders";
   String actual= Driver.getDriver().getTitle();
    Assert.assertEquals(expected,actual,"Title do not math");


}
}
