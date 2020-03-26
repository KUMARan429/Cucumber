package com.adactin.testcase;

import com.adactin.pom.AdactinHomepage;
import com.adactin.pom.SearchHotelPage;
import com.selenium.baseclass.Utility1;
////a[text()='Logout']
public class AdactinTestCase103 extends Utility1 {
	public static void main(String[] args) {
		browserLaunch("chrome");
		getUrl("https://adactin.com/HotelApp");
		AdactinHomepage ah=new AdactinHomepage();
		SearchHotelPage shp=new SearchHotelPage();
		sendInput(ah.getUserTextbox(),"KUMARAN6143");
		sendInput(ah.getPasswordTextbox(), "AF935A");
		clickOnElement(ah.getLogin());
		dropDown(shp.getLocation(), "text", "Sydney");
		dropDown(shp.getHotels(), "value", "Hotel Creek");
		dropDown(shp.getRoomType(), "text", "Standard");
		dropDown(shp.getNoOfRoom(), "text", "1 - One");
		sendInput(shp.getCheckInDate(), "05/03/2020");
		sendInput(shp.getCheckOutDate(), "03/03/2020");
		clickOnElement(shp.getSearchButton());
}
}