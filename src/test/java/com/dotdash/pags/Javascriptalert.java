package com.dotdash.pags;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Javascriptalert {
	

	public static WebElement jsalert(WebDriver driver)
	{
		
		return (driver.findElement(By.xpath("//ul//li//button")));
	}
	
	public static WebElement jsconfirm(WebDriver driver)
	{
		return (driver.findElement(By.xpath("//ul//li[position()=2]//button")));
	}
	public static WebElement jsprompt(WebDriver driver)
	{
		return (driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")));
	}
	public static WebElement cofirmtext(WebElement driver)
	{
	
	return (driver.findElement(By.xpath(".//p[@id=\"result\"]")));
	}
}
