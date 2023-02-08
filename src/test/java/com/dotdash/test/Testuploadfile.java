package com.dotdash.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.dotdash.pags.Uploadfile;
import com.dotdash.util.DriverUtilities;

import junit.framework.Assert;

public class Testuploadfile extends Beforeandaftersuite{
	private DriverUtilities driverutilities;
	
	@Test
	public void Testuploadfile() 
	{
		Beforeandaftersuite.driver.get("http://localhost:7080/upload"); //load the page
		Uploadfile.choosefilebutton(driver).sendKeys("C:\\Users\\Anubha\\Downloads\\some-file.txt");
		Uploadfile.uploadbutton(driver).click();
		assertEquals(Uploadfile.fileuploadedtext(driver).getText(), "File Uploaded!");
	}
	
}
