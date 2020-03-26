package com.adactin.testcase;

import org.junit.Assert;

import com.adactin.pom.AdactinHomepage;
import com.adactin.pom.BookaHotelPage;
import com.adactin.pom.BookingConfirmationpage;
import com.adactin.pom.LogoutPage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SearchHotelPage2;
import com.selenium.baseclass.Utility1;

public class AdactinTestCase110  extends Utility1{
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
	String total = getAttribute(bhp.getDisTotalDay(), "value");
	String c="";
	 c = c+(total.charAt(0));
//System.out.println(Integer.parseInt(c));
String nite = getAttribute(bhp.getDisPriceNight(), "value");
//System.out.println(nite);
String ss = nite.substring(6);
Integer w = Integer.valueOf(ss);
//System.out.println(w);
String roomNo = getAttribute(bhp.getDisRoomNo(), "value");
String f="";
 f = f+(roomNo.charAt(0));
//System.out.println(Integer.parseInt(f));
 int totalnum=(Integer.parseInt(c)*Integer.parseInt(ss)*Integer.parseInt(f));
String cal = String.valueOf(totalnum);
Assert.assertEquals(cal, "250");

}
}