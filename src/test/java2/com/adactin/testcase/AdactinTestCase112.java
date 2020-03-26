package com.adactin.testcase;

import org.junit.Assert;

import com.adactin.pom.AdactinHomepage;
import com.adactin.pom.BookaHotelPage;
import com.adactin.pom.BookingConfirmationpage;
import com.adactin.pom.LogoutPage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SearchHotelPage2;
import com.cucumber.Utility.Utility;

public class AdactinTestCase112 extends Utility{
	public static void main(String[] args) {
		 browserLaunch("chrome");
		getUrl("https://adactin.com/HotelApp");
		AdactinHomepage ah=new AdactinHomepage();
		SearchHotelPage shp=new SearchHotelPage();
		SearchHotelPage2 shpp=new SearchHotelPage2();
		BookaHotelPage bhp=new BookaHotelPage();
		sendInput(ah.getUserTextbox(),"KUMARAN6143");
		sendInput(ah.getPasswordTextbox(), "AF935A");
		clickOnElement(ah.getLogin());
		dropDown(shp.getLocation(), "text", "Sydney");
		dropDown(shp.getHotels(), "value", "Hotel Creek");
		dropDown(shp.getRoomType(), "text", "Standard");
		dropDown(shp.getNoOfRoom(), "text", "2 - Two");
		sendInput(shp.getCheckInDate(), "11/03/2020");
		sendInput(shp.getCheckOutDate(), "12/03/2020");
		dropDown(shp.getAdultPerRoom(), "value", "1");
		clickOnElement(shp.getSearchButton());
		clickOnElement(shpp.getSelectRad());
		clickOnElement(shpp.getContinueButton());
	String gst = getAttribute(bhp.getDisGst(), "value");
	String ss = gst.substring(6);
	Float i1 = Float.valueOf(ss);
	String Total = getAttribute(bhp.getDisTotalPrice(), "value");
	String sw = Total.substring(6);
	Float i2 = Float.valueOf(sw);
Float f=i1+i2;
	String cal = String.valueOf(f);
	Assert.assertEquals(cal, "148.5");

	
}
}