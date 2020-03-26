package com.adactin.testcase;

import org.junit.Test;

import com.adactin.pom.AdactinHomepage;
import com.selenium.baseclass.Utility1;

public class AdactinTestCase101 extends Utility1 {
public static void main(String[] args) {
	
	browserLaunch("chrome");
	getUrl("https://adactin.com/HotelApp");
	
	AdactinHomepage ah=new AdactinHomepage();
	sendInput(ah.getUserTextbox(),"KUMARAN6143");
sendInput(ah.getPasswordTextbox(), "AF935A");
clickOnElement(ah.getLogin());

}
}
