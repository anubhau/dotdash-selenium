package com.dotdash.pags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Floatingmenu {
	public static WebElement lastelement(WebDriver driver)
	{
		return (driver.findElement(By.xpath("//p[10]")));
	}

	public static WebElement aboutbutton(WebDriver driver)
	{
		return (driver.findElement(By.linkText("About")));
	}
	
}
