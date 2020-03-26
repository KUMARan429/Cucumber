package com.cucumber.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.Utility.Utility;


public class ShippingPage extends Utility {
	@FindBy(xpath="//input[@type=\"checkbox\"]")
	private WebElement agreeI;
	@FindBy(xpath="(//span[contains(text(),'Proceed')])[2]")
private WebElement shippingProceed;
	@FindBy(xpath="//span[contains(text(),' Shipping')]")
	private WebElement shippingLogo;
	public WebElement getShippingLogo() {
		return shippingLogo;
	}
	public WebElement getAgreeI() {
		return agreeI;
	}
	public WebElement getShippingProceed() {
		return shippingProceed;
	}
	
public ShippingPage() {
PageFactory.initElements(driver, this);
}	
	
	
	
	
}



