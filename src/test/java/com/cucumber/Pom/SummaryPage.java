package com.cucumber.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.cucumber.Utility.Utility;


public class SummaryPage extends Utility {
	@FindBy(xpath="//td[@class=\"cart_description\"]")
private WebElement descriptionSlot;
	
	@FindBy(xpath="//i[@class=\"icon-minus\"]")
	private WebElement minusButton;
	@FindBy(xpath="//i[@class=\"icon-plus\"]")
	private WebElement plusButton;
	@FindBy(xpath="(//span[contains(text(),'Proceed')])[2]")
private WebElement proceedToCheckout2;
	@FindBy(xpath="(//span[@class=\"address_name\"])[1]")
	private WebElement address1;
	@FindBy(xpath="(//span[@class=\"address_name\"])[2]")
	private WebElement address2;
	@FindBy(xpath="(//span[@class=\"address_address1\"])[1]")
	private WebElement add2;
	@FindBy(xpath="//ul[@class='address first_item item box']/li")
	private WebElement delieveryAddress;
	@FindBy(xpath="//ul[@class=\"address last_item alternate_item box\"]/li")
	private WebElement invoiceAddress;
	@FindBy(xpath="//span[contains(text(),' Summary')]")
	private WebElement summaryLogo;
	@FindBy(xpath="//span[@class=\"heading-counter\"]")
	private WebElement yourCartContain;
	@FindBy(xpath="//span[@id=\"summary_products_quantity\"]")
	private WebElement yourProductNo;
	public WebElement getAddress1() {
		return address1;
	}
	public WebElement getAdd2() {
		return add2;
	}
	public WebElement getYourProductNo() {
		return yourProductNo;
	}
	public WebElement getYourCartContain() {
		return yourCartContain;
	}
	public WebElement getSummaryLogo() {
		return summaryLogo;
	}
	public void setSummaryLogo(WebElement summaryLogo) {
		this.summaryLogo = summaryLogo;
	}
	public WebElement getInvoiceAddress() {
		return invoiceAddress;
	}
	public void setInvoiceAddress(WebElement invoiceAddress) {
		this.invoiceAddress = invoiceAddress;
	}
	public WebElement getDelieveryAddress() {
		return delieveryAddress;
	}
	public void setDelieveryAddress(WebElement delieveryAddress) {
		this.delieveryAddress = delieveryAddress;
	}
	public WebElement getAddress2() {
		return address1;
	}
	public WebElement getDescriptionSlot() {
		return descriptionSlot;
	}
	public WebElement getMinusButton() {
		return minusButton;
	}
	public WebElement getPlusButton() {
		return plusButton;
	}
	public WebElement getProceedToCheckout2() {
		return proceedToCheckout2;
	}	
	public SummaryPage() {
PageFactory.initElements(driver, this);
	}
	
	
	

}
