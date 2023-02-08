package com.dotdash.pags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rightclickalert {

	public static WebElement rightclickandlalert(WebDriver driver)
	{
		return (driver.findElement(By.xpath("//*[contains(@id,\"hot-spot\")]")));
	}
}
