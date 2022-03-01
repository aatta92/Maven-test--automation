package com.swaglabs.pageobjects;

import com.swaglabs.base.BaseClass;
import org.jsoup.Connection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.swaglabs.base.BaseClass.driver;

public class LoginPage {
    @FindBy(css = "#user-name")
    WebElement username_textField;

    @FindBy(css = "#password")
    WebElement password_textFiled;

    @FindBy(css = "#login-button")
    WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(BaseClass.driver,this);
    }


    public void login(String username, String password) {
        username_textField.sendKeys(username);
        password_textFiled.sendKeys(password);
        loginBtn.click();


    }

}
