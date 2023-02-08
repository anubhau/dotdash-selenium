package com.dotdash.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.dotdash.pags.Checkbox;
import com.dotdash.pags.HomePage;


import junit.framework.Assert;

public class TestCheckbox extends Beforeandaftersuite{
	//public DriverUtilities driverutilities;
	
	
	
	@Test
	public void testfirstcheckboxchecked() {
		Beforeandaftersuite.driver.get("http://localhost:7080/checkboxes");
	assertFalse(Checkbox.firstcheckbox(driver).isSelected());
		
	}
	
	@Test
	public void testsecondcheckboxchecked() {	
		Beforeandaftersuite.driver.get("http://localhost:7080/checkboxes");
	assertTrue(Checkbox.secondcheckbox(driver).isSelected());
	
	}
 
}
