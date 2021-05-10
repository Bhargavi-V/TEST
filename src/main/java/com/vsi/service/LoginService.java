package com.vsi.service;

import com.vsi.pages.LoginPageObjects;
import com.vsi.utility.BrowserUtil;

public class LoginService {

    public void loginFunction(BrowserUtil browser,String username,String password) {
        LoginPageObjects loginPage = new LoginPageObjects(browser);
        /*loginPage.setTextById(loginPage.userName_locator, browser.getProperties("username"));
        loginPage.setTextByName(loginPage.password_locator, browser.getProperties("password"));*/
        loginPage.setTextById(loginPage.userName_locator, username);
        loginPage.setTextByName(loginPage.password_locator, password);
        loginPage.clickBtn(loginPage.loginButton_locator);


    }

}
