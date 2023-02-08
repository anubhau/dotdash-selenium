package com.dotdash.pags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Draganddrop {

	public static WebElement source(WebDriver driver)
	{
		return (driver.findElement(By.id("column-a")));
	}
	
	public static WebElement destination(WebDriver driver)
	{
		return (driver.findElement(By.id("column-b")));
	}
}
