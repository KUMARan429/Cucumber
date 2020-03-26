package com.cucumber.Stepdefinition;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import com.adactin.pom.AdactinHomepage;
import com.adactin.pom.SearchHotelPage;
import com.selenium.baseclass.Utility1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition1 extends Utility1{
	@Given("^User Launch Adactin Hotel Site In Chrome$")
	public void user_Launch_Adactin_Hotel_Site_In_Chrome() throws Throwable {
	    browserLaunch("chrome");
	    getUrl("https://adactin.com/HotelApp/");
	    
	}

	@Then("^User Should Verify Adactin Logo is Present In LoginPage$")
	public void user_Should_Verify_Adactin_Logo_is_Present_In_LoginPage() throws Throwable {
		AdactinHomepage ah=new AdactinHomepage();
		Assert.assertTrue(elementIsDisplayed(ah.getHomeLogo()));
	    
	}

	@Then("^User Verify The UserNameField is Enabled In LoginPage$")
	public void user_Verify_The_UserNameField_is_Enabled_In_LoginPage() throws Throwable {
		AdactinHomepage ah=new AdactinHomepage();
		assertTrue(elementisEnabled(ah.getUserTextbox()));
	    
	}

	@Then("^User Sends \"([^\"]*)\" To UserNameField In LoginPage$")
	public void user_Sends_To_UserNameField_In_LoginPage(String arg1) throws Throwable {
		AdactinHomepage ah=new AdactinHomepage();
		sendInput(ah.getUserTextbox(), arg1);
	    
	}

	@Then("^User Verify The PasswordField Is Enabled In Loginpage$")
	public void user_Verify_The_PasswordField_Is_Enabled_In_Loginpage() throws Throwable {
		AdactinHomepage ah=new AdactinHomepage();
		Assert.assertTrue(elementisEnabled(ah.getPasswordTextbox()));
	    
	}

	@Then("^User Passes \"([^\"]*)\" In PasswordField In LoginPage$")
	public void user_Passes_In_PasswordField_In_LoginPage(String arg1) throws Throwable {
		AdactinHomepage ah=new AdactinHomepage();
	    sendInput(ah.getPasswordTextbox(), arg1);
	}

	@Then("^User Verify The SignIn button Is Enable to Click$")
	public void user_Verify_The_SignIn_button_Is_Enable_to_Click() throws Throwable {
		AdactinHomepage ah=new AdactinHomepage();
		Assert.assertTrue(elementisEnabled(ah.getLogin()));
	    
	}

	@Then("^User Click The SignIn button$")
	public void user_Click_The_SignIn_button() throws Throwable {
		AdactinHomepage ah=new AdactinHomepage();
	    clickOnElement((ah.getLogin()));
	}
	

	@Given("^User Select The Location'<(\\d+),(\\d+)>'S in SearchPage$")
	public void user_Select_The_Location_S_in_SearchPage(int arg1, int arg2) throws Throwable {
	   
		String xcel = Xcel(arg1, arg2);
	    SearchHotelPage shp=new SearchHotelPage();
	    dropDown(shp.getLocation(), "text", xcel);
	}

	@Then("^User Select The Hotel '<(\\d+),(\\d+)>' in SearchPage$")
	public void user_Select_The_Hotel_in_SearchPage(int arg1, int arg2) throws Throwable {
	   
	   
	}

	@Then("^User Select The RoomType '<(\\d+),(\\d+)>' in SearchPage$")
	public void user_Select_The_RoomType_in_SearchPage(int arg1, int arg2) throws Throwable {
	   
	   
	}

	@Then("^User Click On The CheckIn to Select '<(\\d+),(\\d+)>' in SearchPage$")
	public void user_Click_On_The_CheckIn_to_Select_in_SearchPage(int arg1, int arg2) throws Throwable {
	   
	   
	}

	@Then("^User Click On The CheckOut to Select '<(\\d+),(\\d+)>' in SearchPage$")
	public void user_Click_On_The_CheckOut_to_Select_in_SearchPage(int arg1, int arg2) throws Throwable {
	   
	   
	}




	
}