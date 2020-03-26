package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.baseclass.Utility1;


public class BookaHotelPage extends Utility1{
@FindBy(xpath="//input[@name=\"hotel_name_dis\"]")
private WebElement disHotelName;
@FindBy(xpath="//input[@name=\"location_dis\"]")
private WebElement disLocation;
@FindBy(xpath="//input[@name=\"room_type_dis\"]")
private WebElement disRoomType;
@FindBy(xpath="//input[@name=\"room_num_dis\"]")
private WebElement disRoomNo;
@FindBy(xpath="//input[@name=\"total_days_dis\"]")
private WebElement disTotalDay;
@FindBy(xpath="//input[@name=\"price_night_dis\"]")
private WebElement disPriceNight;
@FindBy(xpath="//input[@name=\"total_price_dis\"]")
private WebElement disTotalPrice;
@FindBy(xpath="//input[@name=\"gst_dis\"]")
private WebElement disGst;
@FindBy(xpath="//input[@name=\"final_price_dis\"]")
private WebElement disFinalPrice;
@FindBy(xpath="//input[@name=\"first_name\"]")
private WebElement firstName;
@FindBy(xpath="//input[@name=\"last_name\"]")
private WebElement lastName;
@FindBy(xpath="//textarea[@name=\"address\"]")
private WebElement billingAddress;
@FindBy(xpath="//input[@name=\"cc_num\"]")
private WebElement creditCardNo;
@FindBy(xpath="//select[@name=\"cc_type\"]")
private WebElement creditCardType;
@FindBy(xpath="//select[@name=\"cc_exp_month\"]")
private WebElement ccExpiryMonth;
@FindBy(xpath="//select[@name=\"cc_exp_year\"]")
private WebElement ccExpiryYear;
@FindBy(xpath="//input[@name=\"cc_cvv\"]")
private WebElement ccvNo;
public WebElement getDisHotelName() {
	return disHotelName;
}
public WebElement getDisLocation() {
	return disLocation;
}
public WebElement getDisRoomType() {
	return disRoomType;
}
public WebElement getDisRoomNo() {
	return disRoomNo;
}
public WebElement getDisTotalDay() {
	return disTotalDay;
}
public WebElement getDisPriceNight() {
	return disPriceNight;
}
public WebElement getDisTotalPrice() {
	return disTotalPrice;
}
public WebElement getDisGst() {
	return disGst;
}
public WebElement getDisFinalPrice() {
	return disFinalPrice;
}
public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getBillingAddress() {
	return billingAddress;
}
public WebElement getCreditCardNo() {
	return creditCardNo;
}
public WebElement getCreditCardType() {
	return creditCardType;
}
public WebElement getCcExpiryMonth() {
	return ccExpiryMonth;
}
public WebElement getCcExpiryYear() {
	return ccExpiryYear;
}
public WebElement getCcvNo() {
	return ccvNo;
}
public WebElement getBookNowButton() {
	return bookNowButton;
}
public WebElement getCancelButton() {
	return cancelButton;
}
@FindBy(xpath="//input[@name=\"book_now\"]")
private WebElement bookNowButton;
@FindBy(xpath="//input[@name=\"cancel\"]")
private WebElement cancelButton;

public BookaHotelPage() {
PageFactory.initElements(driver, this);
}





}
