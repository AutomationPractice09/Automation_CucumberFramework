package com.Swaglabs.Hooks;

import org.openqa.selenium.WebDriver;

import com.Swaglabs.Utility.BrowserUtility;

import io.cucumber.java.Before;

public class AppHooks 
{
	
	public WebDriver driver;
	
	@Before
	public void setBrowser()
	{
		driver = BrowserUtility.setDriver("chrome");
	}
	
}
