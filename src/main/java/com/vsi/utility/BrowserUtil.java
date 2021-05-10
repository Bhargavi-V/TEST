package com.vsi.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class BrowserUtil {

    public WebDriver driver;
    public Properties prop;
    public WebDriverWait wait;

    public BrowserUtil(WebDriver driver, Properties prop) {
        this.driver = driver;
        this.prop = prop;
        wait = new WebDriverWait(this.driver,300);
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    public void openBrowser(String url) {
        driver.get(url);
    }

    public void closeBrowser() {
        WebDriverWait wait = new WebDriverWait(driver, 10000);
        driver.quit();
    }

    public void waitFunction(String loading_locator){

        try{
            WebElement loading_element=driver.findElement(By.xpath(loading_locator));
            wait.until(ExpectedConditions.invisibilityOf(loading_element));
        }
        catch (Exception e){

        }

    }

    public String getProperties(String key) {
        return (String) prop.get(key);
    }

    public WebElement getElementByID(By locator) {
        return driver.findElement(locator);
    }

    public WebElement getElementByName(By locator) {
        return driver.findElement(locator);
    }

    public WebElement getElementByXpath(By locator){
        return driver.findElement(locator);
    }

    //EXTRA-START

    public WebElement findElementByXpath(By locator){
        return driver.findElement(locator);
    }
    public WebElement findElementByID(By locator){
        return driver.findElement(locator);
    }

    //EXTRA-END
}

