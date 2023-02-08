package com.dotdash.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dotdash.pags.DynamicControls;
import com.dotdash.util.DriverUtilities;

import junit.framework.Assert;

public class TestDynamiccontrols extends Beforeandaftersuite {

	private DriverUtilities driverutilities;
	
	@Test
	public void Testremove() 
	{
		Beforeandaftersuite.driver.get("http://localhost:7080/dynamic_controls"); //load the page
		DynamicControls.removebutton(driver).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),\"Add\")][contains(@type,\"button\")]")));
		assertEquals(DynamicControls.checkboxgone(driver).getText(), "It's gone!");
		DynamicControls.addbutton(driver).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,\"checkbox\")][contains(@type,\"checkbox\")]")));
	     assertTrue(DynamicControls.checkboxvisible(driver).isDisplayed());
		
	}
	
	@Test
	public void Testenabled() 
	{
		Beforeandaftersuite.driver.get("http://localhost:7080/dynamic_controls"); //load the page
		DynamicControls.enablebutton(driver).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),\"It's enabled!\")][contains(@id,\"message\")]")));
		assertTrue(DynamicControls.textbox(driver).isEnabled());
		DynamicControls.disablebutton(driver).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),\"It's disabled!\")][contains(@id,\"message\")]")));
		assertFalse(DynamicControls.textbox(driver).isEnabled());
		
	}
	
	
	
}
