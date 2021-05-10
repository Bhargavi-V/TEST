package com.vsi.pages;

import com.vsi.utility.BrowserUtil;
import org.openqa.selenium.By;

public class RetAckOrderDtlsPageObjects {

    private BrowserUtil browser;
    private By retOrder_locator ;
    private By retSearchBtn_locator ;

    private By receivingProduct_locator;
    private By receivableQty_locator;
    private By qtyToReceive_locator;
    private By artDisposition_locator;
    private By retReason_locator;
    private By receiveBtn_locator;


    public RetAckOrderDtlsPageObjects(BrowserUtil browser){
        this.browser = browser;
        retOrder_locator = By.xpath(browser.getProperties("returnOrder_xpath"));
        retSearchBtn_locator = By.xpath(browser.getProperties("returnSearch_xpath"));
        receivingProduct_locator = By.xpath(browser.getProperties("receivingProduct_xpath"));
        receivableQty_locator = By.xpath(browser.getProperties("receivableQty_xpath"));
        qtyToReceive_locator = By.xpath(browser.getProperties("qtyToReceive_xpath"));
        artDisposition_locator = By.xpath(browser.getProperties("artDisposition_xpath"));
        retReason_locator = By.xpath(browser.getProperties("retReason_xpath"));
        receiveBtn_locator = By.xpath(browser.getProperties("receiveBtn_xpath"));

    }

    public By getRetOrder_locator() {
        return retOrder_locator;
    }

    public By getRetSearchBtn_locator() {
        return retSearchBtn_locator;
    }



    public By getReceivingProduct_locator() {

        return receivingProduct_locator;
    }

    public By getReceivableQty_locator() {
        return receivableQty_locator;
    }

    public By getQtyToReceive_locator() {
        return qtyToReceive_locator;
    }

    public By getArtDisposition_locator() {
        return artDisposition_locator;
    }

    public By getRetReason_locator() {
        return retReason_locator;
    }

    public By getReceiveBtn_locator() {
        return receiveBtn_locator;
    }

    public void clickBtn(By locator) {
        browser.getElementByID(locator).click();

    }

    public String getTextByXpath(By locators){
        return browser.getElementByXpath(locators).getText();
    }

    public void setTextByXpath(By locators, String input)
    {
        browser.getElementByXpath(locators).sendKeys(input);
    }

}
