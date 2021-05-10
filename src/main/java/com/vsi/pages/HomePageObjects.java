package com.vsi.pages;

import com.vsi.utility.BrowserUtil;
import org.openqa.selenium.By;

public class HomePageObjects {

    private BrowserUtil browser;
    private By orderNumber_locator = null;
    private By findOrderBtn_locator = null;

    public HomePageObjects(BrowserUtil browser){
        this.browser = browser;
        orderNumber_locator = By.xpath(browser.getProperties("orderSearch_xpath"));
        findOrderBtn_locator = By.xpath(browser.getProperties("findOrderBtn_xpath"));
    }
    public By getOrderNumber_locator() {
        return orderNumber_locator;
    }

    public By getFindOrderBtn_locator() {
        return findOrderBtn_locator;
    }

    public void clickBtn(By locator) {
        browser.getElementByID(locator).click();
    }

    public void setTextByXpath(By locators, String input) {
        browser.getElementByXpath(locators).sendKeys(input);
    }


}
