package com.dotdash.pags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dynamicontent {
	
	public static WebElement dynamictext1(WebDriver driver)
	{
		return (driver.findElement(By.xpath("//*[contains(@class,\"large-10 columns\") and (position()=2)]")));
	}
	
	public static WebElement dynamictext2(WebDriver driver)
	{
		return (driver.findElement(By.xpath("//*[contains(@class,\"large-10 columns\") and (position()=3)]")));
	}
	
	public static WebElement dynamictext3(WebDriver driver)
	{
		return (driver.findElement(By.xpath("//*[contains(@class,\"large-10 columns\") and (position()=3)]")));
	}

}
