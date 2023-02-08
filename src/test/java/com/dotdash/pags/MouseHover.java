package com.dotdash.pags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseHover {

	public static WebElement image1(WebDriver driver)
	{
		return (driver.findElement(By.xpath("(.//img[@src=\"/img/avatar-blank.jpg\"])[position()=1]")));
	}
	
	public static WebElement additionalinformation1(WebDriver driver)
	{
		return (driver.findElement(By.xpath("(.//h5)[position()=1]")));
	}
	
	public static WebElement image2(WebDriver driver)
	{
		return (driver.findElement(By.xpath("(.//img[@src=\"/img/avatar-blank.jpg\"])[position()=2]")));
	}
	
	public static WebElement additionalinformation2(WebDriver driver)
	{
		return (driver.findElement(By.xpath("(.//h5)[position()=2]")));
	}
	
	public static WebElement image3(WebDriver driver)
	{
		return (driver.findElement(By.xpath("(.//img[@src=\"/img/avatar-blank.jpg\"])[position()=3]")));
	}
	public static WebElement additionalinformation3(WebDriver driver)
	{
		return (driver.findElement(By.xpath("(.//h5)[position()=3]")));
	}
}
