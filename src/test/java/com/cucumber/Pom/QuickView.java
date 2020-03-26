package com.cucumber.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.Utility.Utility;

public class QuickView extends Utility {

	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dressss;

	public WebElement getDressss() {
		return dressss;
	}
	@FindBy(xpath="(//img[@title='Printed Dress'])[1]")
	private WebElement Prr;
	@FindBy(xpath="(//span[text()='Add to cart'])[1]")
	private WebElement Carttt;
	public WebElement getCarttt() {
		return Carttt;
	}
	@FindBy(xpath="//span[contains(text(),'Proceed')]")
	private WebElement pro;
	public WebElement getpro() {
		return pro;
	}

	public WebElement getPrr() {
		return Prr;
	}

	public QuickView() {
PageFactory.initElements(driver, this);
	}
}
