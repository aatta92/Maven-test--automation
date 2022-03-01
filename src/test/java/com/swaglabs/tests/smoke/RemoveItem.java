package com.swaglabs.tests.smoke;

import com.swaglabs.base.BaseClass;
import com.swaglabs.pageobjects.CartHomePage;
import com.swaglabs.pageobjects.LoginHomePage;
import com.swaglabs.pageobjects.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveItem extends BaseClass {

    @Test
    public void remove_item() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");
        LoginHomePage loginHomePage = new LoginHomePage();
        loginHomePage.addItem();
        CartHomePage cartHomePage = new CartHomePage();
        cartHomePage.removeItem();
        String text = driver.findElement(By.cssSelector("[class='shopping_cart_link']")).getText();
        Assert.assertTrue(text.equals(""));


    }

}
