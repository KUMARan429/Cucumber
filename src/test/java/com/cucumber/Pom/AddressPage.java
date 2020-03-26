package com.cucumber.Pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cucumber.Utility.Utility;



public class AddressPage extends Utility {
	
	@FindBy(xpath="//input[@type=\"checkbox\"]")
	private WebElement thisDelieveryAddress;
	@FindBy(xpath="(//span[contains(text(),'Proceed')])[2]")
	private WebElement proceedTOChech;
	@FindBy(xpath="//a[@title=\"Previous\"]")
	private WebElement continueToPrevious;
	@FindBy(xpath="//span[contains(text(),' Address')]")
	private WebElement addresstext;
	@FindBy(xpath="//ul[@class=\"address item box\"]//li")
	private WebElement yourAddressLocation;
	@FindBy(xpath="//ul[@class=\"address alternate_item box\"]//li")
	private WebElement yourBilAddress;
	public WebElement getYourAddressLocation() {
		return  yourAddressLocation;
	}
	public WebElement getYourBilAddress() {
		return yourBilAddress;
	}
	public WebElement getAddresstext() {
		return addresstext;
	}
	public WebElement getThisDelieveryAddress() {
		return thisDelieveryAddress;
	}
	public WebElement getProceedTOChech() {
		return proceedTOChech;
	}
	public WebElement getContinueToPrevious() {
		return continueToPrevious;
	}
	public AddressPage() {
PageFactory.initElements(driver, this);
	}
}
