package com.cucumber.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cucumber.Utility.Utility;



public class ConfirmationPage extends Utility{
	@FindBy(xpath="//span[contains(text(),'I c')]")
	private WebElement confirmation;
@FindBy(xpath="//div[@class=\"box cheque-box\"]//b")
private WebElement dollar;
	public WebElement getDollar() {
	return dollar;
}
	public WebElement getConfirmation() {
		return confirmation;
	}
public ConfirmationPage() {
PageFactory.initElements(driver, this);
}
}
