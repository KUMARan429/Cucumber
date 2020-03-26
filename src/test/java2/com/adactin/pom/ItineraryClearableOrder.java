package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.baseclass.Utility1;

public class ItineraryClearableOrder extends Utility1 {
@FindBy(xpath="//input[@name=\"ids[]\"]")
private WebElement radButton; 
@FindBy(xpath="(//input[contains(@name,\"order_id_\")])[2]")
private WebElement orderId;
@FindBy(xpath="//input[contains(@name,\"btn_id_\")]")
private WebElement cancelButton;
@FindBy(xpath="//input[contains(@name,\"hotel_name_\")]")
private WebElement hotelName;
@FindBy(xpath="//input[contains(@name,\"location_\")]")
private WebElement location;
@FindBy(xpath="//input[contains(@name,\"rooms_\")]")
private WebElement rooms;
@FindBy(xpath="//input[contains(@name,\"first_name_\")]")
private WebElement firstName1;
@FindBy(xpath="//input[contains(@name,\"last_name_\")]")
private WebElement lastName1;
@FindBy(xpath="//input[contains(@name,\"arr_date_\")]")
private WebElement arrrDate;
@FindBy(xpath="//input[contains(@name,\"dep_date_\")]")
private WebElement deppDate;
@FindBy(xpath="//input[contains(@name,\"no_days_\")]")
private WebElement noOFDays1;
@FindBy(xpath="//input[contains(@name,\"room_type_\")]")
private WebElement roomType1;
@FindBy(xpath="//input[contains(@name,\"price_night_\")]")
private WebElement pricePerNight;
@FindBy(xpath="//input[contains(@name,\"total_price_\")]")
private WebElement totalPriceGst;
@FindBy(xpath="(//input[@type=\"submit\"])[2]")
private WebElement cancelButton1;
@FindBy(xpath="//input[@name=\"search_hotel\"]")
private WebElement searchHotel;
@FindBy(xpath="//input[@name=\"logout\"]")
private WebElement logOut;
@FindBy(xpath="//input[@name=\"order_id_text\"]")
private WebElement Searchid;
@FindBy(xpath="//input[@name=\"search_hotel_id\"]")
private WebElement go;
@FindBy(xpath="//a[text()='Booked Itinerary']")
private WebElement itiButton;
@FindBy(xpath="//label[@id=\"search_result_error\"]")
private WebElement orderCancel;
@FindBy(xpath="//input[@name=\"check_all\"]")
private WebElement checkall;
public WebElement getCheckall() {
	return checkall;
}
public WebElement getOrderCancel() {
	return orderCancel;
}
public WebElement getItiButton() {
	return itiButton;
}
public WebElement getSearchid() {
	return Searchid;
}
public WebElement getGo() {
	return go;
}
public WebElement getRadButton() {
	return radButton;
}
public WebElement getOrderId() {
	return orderId;
}
public WebElement getCancelButton() {
	return cancelButton;
}
public WebElement getHotelName() {
	return hotelName;
}
public WebElement getLocation() {
	return location;
}
public WebElement getRooms() {
	return rooms;
}
public WebElement getFirstName1() {
	return firstName1;
}
public WebElement getLastName1() {
	return lastName1;
}
public WebElement getArrrDate() {
	return arrrDate;
}
public WebElement getDeppDate() {
	return deppDate;
}
public WebElement getNoOFDays1() {
	return noOFDays1;
}
public WebElement getRoomType1() {
	return roomType1;
}
public WebElement getPricePerNight() {
	return pricePerNight;
}
public WebElement getTotalPriceGst() {
	return totalPriceGst;
}
public WebElement getCancelButton1() {
	return cancelButton1;
}
public WebElement getSearchHotel() {
	return searchHotel;
}
public WebElement getLogOut() {
	return logOut;
}

	public ItineraryClearableOrder() {
PageFactory.initElements(driver, this);
	}
	
}
