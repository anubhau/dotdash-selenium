package com.dotdash.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.dotdash.pags.Dynamicontent;
import com.dotdash.util.DriverUtilities;

public class TestDynamiccontent extends Beforeandaftersuite {
	
		private DriverUtilities driverutilities;
		//private WebDriver driver;
				
		@Test
		public void Testrefresh() 
		{

			Beforeandaftersuite.driver.get("http://localhost:7080/dynamic_content");
			String old=Dynamicontent.dynamictext1(driver).getText();
			Beforeandaftersuite.driver.navigate().refresh();
			String new1=Dynamicontent.dynamictext1(driver).getText();
			Assert.assertNotEquals(old, new1);
			Beforeandaftersuite.driver.navigate().refresh();
			String new2=Dynamicontent.dynamictext1(driver).getText();
			Assert.assertNotEquals(new1, new2);
			
			
			
			
		}
}
