package com.vsi.pages;

import com.vsi.utility.BrowserUtil;
import org.openqa.selenium.By;

public class ReturnConfirmPageObject {

    private BrowserUtil browser;
    private By confirmBtn2_locator = null;
    private By returnLebel_locator = null;

    public ReturnConfirmPageObject(BrowserUtil browser){
        this.browser = browser;
        confirmBtn2_locator = By.xpath(browser.getProperties("confirmBtn2_xpath"));
        returnLebel_locator = By.xpath(browser.getProperties("returnLebel_xpath"));
    }

    public By getReturnLebel_locator() {
        return returnLebel_locator;
    }

    public By getConfirmBtn2_locator() {
        return confirmBtn2_locator;
    }

    public void clickBtn(By locator) {
        System.out.println("Locator in return confirm page:"+locator);
        browser.getElementByXpath(locator).click();
    }

    public String getTextByXpath(By locators){
        return browser.getElementByXpath(locators).getText();
    }
}
