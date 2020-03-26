package com.cucumber.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.Utility.Utility;


public class PaymentPage extends Utility{
	@FindBy(xpath="//a[@title=\"Pay by bank wire\"]")
	private WebElement bankWire;
	@FindBy(xpath="//a[@title=\"Pay by check.\"]")
	private WebElement check;
	@FindBy(xpath="(//div[@class=\"box\"]//strong)[3]")
	private WebElement accHolder;
	public WebElement getAccHolder() {
		return accHolder;
	}
	public WebElement getBankWire() {
		return bankWire;
	}
	public WebElement getCheck() {
		return check;
	}
	public PaymentPage() {
	PageFactory.initElements(driver, this);
	}
	

}
