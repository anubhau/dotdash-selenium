package com.dotdash.pags;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframe {
	
	public static WebElement crossbuttoninalert (WebDriver driver)
	{   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		return (driver.findElement(By.xpath(".//button[@class=\"tox-notification__dismiss tox-button tox-button--naked tox-button--icon\"]")));
	}
	
	public static WebElement iframename (WebDriver driver)
	{
		return (driver.findElement(By.id("mce_0_ifr")));
	}

	
	public static WebElement textbox (WebDriver driver)
	{
		return (driver.findElement(By.id("tinymce")));
	}
	
}
