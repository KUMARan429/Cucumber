package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.baseclass.Utility1;


public class BookingConfirmationpage extends Utility1 {
@FindBy(xpath="//input[@name=\"hotel_name\"]")
private WebElement hotelName;
@FindBy(xpath="//input[@name=\"location\"]")
private WebElement location;
@FindBy(xpath="//input[@name=\"room_type\"]")
private WebElement roomtype;
@FindBy(xpath="//input[@name=\"arrival_date\"]")
private WebElement arrDate;
@FindBy(xpath="//input[@name=\"departure_date\"]")
private WebElement depDate;
@FindBy(xpath="//input[@name=\"total_rooms\"]")
private WebElement totalRooms;
@FindBy(xpath="//input[@name=\"adults_room\"]")
private WebElement adultRooms;
@FindBy(xpath="//input[@name=\"children_room\"]")
private WebElement childRooms;
@FindBy(xpath="//input[@name=\"price_night\"]")
private WebElement priceNight;
@FindBy(xpath="//input[@name=\"total_price\"]")
private WebElement totalPrice;
@FindBy(xpath="//input[@name=\"gst\"]")
private WebElement gst;
@FindBy(xpath="//input[@name=\"final_price\"]")
private WebElement finalPrice;
@FindBy(xpath="//input[@name=\"first_name\"]")
private WebElement firstName;
@FindBy(xpath="//input[@name=\"last_name\"]")
private WebElement lastName;
@FindBy(xpath="//textarea[@name=\"address\"]")
private WebElement billingAddress;
@FindBy(xpath="//input[@name=\"order_no\"]")
private WebElement orderNum;
@FindBy(xpath="(//input[@type=\"button\"])[1]")
private WebElement search;
@FindBy(xpath="(//input[@type=\"button\"])[2]")
private WebElement itenerary;
@FindBy(xpath="//input[@name=\"username_show\"]")
private WebElement UserName;
public WebElement getUserName() {
	return UserName;
}
public WebElement getHotelName() {
	return hotelName;
}
public WebElement getLocation() {
	return location;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getArrDate() {
	return arrDate;
}
public WebElement getDepDate() {
	return depDate;
}
public WebElement getTotalRooms() {
	return totalRooms;
}
public WebElement getAdultRooms() {
	return adultRooms;
}
public WebElement getChildRooms() {
	return childRooms;
}
public WebElement getPriceNight() {
	return priceNight;
}
public WebElement getTotalPrice() {
	return totalPrice;
}
public WebElement getGst() {
	return gst;
}
public WebElement getFinalPrice() {
	return finalPrice;
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
public WebElement getOrderNum() {
	return orderNum;
}
public WebElement getSearch() {
	return search;
}
public WebElement getItenerary() {
	return itenerary;
}
public WebElement getLogout() {
	return logout;
}
@FindBy(xpath="(//input[@type=\"button\"])[3]")
private WebElement logout;
public BookingConfirmationpage() {
PageFactory.initElements(driver, this);
}



}
