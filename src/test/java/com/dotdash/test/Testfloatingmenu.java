package com.dotdash.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.dotdash.pags.Floatingmenu;
import com.dotdash.util.DriverUtilities;

public class Testfloatingmenu extends Beforeandaftersuite{
	private DriverUtilities driverutilities;
	
	@Test
	public void Testnotificationmessage()
	
	{
		Beforeandaftersuite.driver.get("http://localhost:7080/floating_menu"); //load the page
		boolean Result=false;
		//scroll till end of page
	((JavascriptExecutor) driver)
    .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
		WebElement aboutElement = 
				Floatingmenu.aboutbutton(driver);
				int y = aboutElement.getLocation().getY();
				if(y>=0)                      //if coordinate is equal to or greater than 0 then still in viewport
					Result=true;
				Assert.assertTrue(Result);
				driver.quit();
	}
	
	
}
