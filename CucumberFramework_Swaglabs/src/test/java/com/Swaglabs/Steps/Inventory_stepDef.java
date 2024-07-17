package com.Swaglabs.Steps;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.Swaglabs.Pages.InventoryPage;
import com.Swaglabs.Pages.LoginPage;
import com.Swaglabs.Utility.BrowserUtility;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Inventory_stepDef 
{
	private LoginPage lp = new LoginPage(BrowserUtility.getDriver());
	private InventoryPage ip;
	int count;
	
	@Given("User is Logged in Application")
	public void user_is_logged_in_application(DataTable table) 
	{
	    BrowserUtility.getDriver().get("https://www.saucedemo.com/");
	    
	    List<Map<String,String>> map = table.asMaps();
	    String un = map.get(0).get("username");
	    String pwd = map.get(0).get("password");
	    ip = lp.doLogin(un, pwd);
	}

	@Given("User is on Inventory Page")
	public void user_is_on_inventory_page() 
	{
	    System.out.println("System is on: "+ip.getAppUrl());
	}

	@When("User get Product count")
	public void user_get_product_count() 
	{
	    count = ip.getProductCount();
	    System.out.println("Total Count of Product is: "+count);
	}

	@Then("Total product should be match with {int}")
	public void total_product_should_be_match_with(Integer ecount) 
	{
		Assert.assertEquals(count, ecount,"TC is Failed as Product Count is not Matching");
	    System.out.println("TC is Passed as Product count is Matched");
	}

	@When("User get the Product list")
	public void user_get_the_product_list() 
	{
	   ip.getProductDetails();
	}

	@Then("List should be display all products")
	public void list_should_be_display_all_products() 
	{
	    System.out.println("System show product details");
	}

	@When("User add product into cart")
	public void user_add_product_into_cart() 
	{
	    ip.addProductCart("Sauce Labs Fleece Jacket");
	}

	@Then("Product should be added successfully")
	public void product_should_be_added_successfully() 
	{
		ip.getCartPage();
	}
	
}
