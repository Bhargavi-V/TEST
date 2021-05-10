package com.vsi.utility;

import java.util.Properties;

public class LoadProperties {
    private static Properties prop = null;
    private LoadProperties(){
        prop = new Properties();
        System.out.println("Property initiated");
    }
    public static Properties getInstance(){
        if(prop == null)
            new LoadProperties();
        return prop;
    }

}
