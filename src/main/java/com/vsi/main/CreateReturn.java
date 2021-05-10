package com.vsi.main;

import com.vsi.controller.ReturnController;
import com.vsi.utility.LoadProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CreateReturn {

    /*
    Loading properties files
    parameters-
        Properties prop
     */
    private void loadProperties(Properties prop) throws FileNotFoundException, IOException {
        FileInputStream orderData = new FileInputStream(".\\Data_Files\\OrderPlacement_data.properties");
        prop.load(orderData);
        FileInputStream orderPlacementLocator = new FileInputStream(".\\Data_Files\\OrderPlacement_locator.properties");
        prop.load(orderPlacementLocator);
    }

    /*
    Running this method to start creating COM return
     */
    @Test
    public void createReturn() {
        try {
            Properties prop = LoadProperties.getInstance();
            loadProperties(prop);
            System.setProperty("webdriver.chrome.driver", "C:\\UI Automation\\Store Order Management\\ChromeDriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            ReturnController controller = new ReturnController(); //Controller to control test
            controller.initiateReturn(prop, driver);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
