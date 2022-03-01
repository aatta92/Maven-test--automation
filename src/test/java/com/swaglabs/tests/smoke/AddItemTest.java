package com.swaglabs.tests.smoke;

import com.swaglabs.base.BaseClass;
import com.swaglabs.pageobjects.LoginHomePage;
import com.swaglabs.pageobjects.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddItemTest extends BaseClass {

    @Test
    public void add_item() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");
        LoginHomePage loginHomePage = new LoginHomePage();
        loginHomePage.addItem();
        String text =  driver.findElement(By.cssSelector("[class='shopping_cart_badge']")).getText();
        Assert.assertTrue(text.equals("1"));
    }


}
