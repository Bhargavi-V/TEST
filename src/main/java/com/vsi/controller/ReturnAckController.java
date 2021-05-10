package com.vsi.controller;

import com.vsi.service.LoginService;
import com.vsi.service.ReturnAckHomeService;
import com.vsi.service.ReturnAckOrderDetService;
import com.vsi.utility.BrowserUtil;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class ReturnAckController {

    public BrowserUtil browser;

    public void initiateReturnAck(Properties prop, WebDriver driver) throws InterruptedException {
        browser = new BrowserUtil(driver, prop);
        browser.maximizeBrowser();
        browser.openBrowser(browser.getProperties("qa1_url"));
        LoginService login = new LoginService();
        //login.loginFunction(browser,"com9004","password");
        login.loginFunction(browser,browser.getProperties("dc_9004"),browser.getProperties("password"));
        Thread.sleep(5000);
        ReturnAckHomeService ackService = new ReturnAckHomeService();
        ackService.returnAck(browser);
        Thread.sleep(2000);

        //Retunr Ack Order search
        ReturnAckOrderDetService retAckOrderDet = new ReturnAckOrderDetService();
        retAckOrderDet.searchReturnOrder(browser);
        Thread.sleep(2000);
        retAckOrderDet.performReturnAck(browser);
        Thread.sleep(2000);
        browser.closeBrowser();

    }
}
