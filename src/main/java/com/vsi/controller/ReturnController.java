package com.vsi.controller;

import com.vsi.service.*;
import com.vsi.utility.BrowserUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import yahoofinance.YahooFinance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReturnController {
    public BrowserUtil browser;
    public Properties prop;
   // public FileUtils fileUtils;

    public void initiateReturn(Properties prop, WebDriver driver) throws InterruptedException, FileNotFoundException, IOException {
        browser = new BrowserUtil(driver, prop);
        browser.maximizeBrowser();
        browser.openBrowser(browser.getProperties("qa1_url"));
        LoginService login = new LoginService();
        login.loginFunction(browser,"admin","password");
        Thread.sleep(2000);
        //Home page order search
        HomeService home = new HomeService();
        home.searchOrderFunction(browser);
        Thread.sleep(2000);
        //Click on Creat Return
        OrderDetailsService orderDtls = new OrderDetailsService();
        orderDtls.clickReturnOrder(browser);
        Thread.sleep(2000);
        //Return order details initiation
        ReturnService returnService = new ReturnService();
        returnService.createReturn(browser);
        Thread.sleep(2000);
        returnService.clickNextBtn();
        Thread.sleep(4000);
        returnService.clickConfBtn();
        Thread.sleep(4000);
        ReturnConfirmService confirmReturn = new ReturnConfirmService();
        System.out.println("Calling confirmReturn");
        confirmReturn.confirmReturn(browser);
        Thread.sleep(3000);
        System.out.println("Return order-->"+confirmReturn.getReturnOrderNumber(browser));
        //extra start
        /*Stock stock = YahooFinance.get("INTC");
        File file = new File(RESULT_PATH);
        if (!file.exists()){
            file.createNewFile();
        }

        MyStock myStock = new MyStock();
        myStock.setName(stock.getName());
        myStock.setSymbols(stock.getSymbol());
        myStock.setPrice(stock.getQuote().getPrice().doubleValue());

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
        os.writeObject(myStock);
        os.close();*/
        //extra end
        //Thread.sleep(2000);
       // browser.closeBrowser();
    }
}
