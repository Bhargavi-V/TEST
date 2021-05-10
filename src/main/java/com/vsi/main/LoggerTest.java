package com.vsi.main;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoggerTest {
    //static string configFilename = "";
    public static final Logger logger = Logger.getLogger(LoggerTest.class.getName());

    @BeforeClass
    public static void getlogger(){
        String projectLocation=System.getProperty("user.dir");
        String configFilename = projectLocation+"/log4j.properties";
        PropertyConfigurator.configure(configFilename);
    }
    @Test
    public void testLogger(){
       // getlogger();
        logger.info("log test");
    }
}
