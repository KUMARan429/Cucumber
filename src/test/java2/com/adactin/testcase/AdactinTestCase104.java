package com.adactin.testcase;

import org.junit.Assert;

import com.adactin.pom.AdactinHomepage;
import com.adactin.pom.SearchHotelPage2;
import com.adactin.pom.SearchHotelPage;
import com.selenium.baseclass.Utility1;


public class AdactinTestCase104 extends Utility1 {
	public static void main(String[] args) {
		browserLaunch("chrome");
		getUrl("https://adactin.com/HotelApp");
		AdactinHomepage ah=new AdactinHomepage();
		SearchHotelPage shp=new SearchHotelPage();
		SearchHotelPage2 aghp=new SearchHotelPage2();
		sendInput(ah.getUserTextbox(),"KUMARAN6143");
		sendInput(ah.getPasswordTextbox(), "AF935A");
		clickOnElement(ah.getLogin());
		dropDown(shp.getLocation(), "text", "Sydney");
		String locationss = getAttribute(shp.getLocation(), "value");
		dropDown(shp.getHotels(), "value", "Hotel Creek");
		String hotels = getAttribute(shp.getHotels(), "value");
		dropDown(shp.getRoomType(), "text", "Standard");
		dropDown(shp.getNoOfRoom(), "text", "1 - One");
		sendInput(shp.getCheckInDate(), "08/03/2020");
		sendInput(shp.getCheckOutDate(), "09/03/2020");
		dropDown(shp.getAdultPerRoom(), "value", "1");
		
		clickOnElement(shp.getSearchButton());
		String hotelName = getAttribute(aghp.getHotelName(), "value");
		Assert.assertEquals(hotelName, hotels);
		String location = getAttribute(aghp.getLocationAghp(), "value");
Assert.assertEquals(location, locationss);
}
}