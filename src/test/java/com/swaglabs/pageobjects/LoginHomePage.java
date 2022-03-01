package com.swaglabs.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

import static com.swaglabs.base.BaseClass.driver;

public class LoginHomePage {
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addItemBtn;

    @FindBy(css = "[class='shopping_cart_badge']")
    WebElement check_cartLink;

    public LoginHomePage() {
        PageFactory.initElements(driver, this);
    }

    public void addItem() throws InterruptedException {
        addItemBtn.click();
        check_cartLink.click();


    }


}
