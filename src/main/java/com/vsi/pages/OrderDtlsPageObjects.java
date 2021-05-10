package com.vsi.pages;

import com.vsi.utility.BrowserUtil;
import org.openqa.selenium.By;

public class OrderDtlsPageObjects {

    private BrowserUtil browser;
    private By createReturn_link = null;

    public OrderDtlsPageObjects(BrowserUtil browser){
        this.browser = browser;
        createReturn_link = By.xpath(browser.getProperties("createReturn_xpath"));
    }

    public By getCreateReturn_link() {
        return createReturn_link;
    }

    public void clickLink(By locator){
        browser.getElementByXpath(locator).click();
    }
}
