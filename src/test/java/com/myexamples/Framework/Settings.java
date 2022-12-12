package com.myexamples.Framework;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Settings {
    
    private static String url;
    private static int timeout_seconds;
    
    public static void readSettings() {

        Properties settings = new Properties();
        String fileName = "seleniumtraining\\src\\test\\java\\com\\myexamples\\Resource\\settings.properties";
        InputStream is = null;

        try {
            is = new FileInputStream(fileName);
            settings.load(is);
        } catch (Exception ex) {
            throw new RuntimeException("Unable to read properties file: " + fileName);
        }

        url = settings.getProperty("url", "http://jupiter.cloud.planittesting.com");
        timeout_seconds = Integer.parseInt(settings.getProperty("timeout_seconds", "10"));
        Integer.parseInt(settings.getProperty("progress_bar_timer_seconds", "30"));
    } 

    public static String getUrl(){
        return url;
    }

    public static int getTimeout_seconds(){
        return timeout_seconds;
    }
}
