package com.cucumber.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.Utility.Utility;


public class Signout extends Utility {
@FindBy(xpath="//a[@title=\"Log me out\"]")
private WebElement signOut;

public WebElement getSignOut() {
	return signOut;
}
public Signout() {
PageFactory.initElements(driver, this);
}
}
