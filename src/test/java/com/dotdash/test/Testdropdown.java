package com.dotdash.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dotdash.pags.Dropdown;
import com.dotdash.util.DriverUtilities;

import junit.framework.Assert;

public class Testdropdown extends Beforeandaftersuite{
	public DriverUtilities driverutilities;
	
	
	@Test
	public void Testdropdownoption1() 
	{
		
		Beforeandaftersuite.driver.get("http://localhost:7080/dropdown");
		Select select=new Select(Dropdown.dropdownmain(driver));
		select.selectByValue("1");
		assertTrue(Dropdown.dropdownoption1(driver).isSelected());
	}
	
	@Test
	public void Testdropdownoption2() 
	{
		Beforeandaftersuite.driver.get("http://localhost:7080/dropdown");
		Select select=new Select(Dropdown.dropdownmain(driver));
		select.selectByValue("2");
		assertTrue(Dropdown.dropdownoption2(driver).isSelected());
	
	}
	

}
