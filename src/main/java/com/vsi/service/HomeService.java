package com.vsi.service;

import com.vsi.pages.HomePageObjects;
import com.vsi.utility.BrowserUtil;

public class HomeService {

    public void searchOrderFunction(BrowserUtil browser) {
        browser.waitFunction(browser.getProperties("loading_icon"));
        HomePageObjects homePage = new HomePageObjects(browser);
        homePage.setTextByXpath(homePage.getOrderNumber_locator(), browser.getProperties("returnOrder"));
        homePage.clickBtn(homePage.getFindOrderBtn_locator());
    }
}
