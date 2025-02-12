package com.Swaglabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage 
{
	private WebDriver driver;
	
	public InventoryPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	private By pcount = By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name ']");
	private By addtocartbt = By.id("add-to-cart");
	private By cart = By.id("shopping_cart_container");
	
	
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	public int getProductCount()
	{
		return driver.findElements(pcount).size();
	}
	
	
	public void getProductDetails()
	{
		System.out.println("Below are lits of Products");
		
		List<WebElement> prod = driver.findElements(pcount);
		
		for(WebElement i : prod)
		{
			System.out.println(i.getText());
		}
	}
	
	
	public void addProductCart(String pname)
	{
		List<WebElement> prod1 = driver.findElements(pcount);
		
		for(WebElement i : prod1)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
		}
		
		driver.findElement(addtocartbt).click();
		System.out.println("Product "+pname+" is added to cart");
	}
	
	
	public void getCartPage()
	{
		driver.findElement(cart).click();
	}

}
