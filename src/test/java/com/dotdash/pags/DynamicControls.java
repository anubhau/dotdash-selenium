package com.dotdash.pags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicControls {
	
	public static WebElement removebutton(WebDriver driver)
	{
		return (driver.findElement(By.xpath("//*[contains(text(),\"Remove\")][contains(@type,\"button\")]")));

	}
	
	public static WebElement addbutton(WebDriver driver)
	{
		return(driver.findElement(By.xpath("//*[contains(text(),\"Add\")][contains(@type,\"button\")]")));
	}
	
	public static WebElement checkboxgone (WebDriver driver)
	{
		//*[contains(text(),"It's gone!")][contains(@id,"message")]
		return(driver.findElement(By.xpath("//*[contains(text(),\"It's gone!\")][contains(@id,\"message\")]")));
	}
	
	public static WebElement checkboxvisible(WebDriver driver)
	{
		return (driver.findElement(By.xpath("//*[contains(@id,\"checkbox\")][contains(@type,\"checkbox\")]")));

	}
	
	//Enable
	
	public static WebElement enablebutton(WebDriver driver)
	{
		return (driver.findElement(By.xpath("//*[contains(text(),\"Enable\")][contains(@type,\"button\")]")));

	}
	
	public static WebElement textbox(WebDriver driver)
	{
		return(driver.findElement(By.xpath("//*[contains(@type,\"text\")]")));
	}
	
	public static WebElement disablebutton(WebDriver driver)
	{
		//*[contains(text(),"Disable")][contains(@type,"button")]
		return(driver.findElement(By.xpath("//*[contains(text(),\"Disable\")][contains(@type,\"button\")]")));
	}
}
