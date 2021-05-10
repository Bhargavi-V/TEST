package com.vsi.service;

import com.vsi.pages.RetAckOrderDtlsPageObjects;
import com.vsi.utility.BrowserUtil;

public class ReturnAckOrderDetService {

    RetAckOrderDtlsPageObjects retOrderDtls = null;
    public void searchReturnOrder(BrowserUtil browser) throws InterruptedException {
        browser.waitFunction(browser.getProperties("loading_icon"));
        retOrderDtls = new RetAckOrderDtlsPageObjects(browser);
        retOrderDtls.setTextByXpath(retOrderDtls.getRetOrder_locator(), browser.getProperties("returnOrder"));
        retOrderDtls.clickBtn(retOrderDtls.getRetSearchBtn_locator());
    }

    public void performReturnAck(BrowserUtil browser){
        retOrderDtls.clickBtn(retOrderDtls.getReceivingProduct_locator());
        String receivableQty = retOrderDtls.getTextByXpath(retOrderDtls.getReceivableQty_locator());
        retOrderDtls.setTextByXpath(retOrderDtls.getQtyToReceive_locator(),receivableQty);
        retOrderDtls.setTextByXpath(retOrderDtls.getArtDisposition_locator(), browser.getProperties("articleDisposition"));
        retOrderDtls.setTextByXpath(retOrderDtls.getRetReason_locator(), browser.getProperties("retReason"));
        retOrderDtls.clickBtn(retOrderDtls.getReceivingProduct_locator());
        retOrderDtls.clickBtn(retOrderDtls.getReceiveBtn_locator());

    }
}