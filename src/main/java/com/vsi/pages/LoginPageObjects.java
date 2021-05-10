package com.vsi.pages;

import com.vsi.utility.BrowserUtil;
import org.openqa.selenium.By;

public class LoginPageObjects {

    public BrowserUtil browser;
    public By userName_locator = null;
    public By password_locator = null;
    public By loginButton_locator = null;

    public LoginPageObjects(BrowserUtil browser) {
        this.browser = browser;
        //init locators
        userName_locator = By.id(browser.getProperties("username_id"));
        password_locator = By.name(browser.getProperties("password_name"));
        loginButton_locator = By.id(browser.getProperties("loginButton_id"));
    }


    public void setTextById(By locators, String input) {
        browser.getElementByID(locators).sendKeys(input);
    }

    public void setTextByName(By locators, String input) {
        browser.getElementByName(locators).sendKeys(input);
    }

    public void clickBtn(By locator) {
        browser.getElementByID(locator).click();
    }

}
