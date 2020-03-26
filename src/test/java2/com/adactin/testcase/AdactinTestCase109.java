package com.adactin.testcase;

import org.junit.Assert;

import com.adactin.pom.AdactinHomepage;
import com.adactin.pom.BookaHotelPage;
import com.adactin.pom.BookingConfirmationpage;
import com.adactin.pom.LogoutPage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SearchHotelPage2;
import com.selenium.baseclass.Utility1;

//KUMARAN//RANJITH//NO 4,2ND MAIN ROAD//1234567891234567//AMERICAN EXPRESS//FEB-2022//123
public class AdactinTestCase109 extends Utility1 {
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
		sendInput(shp.getCheckOutDate(), "12/03/2020");
		dropDown(shp.getAdultPerRoom(), "value", "1");
		clickOnElement(shp.getSearchButton());
		clickOnElement(shpp.getSelectRad());
		clickOnElement(shpp.getContinueButton());
		sendInput(bhp.getFirstName(), "KUMARAN");
		sendInput(bhp.getLastName(), "RANJITH");
		sendInput(bhp.getBillingAddress(), "NO 4,2ND MAIN ROAD");
		sendInput(bhp.getCreditCardNo(), "1234567891234567");
	dropDown(bhp.getCreditCardType(), "text", "American Express");
dropDown(bhp.getCcExpiryMonth(), "index", "1");
dropDown(bhp.getCcExpiryYear(), "value", "2022");
	sendInput(bhp.getCcvNo(), "123");
	clickOnElement(bhp.getBookNowButton());
	Assert.assertEquals("Hotel Creek",getAttribute(bcp.getHotelName(), "value") );
	Assert.assertEquals("Sydney",getAttribute(bcp.getLocation(), "value") );
	//Assert.assertEquals("Standard",getAttribute(bcp.getRoomtype(), "value") );
	Assert.assertEquals("11/03/2020",getAttribute(bcp.getArrDate(), "value") );
	Assert.assertEquals("12/03/2020",getAttribute(bcp.getDepDate(), "value") );
	Assert.assertEquals("Sydney",getAttribute(bcp.getLocation(), "value") );
	Assert.assertEquals("1 Adult(s)", getAttribute(bcp.getAdultRooms(), "value"));
	takeScreenShot("TestCase109-checked");
	clickOnElement(bcp.getLogout());
	String logout = getText(lp.getLogoutt());
	boolean contains = logout.contains("You have successfully logged out");
	Assert.assertTrue("You have successfully logged out.", contains);
	}		
		
}
