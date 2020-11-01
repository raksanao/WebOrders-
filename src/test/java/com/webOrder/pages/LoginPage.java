package com.webOrder.pages;

import com.webOrder.utilities.ConfigurationReader;
import com.webOrder.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id="ctl00_MainContent_username")
   private WebElement username;

    @FindBy(id = "ctl00_MainContent_password")
    private WebElement password;

    @FindBy(css = "[type='submit']")
    private WebElement login;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
        //now our find bys know where to look at to find this element
    }

    public void login(){
        String userNameValue= ConfigurationReader.getProperty("username");
        String passwordValue=ConfigurationReader.getProperty("password");
       username.sendKeys(userNameValue);
       password.sendKeys(passwordValue);
       login.click();
    }
    public void login(String usernameValue,String passwordValue){
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);

    }
}
