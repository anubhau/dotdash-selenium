package com.dotdash.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.dotdash.pags.HomePage;
import com.dotdash.util.DriverUtilities;

import junit.framework.Assert;

public class Testlogin extends Beforeandaftersuite {

	private DriverUtilities driverutilities;
	
	@Test
	public void testLoginSuccess() {
		
		Beforeandaftersuite.driver.get("http://localhost:7080/login"); 
		HomePage.usernamebox(driver).sendKeys("tomsmith");
		HomePage.passwordbox(driver).sendKeys("SuperSecretPassword!");
		HomePage.submitbutton(driver).submit();
	   assertEquals(HomePage.loginsuccess(driver).getText(), "Welcome to the Secure Area. When you are done click logout below.");
	}
	
	@Test
	public void testLoginFailure() {
		
		Beforeandaftersuite.driver.get("http://localhost:7080/login"); 
		HomePage.usernamebox(driver).sendKeys("tomsmith12");
		HomePage.passwordbox(driver).sendKeys("SuperSecretPassword!");
		HomePage.submitbutton(driver).submit();
	   assertEquals(HomePage.loginfailure(driver).getText(), "Your username is invalid!\n×");
	}
}
