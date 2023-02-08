package com.dotdash.pags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static WebElement usernamebox(WebDriver driver)
	{
		return (driver.findElement(By.id("username")));
	}
	
	public static WebElement passwordbox(WebDriver driver)
	{
		return(driver.findElement(By.id("password")));
	}
	
	public static WebElement submitbutton(WebDriver driver)
	{
		return(driver.findElement(By.xpath("//*[contains(@type,\"submit\")]")));
	}
	
	public static WebElement loginsuccess(WebDriver driver)
	{
		return(driver.findElement(By.tagName("h4")));
	}
	
	public static WebElement loginfailure(WebDriver driver)
	{
		return(driver.findElement(By.id("flash")));
	}
	
}
