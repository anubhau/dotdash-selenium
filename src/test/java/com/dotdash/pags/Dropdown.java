package com.dotdash.pags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown {
	public static WebElement dropdownmain(WebDriver driver)
	{
		return (driver.findElement(By.id("dropdown")));
	}
	
	public static WebElement dropdownoption1(WebDriver driver)
	{
	return(driver.findElement(By.xpath("//*[contains(text(),\"Option 1\")]")));
	}
	
	public static WebElement dropdownoption2(WebDriver driver)
	{
	return(driver.findElement(By.xpath("//*[contains(text(),\"Option 2\")]")));
	}
}
