package com.dotdash.pags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dynamicloading {
	
	public static WebElement startbutton(WebDriver driver)
	{
		return (driver.findElement(By.xpath("//*[contains(text(),\"Start\")]")));

	}
	
	public static WebElement helloworld(WebDriver driver)
	{
		return(driver.findElement(By.xpath("//h4[starts-with(text(),\"Hello\")]")));
	}
}
