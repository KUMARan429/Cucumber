package com.cucumber.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.Utility.Utility;


public class Search extends Utility {
@FindBy(xpath="(//div[@class=\"product-container\"])[1]")
private WebElement firstSearchedMenu;
@FindBy(xpath="(//img[@title=\"Printed Dress\"])[1]")
private WebElement secondSearchedMenu;
@FindBy(xpath="(//img[@title=\"Printed Summer Dress\"])[2]")
private WebElement thirdSearchedMenu;
@FindBy(xpath="(//img[@title=\"Printed Chiffon Dress\"])[2]")
private WebElement fourthSearchedMenu;
@FindBy(xpath="(//span[contains(text(),'Add')])[1]")
private WebElement add1;
@FindBy(xpath="(//span[contains(text(),'Add')])[2]")
private WebElement add2;
@FindBy(xpath="(//span[contains(text(),'Add')])[3]")
private WebElement add3;
@FindBy(xpath="(//span[contains(text(),'Add')])[4]")
private WebElement add4;
public WebElement getPopUp() {
	return popUp;
}


@FindBy(xpath="//span[@class=\"ajax_cart_product_txt \"]")
private WebElement popUp;

public WebElement getAdd1() {
	return add1;
}
public WebElement getAdd2() {
	return add2;
}
public WebElement getAdd3() {
	return add3;
}
public WebElement getAdd4() {
	return add4;
}
public WebElement getFirstSearchedMenu() {
	return firstSearchedMenu;
}
public WebElement getSecondSearchedMenu() {
	return secondSearchedMenu;
}
public WebElement getThirdSearchedMenu() {
	return thirdSearchedMenu;
}
public WebElement getFourthSearchedMenu() {
	return fourthSearchedMenu;
}


public Search() {
PageFactory.initElements(driver, this);
}

}
