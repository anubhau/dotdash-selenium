package com.dotdash.pags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Downloadfile {
	public static WebElement downloadlink(WebDriver driver)
	{
		return (driver.findElement(By.xpath("//*[contains(@href,\"download/some-file.txt\")]")));

	}

}
