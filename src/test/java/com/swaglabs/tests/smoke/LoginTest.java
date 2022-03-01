package com.swaglabs.tests.smoke;

import com.swaglabs.base.BaseClass;
import com.swaglabs.pageobjects.LoginPage;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void login_with_valid_account(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");
        String text = driver.findElement(By.cssSelector("[class='title']")).getText();
        Assert.assertTrue(text.contains("PRODUCTS"));
    }






}
