package com.cucumber.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.Utility.Utility;



public class DressSelectionPage  extends Utility{
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dresses;
	@FindBy(xpath="(//a[@title='Casual Dresses'])[2]")
	private WebElement casual;
	public WebElement getDresses() {
		return dresses;
	}
	public WebElement getCasual() {
		return casual;
	}
		public DressSelectionPage() {

		PageFactory.initElements(driver, this);}
		
	}

