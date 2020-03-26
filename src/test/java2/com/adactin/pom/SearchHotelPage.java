package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.baseclass.Utility1;


public class SearchHotelPage  extends Utility1{
@FindBy(xpath="//select[@name=\"location\"]")
private WebElement location;
@FindBy(xpath="//td[@class='login_title']")
private WebElement searchText;
public WebElement getSearchText() {
	return searchText;
}
@FindBy(xpath="//select[@name=\"hotels\"]")
private WebElement hotels;
@FindBy(xpath="//select[@name=\"room_type\"]")
private WebElement  roomType;
@FindBy(xpath="//select[@name=\"room_nos\"]")
private WebElement noOfRoom;
@FindBy(xpath="//input[@name=\"datepick_in\"]")
private WebElement checkInDate;
@FindBy(xpath="//input[@name=\"datepick_out\"]")
private WebElement checkOutDate;
@FindBy(xpath="//select[@name=\"adult_room\"]")
private WebElement adultPerRoom;
@FindBy(xpath="//select[@name=\"child_room\"]")
private WebElement childPerRoom;
@FindBy(xpath="//input[@name=\"Submit\"]")
private WebElement searchButton;
@FindBy(xpath="//input[@name=\"Reset\"]")
private WebElement resetButton;
@FindBy(xpath="//a[contains(text(),'Click here to ')]")
private WebElement backLogIn;
public WebElement getBackLogIn() {
	return backLogIn;
}
public WebElement getLogOut() {
	return LogOut;
}
@FindBy(xpath="//a[text()='Logout']")
private WebElement LogOut;
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoomType() {
	return roomType;
}
public WebElement getNoOfRoom() {
	return noOfRoom;
}
public WebElement getCheckInDate() {
	return checkInDate;
}
public WebElement getCheckOutDate() {
	return checkOutDate;
}
public WebElement getAdultPerRoom() {
	return adultPerRoom;
}
public WebElement getChildPerRoom() {
	return childPerRoom;
}
public WebElement getSearchButton() {
	return searchButton;
}
public WebElement getResetButton() {
	return resetButton;
}
public SearchHotelPage() {
PageFactory.initElements(driver, this);
}



}
