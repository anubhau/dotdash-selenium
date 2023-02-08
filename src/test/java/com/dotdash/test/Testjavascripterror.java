package com.dotdash.test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.dotdash.util.DriverUtilities;

public class Testjavascripterror extends Beforeandaftersuite {
	private DriverUtilities driverutilities;
	//private WebDriver driver;

	@Test
	public void Testjsalert() 
	{
		Beforeandaftersuite.driver.get("http://localhost:7080/javascript_error"); 
		boolean decision = false;
		LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    for (LogEntry logEntry : logEntries) {
	    	if (logEntry.getMessage().contains(" Cannot read properties of undefined (reading 'xyz')")) {
	    		decision=true;
	    	}
	    	Assert.assertTrue(decision);
	    	
	    }
	}

}
