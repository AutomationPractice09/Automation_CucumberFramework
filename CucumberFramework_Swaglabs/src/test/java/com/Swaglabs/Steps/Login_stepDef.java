package com.Swaglabs.Steps;

import org.testng.Assert;

import com.Swaglabs.Pages.LoginPage;
import com.Swaglabs.Utility.BrowserUtility;

import io.cucumber.java.en.*;

public class Login_stepDef 
{
	private LoginPage lp = new LoginPage(BrowserUtility.getDriver());
	
	@Given("Swaglab Home is Open")
	public void swaglab_home_is_open() 
	{
	    BrowserUtility.getDriver().get("https://www.saucedemo.com/");
	}

	@When("User get the title of home page")
	public void user_get_the_title_of_home_page() 
	{
	    String actual = lp.getAppTitle();
	    System.out.println(actual);
	}

	@Then("Title should match with {string}")
	public void title_should_match_with(String nm) 
	{
	   Assert.assertTrue(lp.getAppTitle().contains(nm),"Test case is Failed as Title is not Matching");
	   System.out.println("TC is Passed as Title is Matching");
	}

	@When("User enter valid Username and Password")
	public void user_enter_valid_username_and_password() 
	{
	   lp.enterUsername("standard_user");
	   lp.enterPassword("secret_sauce");
	}

	@When("Click on Login button")
	public void click_on_login_button() 
	{
	    lp.clickLogin();
	}

	@Then("User should able to login and nevigated to Inventory page")
	public void user_should_able_to_login_and_nevigated_to_inventory_page() 
	{
	   Assert.assertTrue(lp.getUrl().contains("inventory"),"TC is Failed as Url is not matching");
	   System.out.println("TC is Passed as Url is Matching");
	}
}
