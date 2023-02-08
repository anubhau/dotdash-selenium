package com.dotdash.pags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {
	public static WebElement firstcheckbox(WebDriver driver)
	{
		return (driver.findElement(By.xpath("//*[contains(@type,\"checkbox\")][position()=1]")));
	}
	
	public static WebElement secondcheckbox(WebDriver driver)
	{
		return (driver.findElement(By.xpath("//*[contains(@type,\"checkbox\")][position()=2]")));
	}
	
}
