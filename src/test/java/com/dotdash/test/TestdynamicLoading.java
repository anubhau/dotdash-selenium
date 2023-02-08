package com.dotdash.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dotdash.pags.Dynamicloading;
import com.dotdash.util.DriverUtilities;

public class TestdynamicLoading extends Beforeandaftersuite{

	private DriverUtilities driverutilities;
	
	@Test
	public void Testdynamicloading() 
	{
		Beforeandaftersuite.driver.get("http://localhost:7080/dynamic_loading/2"); //load the page
		Dynamicloading.startbutton(driver).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(".//h4[text()=\"Hello World!\"]"), "Hello World!"));
		assertEquals(Dynamicloading.helloworld(driver).getText(),"Hello World!");
		
	}
	
}
