package com.vsi.service;

import com.vsi.pages.ReturnAckHomePageObject;
import com.vsi.utility.BrowserUtil;

public class ReturnAckHomeService {

    ReturnAckHomePageObject returnAck = null;

    public void returnAck(BrowserUtil browser){
        returnAck = new ReturnAckHomePageObject(browser);
        browser.waitFunction(browser.getProperties("loading_icon"));
        returnAck.clickLink(returnAck.getReturnAckLink_locator());

    }

}
