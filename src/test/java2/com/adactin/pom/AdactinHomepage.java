package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.selenium.baseclass.Utility1;

public class AdactinHomepage extends Utility1 {
	@FindBy(xpath="//img[@class='logo']")
	private WebElement homeLogo;
	@FindBy(xpath="//input[@name='username']")
	private WebElement userTextbox;
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordTextbox;
	@FindBy(id="login")
			private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	public WebElement getHomeLogo() {
		return homeLogo;
	}
	public WebElement getUserTextbox() {
		return userTextbox;
	}
	public WebElement getPasswordTextbox() {
		return passwordTextbox;
	}
	public AdactinHomepage() {
PageFactory.initElements(driver, this);
	}

}
