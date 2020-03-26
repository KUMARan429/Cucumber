package com.adactin.testcase;

import org.junit.Assert;

import com.adactin.pom.AdactinHomepage;
import com.adactin.pom.SearchHotelPage2;
import com.selenium.baseclass.Utility1;
import com.adactin.pom.SearchHotelPage;

public class AdactinTestCase105 extends Utility1 {
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
		dropDown(shp.getHotels(), "value", "Hotel Creek");
		dropDown(shp.getRoomType(), "text", "Standard");
		dropDown(shp.getNoOfRoom(), "text", "1 - One");
		sendInput(shp.getCheckInDate(), "08/03/2020");
		String checkin = getAttribute(shp.getCheckInDate(), "value");
		sendInput(shp.getCheckOutDate(), "09/03/2020");
		String checkout = getAttribute(shp.getCheckOutDate(), "value");
		dropDown(shp.getAdultPerRoom(), "value", "1");
		clickOnElement(shp.getSearchButton());
		Assert.assertEquals(checkin, getAttribute(aghp.getArrDate(), "value"));
		Assert.assertEquals(checkout, getAttribute(aghp.getDepDate(), "value"));
}
}
