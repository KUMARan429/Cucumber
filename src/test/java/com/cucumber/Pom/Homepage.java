package com.cucumber.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.Utility.Utility;


public class Homepage extends Utility{
	@FindBy(xpath="//input[@name=\"search_query\"]")
	private WebElement searchField;
	public WebElement getLogoText() {
		return logoText;
	}
	@FindBy(xpath="//img[@class=\"logo img-responsive\"]")
	private WebElement logoText;
	@FindBy(xpath="//button[@name=\"submit_search\"]")
	private WebElement searchIcon;
	@FindBy(xpath="//a[@title=\"Women\"]")
	private WebElement womenText;
	@FindBy(xpath="(//a[@title=\"Dresses\"])[2]")
	private WebElement dressesText;
	@FindBy(xpath="(//a[@title=\"T-shirts\"])[2]")
	private WebElement tshirtText;
	@FindBy(xpath="//a[@title=\"View my shopping cart\"]")
	private WebElement cart;
	@FindBy(xpath="//img[@alt=\"My Store\"]")
	private WebElement logo;
	@FindBy(xpath="//a[@title=\"Contact Us\"]")
private WebElement contactUs;
	@FindBy(xpath="//a[@title=\"View my customer account\"]")
	private WebElement userName;
	@FindBy(xpath="//a[@title=\"Log me out\"]")
	private WebElement signOut;
	@FindBy(xpath="//span[@class=\"shop-phone\"]")
	private WebElement contactNumber;
	@FindBy(xpath="(//img[@title=\"Faded Short Sleeve T-shirts\"])[1]")
	private WebElement firstMenu;
	@FindBy(xpath="Blouse")
	private WebElement secondMenu;
	@FindBy(xpath="(//img[@title=\"Printed Dress\"])[1]")
	private WebElement thirdMenu;
	@FindBy(xpath="(//img[@title=\"Printed Dress\"])[2]")
	private WebElement fourthMenu;
	@FindBy(xpath="(//img[@title=\"Printed Summer Dress\"])[1]")
	private WebElement fifthMenu;
	@FindBy(xpath="(//img[@title=\"Printed Summer Dress\"])[2]")
	private WebElement sixthMenu;
	public WebElement getSearchField() {
		return searchField;
	}
	public WebElement getSearchIcon() {
		return searchIcon;
	}
	public WebElement getWomenText() {
		return womenText;
	}
	public WebElement getDressesText() {
		return dressesText;
	}
	public WebElement getTshirtText() {
		return tshirtText;
	}
	public WebElement getCart() {
		return cart;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getContactUs() {
		return contactUs;
	}
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getSignOut() {
		return signOut;
	}
	public WebElement getContactNumber() {
		return contactNumber;
	}
	public WebElement getFirstMenu() {
		return firstMenu;
	}
	public WebElement getSecondMenu() {
		return secondMenu;
	}
	public WebElement getThirdMenu() {
		return thirdMenu;
	}
	public WebElement getFourthMenu() {
		return fourthMenu;
	}
	public WebElement getFifthMenu() {
		return fifthMenu;
	}
	public WebElement getSixthMenu() {
		return sixthMenu;
	}
	public Homepage() {
PageFactory.initElements(driver, this);
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
