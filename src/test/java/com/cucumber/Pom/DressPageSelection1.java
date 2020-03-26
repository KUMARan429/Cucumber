package com.cucumber.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.Utility.Utility;


public class DressPageSelection1 extends Utility {
@FindBy(xpath="//img[@title=\"Printed Dress\"]")
private WebElement printedDress;
	@FindBy(xpath="//div[@class=\"product-image-container\"]")
	private WebElement dressess;
	
public WebElement getDressess() {
		return dressess;
	}
public WebElement getPrintedDress() {
	return printedDress;
}
@FindBy(xpath="//span[contains(text(),'Add to')]")
private WebElement addToCartCasual;

@FindBy(xpath="(//button[@type=\"submit\"])[3]")
private WebElement quickView;
public WebElement getQuickView() {
	return quickView;
}
public WebElement getAddToCartCasual() {
	return addToCartCasual;
}
public DressPageSelection1() {
PageFactory.initElements(driver, this);
}
}
