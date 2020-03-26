package com.cucumber.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.cucumber.Utility.Utility;

public class LoginPage extends Utility{
	@FindBy(xpath="(//input[@data-validate=\"isEmail\"])[2]")
	private WebElement createmail;
	public WebElement getCreatemail() {
		return createmail;
	}
	@FindBy(xpath="(//h3[@class=\"page-subheading\"])[2]")
	private WebElement alreadyregister;
	public WebElement getAlreadyregister() {
		return alreadyregister;
	}
	@FindBy(xpath="//img[@alt=\"My Store\"]")
	private WebElement yourLogo;
	public WebElement getYourLogo() {
		return yourLogo;
	}

	@FindBy(xpath="//input[@data-validate=\"isPasswd\"]")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
@FindBy(xpath="//i[@class=\"icon-lock left\"]")	
private WebElement sign;
	
public WebElement getSign() {
	return sign;
}

public LoginPage() {
PageFactory.initElements(driver, this);}
}
