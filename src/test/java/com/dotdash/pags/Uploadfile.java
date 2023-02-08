package com.dotdash.pags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Uploadfile {
	
	public static WebElement choosefilebutton (WebDriver driver)
	{
		return (driver.findElement(By.id("file-upload")));
	}
	
	public static WebElement uploadbutton (WebDriver driver)
	{
		return (driver.findElement(By.id("file-submit")));
	}
	
	public static WebElement fileuploadedtext (WebDriver driver)
	{
		return (driver.findElement(By.tagName("h3")));
	}
}
