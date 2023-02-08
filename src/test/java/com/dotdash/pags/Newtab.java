package com.dotdash.pags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Newtab {
	
	public static WebElement clickhere(WebDriver driver)
	{
		return (driver.findElement(By.linkText("Click Here")));
	}
	
	public static WebElement newwindowtext(WebDriver driver)
	{
		return (driver.findElement(By.tagName("h3")));
	}
	
}
