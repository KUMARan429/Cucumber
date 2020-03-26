package com.adactin.testcase;

import org.junit.Assert;

import com.adactin.pom.AdactinHomepage;
import com.adactin.pom.BookaHotelPage;
import com.adactin.pom.BookingConfirmationpage;
import com.adactin.pom.LogoutPage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SearchHotelPage2;
import com.selenium.baseclass.Utility1;

public class AdactinTestCase111 extends Utility1 {
	public static void main(String[] args) throws Throwable {
		browserLaunch("chrome");
		getUrl("https://adactin.com/HotelApp");
		AdactinHomepage ah=new AdactinHomepage();
		SearchHotelPage shp=new SearchHotelPage();
		SearchHotelPage2 shpp=new SearchHotelPage2();
		BookaHotelPage bhp=new BookaHotelPage();
		BookingConfirmationpage bcp=new BookingConfirmationpage();
		LogoutPage lp=new LogoutPage();
		sendInput(ah.getUserTextbox(),"KUMARAN6143");
		sendInput(ah.getPasswordTextbox(), "AF935A");
		clickOnElement(ah.getLogin());
		dropDown(shp.getLocation(), "text", "Sydney");
		dropDown(shp.getHotels(), "value", "Hotel Creek");
		dropDown(shp.getRoomType(), "text", "Standard");
		dropDown(shp.getNoOfRoom(), "text", "2 - Two");
		sendInput(shp.getCheckInDate(), "11/03/2020");
		//String chechin = getAttribute(shp.getCheckInDate(), "value");
		sendInput(shp.getCheckOutDate(), "12/03/2020");
		dropDown(shp.getAdultPerRoom(), "value", "1");
		//String chechout = getAttribute(shp.getCheckInDate(), "value");
		clickOnElement(shp.getSearchButton());
		clickOnElement(shpp.getSelectRad());
		clickOnElement(shpp.getContinueButton());
		String hotelName = getAttribute(bhp.getDisHotelName(), "value");
		String locationName = getAttribute(bhp.getDisLocation(), "value");
		String roomType = getAttribute(bhp.getDisRoomType(), "value");
		String roomNo = getAttribute(bhp.getDisRoomNo(), "value");
		String pricenite = getAttribute(bhp.getDisPriceNight(), "value");
		String totalp = getAttribute(bhp.getDisTotalPrice(), "value");
		String gst = getAttribute(bhp.getDisGst(), "value");
		String finalbill = getAttribute(bhp.getDisFinalPrice(), "value");
		
		sendInput(bhp.getFirstName(), "KUMARAN");
		String firstname =getAttribute(bhp.getFirstName(), "value");
		sendInput(bhp.getLastName(), "RANJITH");
		String lastname =getAttribute(bhp.getLastName(), "value");
		sendInput(bhp.getBillingAddress(), "NO 4,2ND MAIN ROAD");
		String bbadd =getAttribute(bhp.getBillingAddress(), "value");
		sendInput(bhp.getCreditCardNo(), "1234567891234567");
	dropDown(bhp.getCreditCardType(), "text", "American Express");
dropDown(bhp.getCcExpiryMonth(), "index", "1");
dropDown(bhp.getCcExpiryYear(), "value", "2022");
	sendInput(bhp.getCcvNo(), "123");
	clickOnElement(bhp.getBookNowButton());
	Assert.assertEquals(hotelName,getAttribute(bcp.getHotelName(), "value") );
	Assert.assertEquals(locationName,getAttribute(bcp.getLocation(), "value") );
	Assert.assertNotEquals(roomType,getAttribute(bcp.getRoomtype(), "value") );
	Assert.assertEquals(roomNo, getAttribute(bcp.getTotalRooms(),"value"));
	Assert.assertEquals(pricenite, getAttribute(bcp.getPriceNight(), "value"));
	Assert.assertEquals("11/03/2020",getAttribute(bcp.getArrDate(), "value") );
	Assert.assertEquals("12/03/2020",getAttribute(bcp.getDepDate(), "value") );
	Assert.assertEquals(totalp,getAttribute(bcp.getTotalPrice(), "value") );
	Assert.assertEquals(gst,getAttribute(bcp.getGst(), "value") );
	Assert.assertEquals(finalbill,getAttribute(bcp.getFinalPrice(), "value") );
	Assert.assertEquals(firstname,getAttribute(bcp.getFirstName(), "value") );
	Assert.assertEquals(bbadd,getAttribute(bcp.getBillingAddress(), "value") );
	boolean elementisEnabled = elementisEnabled(bcp.getLastName());
	Assert.assertFalse(elementisEnabled);
}
}