package com.vsi.main;

import com.vsi.controller.ReturnController;
import com.vsi.utility.LoadProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SeleniumMain {
    public Properties prop;

    SeleniumMain() {
        System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
        prop = LoadProperties.getInstance();
    }

    @BeforeTest
    private void loadProperties() throws FileNotFoundException, IOException {
        System.out.println("Invoked before test");
        FileInputStream orderData = new FileInputStream(".\\Data_Files\\OrderPlacement_data.properties");
        prop.load(orderData);
        FileInputStream orderPlacementLocator = new FileInputStream(".\\Data_Files\\OrderPlacement_locator.properties");
        prop.load(orderPlacementLocator);
    }

    @Test
    public void test() {
        try {
            WebDriver driver = new ChromeDriver();
            ReturnController controller = new ReturnController();
            controller.initiateReturn(prop, driver);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
