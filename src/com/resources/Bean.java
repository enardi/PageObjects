package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Bean {

	private static final String browserName = "firefox"; //Values: chrome,ie, firefox //This feature is not yet prepared
	private static final String user = "zeke";
    private static final String password = "123456";
    private static final String baseurl = "http://localhost/seleniumtraining";
    private static final WebDriver driver = null;
    
    public static WebDriver runBrowser(String browserName, String baseUrl, WebDriver driver) {
    			
    		if(browserName.equalsIgnoreCase("chrome")) {
    			driver = new ChromeDriver();
    		}else if(browserName.equalsIgnoreCase("firefox")){
    			driver = new FirefoxDriver();
    		}else if(browserName.equalsIgnoreCase("ie")) {
    			driver = new InternetExplorerDriver();
    		}
    		
    		return driver;
    }
    
    public static String getbrowserName(){
    	   return browserName;
    	}
    
    public static String getUser() {
        return user;
    }

    public static String getPassword() {
        return password;
    }

    public static String getBaseUrl() {
        return baseurl;
    }
    
    public static WebDriver getDriver(){
 	   return driver;
 	}
}
