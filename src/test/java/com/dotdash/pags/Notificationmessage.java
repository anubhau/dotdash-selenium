package com.dotdash.pags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Notificationmessage {
	public static WebElement clickhere(WebDriver driver)
	{
		return (driver.findElement(By.linkText("Click here")));
	}

	
	public static WebElement errormessage(WebDriver driver)
	{
		return (driver.findElement(By.xpath("//*[contains(@id,\"flash\")][contains(@class,\"flash notice\")]")));
	}
	
}
