package com.dotdash.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dotdash.pags.Rightclickalert;
import com.dotdash.util.DriverUtilities;

import junit.framework.Assert;

public class Testrightclickalert extends Beforeandaftersuite{

	private DriverUtilities driverutilities;
	
	@Test
	public void Testrightclickandalert() 
	{
		
		Beforeandaftersuite.driver.get("http://localhost:7080/context_menu"); //load the page
	Actions action = new Actions(driver);
    
	WebElement link = Rightclickalert.rightclickandlalert(driver);
	action.contextClick(link).perform();
	
	// Accept the alert displayed
	Alert alert=driver.switchTo().alert();
	
	String alertMessage= driver.switchTo().alert().getText();		
	
    // Displaying alert message		
    System.out.println(alertMessage);	
   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
    		
    // Accepting alert		
    alert.accept();
    assertEquals(alertMessage,"You selected a context menu" );
	}
}
