package com.swaglabs.pageobjects;

import com.swaglabs.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.swaglabs.base.BaseClass.driver;

public class CartHomePage {
    @FindBy(css = "[name='remove-sauce-labs-backpack']")
    WebElement remove_itemBtn;

    public CartHomePage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

    public void removeItem() {
        remove_itemBtn.click();
    }


}
