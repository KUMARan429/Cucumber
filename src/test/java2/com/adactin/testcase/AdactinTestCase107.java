package com.adactin.testcase;

import org.junit.Assert;

import com.adactin.pom.AdactinHomepage;
import com.adactin.pom.SearchHotelPage2;
import com.adactin.pom.SearchHotelPage;
import com.selenium.baseclass.Utility1;

public class AdactinTestCase107 extends Utility1 {
	public static void main(String[] args) {
		browserLaunch("chrome");
		getUrl("https://adactin.com/HotelApp");
		AdactinHomepage ah=new AdactinHomepage();
		SearchHotelPage shp=new SearchHotelPage();
		SearchHotelPage2 shpp=new SearchHotelPage2();
		sendInput(ah.getUserTextbox(),"KUMARAN6143");
		sendInput(ah.getPasswordTextbox(), "AF935A");
		clickOnElement(ah.getLogin());
		dropDown(shp.getLocation(), "text", "Sydney");
		dropDown(shp.getHotels(), "value", "Hotel Creek");
		dropDown(shp.getRoomType(), "text", "Standard");
		dropDown(shp.getNoOfRoom(), "text", "1 - One");
		String roomType = getAttribute(shp.getRoomType(), "value");
		sendInput(shp.getCheckInDate(), "09/03/2020");
		sendInput(shp.getCheckOutDate(), "10/03/2020");
		dropDown(shp.getAdultPerRoom(), "value", "1");
		clickOnElement(shp.getSearchButton());
		boolean condition = getAttribute(shpp.getRoomTypeAghp(), "value").contains("Standard");
		Assert.assertTrue(roomType, condition);
	
	
	}
}
