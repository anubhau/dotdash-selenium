package com.dotdash.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.dotdash.util.DriverUtilities;

public class Beforeandaftersuite {
	
	//public DriverUtilities driverutilities;
	public static WebDriver driver;
	
	@Before
	public void setup() {
//		driverutilities=DriverUtilities.getInstance();
//		driver=driverutilities.getdriver();
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
	}
	
	
	@After
	public void closeup() 
	{
		driver.quit();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
}
