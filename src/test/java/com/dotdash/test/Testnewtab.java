package com.dotdash.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import com.dotdash.pags.Newtab;
import com.dotdash.util.DriverUtilities;

public class Testnewtab extends Beforeandaftersuite{
	private DriverUtilities driverutilities;

	
	@Test
	public void Testnewtab() 
	{
		Beforeandaftersuite.driver.get("http://localhost:7080/windows"); //load the page
		Newtab.clickhere(driver).click();
	ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs2.get(1));
	Assert.assertEquals("New Window", Newtab.newwindowtext(driver).getText());
	
	
	}

}
