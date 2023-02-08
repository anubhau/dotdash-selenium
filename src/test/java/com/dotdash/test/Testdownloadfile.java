package com.dotdash.test;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.dotdash.pags.Downloadfile;
import com.dotdash.util.DriverUtilities;

import junit.framework.Assert;

public class Testdownloadfile extends Beforeandaftersuite{

	private DriverUtilities driverutilities;
	
	@Test
	public void Testdropdownoption1() 
	{   Beforeandaftersuite.driver.get("http://localhost:7080/download");
		Downloadfile.downloadlink(driver).click();
		File f=new File("C:\\Users\\Anubha\\Downloads");
		assertTrue(f.exists());
	}
	
}
