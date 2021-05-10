package com.vsi.service;

import com.vsi.pages.OrderDtlsPageObjects;
import com.vsi.utility.BrowserUtil;

public class OrderDetailsService {

    public void clickReturnOrder(BrowserUtil browser){
        browser.waitFunction(browser.getProperties("loading_icon"));
        OrderDtlsPageObjects orderDtls = new OrderDtlsPageObjects(browser);
        orderDtls.clickLink(orderDtls.getCreateReturn_link());
    }
}
