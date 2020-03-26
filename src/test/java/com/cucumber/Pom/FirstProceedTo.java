package com.cucumber.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.Utility.Utility;



public class FirstProceedTo extends Utility {
	@FindBy(xpath="//span[contains(text(),'Proceed to')]")
	private WebElement proceedToCheckout1;
	@FindBy(xpath="//i[@class=\"icon-chevron-left left\"]")
	private WebElement continueShopping1;
	public WebElement getProceedToCheckout1() {
		return proceedToCheckout1;
	}
	public WebElement getContinueShopping1() {
		return continueShopping1;
	}
public FirstProceedTo() {
PageFactory.initElements(driver, this);
}
}
