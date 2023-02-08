package com.dotdash.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtilities {
WebDriver driver;
	private static DriverUtilities driverUtilities;

	private DriverUtilities() { //alt+shif+s+c
		super();
		// TODO Auto-generated constructor stub
	}
	public static DriverUtilities getInstance()
	{
		if(driverUtilities==null)
		{
			driverUtilities=new DriverUtilities();
		}
		return driverUtilities;
	}
	
 public WebDriver getdriver()
 {
	 if(driver==null)
	 {
		 
		getDriver();
 }
 return driver;
 }
 
 private void getDriver()
 {
	 String driverName=getDriverName();
	 switch (driverName)
	 {
	 case "google chrome":
		  
		    
		 System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		 this.driver=new ChromeDriver();
		 break;
		 
	 case "firefox":
		 System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
		 this.driver=new ChromeDriver();
		 break;	 
		 
	 default:
		 System.out.println("browser name is invalid!");
		 break;	 
		 
	 }
 }
private String getDriverName() {
	Properties config=new Properties();
	String driverName="";
	try {
		config.load(new FileInputStream("src/test/resources/config.properties"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
 for(String key:config.stringPropertyNames())
 {
	 if(key.equalsIgnoreCase("browser"))
	 {
		 driverName=config.getProperty(key);
	 }
 }
 return driverName;
}
}
