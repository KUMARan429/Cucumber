package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.baseclass.Utility1;

public class LogoutPage extends Utility1 {
@FindBy(xpath="//td[contains(text(),'You have successfully logged out. ')]")
private WebElement Logoutt;

public WebElement getLogoutt() {
	return Logoutt;
}
public LogoutPage() {
PageFactory.initElements(driver, this);
}
}
