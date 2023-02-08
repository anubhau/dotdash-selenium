package com.dotdash.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.dotdash.pags.Javascriptalert;
import com.dotdash.pags.MouseHover;
import com.dotdash.util.DriverUtilities;

import junit.framework.Assert;

public class Testjavascriptalert extends Beforeandaftersuite{
	private DriverUtilities driverutilities;
	//private static WebDriver driver;
	
	@Test
	public void Testjsalert() 
	{
		Beforeandaftersuite.driver.get("http://localhost:7080/javascript_alerts"); //load the page
		
		Javascriptalert.jsalert(driver).click();
		Alert alert = driver.switchTo().alert();		
		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();
     assertEquals("I am a JS Alert", alertMessage);
        
        driver.switchTo().alert().accept();
        	
	}

	@Test
	public void Testjsconfirm() 
	{
		driver.get("http://localhost:7080/javascript_alerts"); //load the page
		
		Javascriptalert.jsconfirm(driver).click();
		Alert alert = driver.switchTo().alert();		
		
        // Capturing alert message.    
        String alertMessage= alert.getText();
     assertEquals("I am a JS Confirm", alertMessage);
        
       alert.accept();
      	
	}
	@Test
	public void Testjsprompt() 
	{
		driver.get("http://localhost:7080/javascript_alerts"); //load the page
		
		Javascriptalert.jsprompt(driver).click();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		  Alert javascriptAlert = driver.switchTo().alert();
		javascriptAlert.sendKeys("null");
		 // driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		    String valueTextBox = javascriptAlert.getText();  
		    assertEquals("I am a JS prompt",  valueTextBox);
		    javascriptAlert.accept();
		   	
	}

	
}
