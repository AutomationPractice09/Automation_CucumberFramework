package com.Swaglabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	
	private  WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By username = By.id("user-name");
	private By password = By.id("password");
	private By button = By.id("login-button");
	
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void enterUsername(String un)
	{
		driver.findElement(username).sendKeys(un);
	}

	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		driver.findElement(button).click();
	}
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void doLogin(String un, String pwd)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(button).click();
	}
}
