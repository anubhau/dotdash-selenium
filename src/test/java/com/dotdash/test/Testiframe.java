package com.dotdash.test;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.dotdash.pags.Iframe;
import com.dotdash.util.DriverUtilities;

public class Testiframe extends Beforeandaftersuite {

	private DriverUtilities driverutilities;
	
	@Test
	public void Testiframe() 
	{
		Beforeandaftersuite.driver.get("http://localhost:7080/iframe"); //load the page
		
		Actions action = new Actions(driver);
		
		action.moveToElement(Iframe.crossbuttoninalert(driver)).click().perform();
		driver.switchTo().frame(Iframe.iframename(driver));
		
		Iframe.textbox(driver).sendKeys("That is iframe for you!");
		Assert.assertEquals(Iframe.textbox(driver).getText(),"That is iframe for you!"+"Your content goes here.");
		
	}
	
}
