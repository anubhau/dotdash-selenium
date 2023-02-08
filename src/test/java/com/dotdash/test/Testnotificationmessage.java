package com.dotdash.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.dotdash.pags.Notificationmessage;
import com.dotdash.util.DriverUtilities;

public class Testnotificationmessage extends Beforeandaftersuite{
	private DriverUtilities driverutilities;
	
	@Test
	public void Testnotificationmessage()
	
	{
		Beforeandaftersuite.driver.get("http://localhost:7080/notification_message_rendered"); //load the page
		boolean Result=false;
		
		for (int i=0; i < 10; i ++)
		{			
		Notificationmessage.clickhere(driver).click();
		}
		System.out.println(Notificationmessage.errormessage(driver).getText());
		if(Notificationmessage.errormessage(driver).getText().equalsIgnoreCase("Action successful"+"\n"+"×")) {
			Result=true;
			
			
		}
			
		else if(Notificationmessage.errormessage(driver).getText().equalsIgnoreCase("Action unsuccesful, please try again"+"\n"+"×")) {
			
			Result=true;
		
		}
		
		else if(Notificationmessage.errormessage(driver).getText().equalsIgnoreCase("Action unsuccessful"+"\n"+"×"))
		{
	  Result=true;
		
		}
		//Assert.assertEquals("Action unsuccessful, please try again"+"\n"+"×",Notificationmessage.errormessage(driver).getText());
		Assert.assertTrue(Result);
		}

	}
	
	
	



