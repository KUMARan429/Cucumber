package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.baseclass.Utility1;

public class SearchHotelPage2 extends Utility1{
@FindBy(xpath="//input[@name=\"radiobutton_0\"]")
private WebElement selectRad;
@FindBy(xpath="//input[@name=\"hotel_name_0\"]")
private WebElement hotelName;
@FindBy(xpath="//input[@name=\"location_0\"]")
private WebElement locationAghp;
@FindBy(xpath="//input[@name=\"rooms_0\"]")
private WebElement roomsAghp;
@FindBy(xpath="//input[@name=\"arr_date_0\"]")
private WebElement arrDate;
@FindBy(xpath="//input[@name=\"dep_date_0\"]")
private WebElement depDate;
@FindBy(xpath="//input[@name=\"no_days_0\"]")
private WebElement noOfDaysAghp;
@FindBy(xpath="//input[@name=\"room_type_0\"]")
private WebElement roomTypeAghp;
@FindBy(xpath="//input[@name=\"price_night_0\"]")
private WebElement pricePerNight;
@FindBy(xpath="//input[@name=\"total_price_0\"]")
private WebElement totalGstPrice;
@FindBy(xpath="//input[@type=\"submit\"]")
private WebElement continueButton;
@FindBy(xpath="//input[@type=\"button\"]")
private WebElement cancelButton;
public WebElement getContinueButton() {
	return continueButton;
}
public WebElement getCancelButton() {
	return cancelButton;
}
public WebElement getSelectRad() {
	return selectRad;
}
public WebElement getHotelName() {
	return hotelName;
}
public WebElement getLocationAghp() {
	return locationAghp;
}
public WebElement getRoomsAghp() {
	return roomsAghp;
}
public WebElement getArrDate() {
	return arrDate;
}
public WebElement getDepDate() {
	return depDate;
}
public WebElement getNoOfDaysAghp() {
	return noOfDaysAghp;
}
public WebElement getRoomTypeAghp() {
	return roomTypeAghp;
}
public WebElement getPricePerNight() {
	return pricePerNight;
}
public WebElement getTotalGstPrice() {
	return totalGstPrice;
}
public SearchHotelPage2() {
PageFactory.initElements(driver, this);
}

}
