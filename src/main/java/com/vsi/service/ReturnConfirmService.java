package com.vsi.service;

import com.vsi.pages.ReturnConfirmPageObject;
import com.vsi.utility.BrowserUtil;

public class ReturnConfirmService {

    ReturnConfirmPageObject confirmReturn = null;

    public void confirmReturn(BrowserUtil browser){
        browser.waitFunction(browser.getProperties("loading_icon"));
        confirmReturn = new ReturnConfirmPageObject(browser);
        System.out.println("Getting object:"+confirmReturn.getConfirmBtn2_locator());
        confirmReturn.clickBtn(confirmReturn.getConfirmBtn2_locator());
    }

    public String getReturnOrderNumber(BrowserUtil browser){
        return confirmReturn.getTextByXpath(confirmReturn.getReturnLebel_locator());
    }
}
