package com.vsi.pages;

import com.vsi.utility.BrowserUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReturnPageObjects {

    private BrowserUtil browser;
    private By lineQty_locator = null;
    private By returnQty_locator = null;
    private By returnReason_locator = null;
    private By nextBtn_locator = null;
    private By nextBtn2_locator = null;

    public ReturnPageObjects(BrowserUtil browser){
        this.browser = browser;
        lineQty_locator = By.xpath(browser.getProperties("lineQty_xpath"));
        returnQty_locator = By.xpath(browser.getProperties("returnQty_xpath"));
        returnReason_locator = By.xpath(browser.getProperties("returnReason_xpath"));
        nextBtn_locator = By.id(browser.getProperties("nextBtn_id"));
        nextBtn2_locator = By.xpath(browser.getProperties("nextBtn2_xpath"));

    }

    public By getLineQty_locator() {
        return lineQty_locator;
    }

    public By getReturnQty_locator() {
        return returnQty_locator;
    }

    public By getReturnReason_locator() {
        return returnReason_locator;
    }

    public By getNextBtn_locator() {
        return nextBtn_locator;
    }

    public By getNextBtn2_locator() {
        return nextBtn2_locator;
    }


    public void setTextByXpath(By locators, String input) {
        WebElement ele = browser.getElementByXpath(locators);
        ele.clear();
        ele.sendKeys(input);
    }

    public String getTextByXpath(By locators){
        return browser.getElementByXpath(locators).getText();
    }

    public void clickBtn(By locator) {
        browser.getElementByXpath(locator).click();
    }
}
