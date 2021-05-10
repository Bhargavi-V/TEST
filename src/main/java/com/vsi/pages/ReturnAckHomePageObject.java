package com.vsi.pages;

import com.vsi.utility.BrowserUtil;
import org.openqa.selenium.By;

public class ReturnAckHomePageObject {

    private BrowserUtil browser;
    private By returnAckLink_locator = null;


    public ReturnAckHomePageObject(BrowserUtil browser){
        this.browser = browser;
        returnAckLink_locator = By.xpath(browser.getProperties("returnAck_xpath"));

    }

    public By getReturnAckLink_locator() {
        return returnAckLink_locator;
    }


    public void clickLink(By locator) {
        browser.getElementByID(locator).click();
    }

}
