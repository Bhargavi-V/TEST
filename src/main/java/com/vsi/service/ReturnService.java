package com.vsi.service;

import com.vsi.pages.ReturnPageObjects;
import com.vsi.utility.BrowserUtil;

public class ReturnService {

    ReturnPageObjects returnObj = null;

    public void createReturn(BrowserUtil browser){
        browser.waitFunction(browser.getProperties("loading_icon"));
        returnObj = new ReturnPageObjects(browser);
        String qty = returnObj.getTextByXpath(returnObj.getLineQty_locator()).substring(0,1);
        returnObj.setTextByXpath(returnObj.getReturnQty_locator(),qty);
        returnObj.setTextByXpath(returnObj.getReturnReason_locator(),"Allergic Reaction");
        returnObj.clickBtn(returnObj.getLineQty_locator());
    }

    public void clickNextBtn(){
        returnObj.clickBtn(returnObj.getNextBtn_locator());
    }

    public void clickConfBtn(){
        returnObj.clickBtn(returnObj.getNextBtn2_locator());
    }
}
