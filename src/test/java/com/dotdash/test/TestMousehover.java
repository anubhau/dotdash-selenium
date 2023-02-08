package com.dotdash.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.dotdash.pags.MouseHover;
import com.dotdash.util.DriverUtilities;

import junit.framework.Assert;

public class TestMousehover extends Beforeandaftersuite {
	
		private DriverUtilities driverutilities;
		
		//user1
		@Test
		public void Testmousehoverforuser1() 
		{
			Beforeandaftersuite.driver.get("http://localhost:7080/hovers"); //load the page
			Actions action=new Actions(driver);
			action.moveToElement(MouseHover.image1(driver)).perform();
			assertTrue(MouseHover.additionalinformation1(driver).isDisplayed());
		    assertEquals("name: user1", MouseHover.additionalinformation1(driver).getText());

		}
		//user2
		@Test
		public void Testmousehoverforuser2() 
		{
			Beforeandaftersuite.driver.get("http://localhost:7080/hovers"); //load the page
			Actions action=new Actions(driver);
			action.moveToElement(MouseHover.image2(driver)).perform();
			assertTrue(MouseHover.additionalinformation2(driver).isDisplayed());
		    assertEquals("name: user2", MouseHover.additionalinformation2(driver).getText());
		}
		//user3
		@Test
		public void Testmousehoverforuser3() 
		{
			Beforeandaftersuite.driver.get("http://localhost:7080/hovers"); //load the page
			Actions action=new Actions(driver);
			action.moveToElement(MouseHover.image3(driver)).perform();
			assertTrue(MouseHover.additionalinformation3(driver).isDisplayed());
		    assertEquals("name: user3", MouseHover.additionalinformation3(driver).getText());
		}

}
