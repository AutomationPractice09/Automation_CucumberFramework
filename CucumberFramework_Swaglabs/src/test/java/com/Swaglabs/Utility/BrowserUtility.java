package com.Swaglabs.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility 
{
	
	public static WebDriver driver;
	
	static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	
	public static WebDriver setDriver(String bname)
	{
		if(bname.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			tdriver.set(driver);
		}
		else if(bname.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			tdriver.set(driver);
		}
		else if(bname.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			tdriver.set(driver);
		}
		
		return getDriver();
	}
	
	
	public static WebDriver getDriver()
	{
		return tdriver.get();
	}

}
