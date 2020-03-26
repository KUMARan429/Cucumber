package com.cucumber.StepDefinition;

import org.junit.Assert;

import com.cucumber.Pom.AddressPage;
import com.cucumber.Pom.ConfirmationPage;
import com.cucumber.Pom.FirstProceedTo;
import com.cucumber.Pom.Homepage;
import com.cucumber.Pom.LoginPage;
import com.cucumber.Pom.PaymentPage;
import com.cucumber.Pom.QuickView;
import com.cucumber.Pom.Search;
import com.cucumber.Pom.ShippingPage;
import com.cucumber.Pom.Signout;
import com.cucumber.Pom.SummaryPage;
import com.cucumber.Utility.Utility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Utility{
	@Given("^User Launch the Browser and hit url$")
	public void user_Launch_the_Browser_and_hit_url() throws Throwable {
	    browserLaunch("chrome");
	    getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	    
	    
	}

	@When("^User Should See the AlreadyRegister text is Present in LoginPage$")
	public void user_Should_See_the_AlreadyRegister_text_is_Present_in_LoginPage_User_Should() throws Throwable {
	    LoginPage lp=new LoginPage();
		boolean adyreg = elementIsDisplayed(lp.getAlreadyregister());
	    Assert.assertTrue(adyreg);
	}

	@When("^User Should See the Logo In homepage$")
	public void user_Should_See_the_Logo_In_LeftCorner_in_homepage() throws Throwable {
		LoginPage lp=new LoginPage();
	    boolean yourlogo = elementIsDisplayed(lp.getYourLogo());
	    Assert.assertTrue(yourlogo);
	}

	
	@Then("^User Should Enter The \"([^\"]*)\" in Emailfield$")
	public void user_Should_Enter_The_in_Emailfield(String arg1) throws Throwable {
		LoginPage lp=new LoginPage();
	    sendInput(lp.getCreatemail(), arg1);
	
	}

	

@Then("^User Should Enter The \"([^\"]*)\" in Passwordfield$")
public void user_Should_Enter_The_in_Passwordfield(String arg1) throws Throwable {
	 LoginPage lp=new LoginPage();
	    sendInput(lp.getPassword(),arg1);
}

	@When("^User Should Check The LoginButton is Clickable$")
	public void user_Should_Check_The_LoginButton_is_Clickable() throws Throwable {
	    LoginPage lp=new LoginPage();
	    boolean button = elementisEnabled(lp.getSign());
	    Assert.assertTrue(button);
	    
	}

	@Then("^User Should SignIn The Application$")
	public void user_Should_Sign_The_Application() throws Throwable {
	    LoginPage lp=new LoginPage();
	    clickOnElement(lp.getSign());
	    
	}

	@Given("^User Should See Logo In HomePage$")
	public void user_Should_See_Logo_In_HomePage() throws Throwable {
		Homepage hp=new Homepage();
		boolean logo = elementIsDisplayed(hp.getLogo());
		Assert.assertTrue(logo);
	}

	@When("^User Should See Contact Number in HomePage$")
	public void user_Should_See_Contact_Number_in_HomePage() throws Throwable {
		Homepage hp=new Homepage();
	    boolean cno = elementIsDisplayed(hp.getContactNumber());
	    Assert.assertTrue(cno);
	}

	@When("^User Should See Women Category in HomePage$")
	public void user_Should_See_Women_Category_in_HomePage() throws Throwable {
		Homepage hp=new Homepage();
		boolean wmn = elementIsDisplayed(hp.getWomenText());
	    Assert.assertTrue(wmn);
	}

	@When("^User Should See Dresses Category in HomePage$")
	public void user_Should_See_Dresses_Category_in_HomePage() throws Throwable {
		Homepage hp=new Homepage();
		boolean ds = elementIsDisplayed(hp.getDressesText());
	    Assert.assertTrue(ds);
	}

	@When("^User Should See T-shirt Category in HomePage$")
	public void user_Should_See_T_shirt_Category_in_HomePage() throws Throwable {
		Homepage hp=new Homepage();
		boolean ds = elementIsDisplayed(hp.getTshirtText());
	    Assert.assertTrue(ds);  
	    
	}

	@When("^User Should See Sign-out button in HomePage$")
	public void user_Should_See_Sign_out_button_in_HomePage() throws Throwable {
		Homepage hp=new Homepage();
		boolean so = elementIsDisplayed(hp.getSignOut());
	    Assert.assertTrue(so);
	
	    
	}

	@When("^User Should Check Whether The SearchField Is Enabled$")
	public void user_Should_Check_Whether_The_SearchField_Is_Enabled() throws Throwable {
		Homepage hp=new Homepage();
		boolean sf = elementisEnabled(hp.getSearchField());
	    Assert.assertTrue(sf);
	}

	@When("^User Should Check The SearchIco Button Is Visible$")
	public void user_Should_Check_The_SearchIco_Button_Is_Visible() throws Throwable {
		Homepage hp=new Homepage();
		boolean ds = elementIsDisplayed(hp.getSearchIcon());
	    Assert.assertTrue(ds);
	    
	}

	@When("^User Should See the Cart logo Is Visible$")
	public void user_Should_See_the_Cart_logo_Is_Visible() throws Throwable {
		Homepage hp=new Homepage();
		boolean gc = elementIsDisplayed(hp.getCart());
	    Assert.assertTrue(gc);
	}
	@Then("^User Should See The Account HolderName In RightCorner Of Homepage$")
	public void user_Should_See_The_Account_HolderName_In_RightCorner_Of_Homepage() throws Throwable {
		Homepage hp=new Homepage();
		boolean gc = elementIsDisplayed(hp.getUserName());
	    Assert.assertTrue(gc);
	}
	@Given("^User Verify Searchfield Is Enabled and Place An Order By SearchOption$")
	public void user_Verify_Searchfield_Is_Enabled_and_Place_An_Order_By_SearchOption() throws Throwable {
		Homepage hp=new Homepage();
		boolean sf = elementisEnabled(hp.getSearchField());
	    Assert.assertTrue(sf);	}
/*	
	@When("^User Should Pass Dress in Searchfield and Proceed$")
	public void user_Should_Pass_Dress_in_Searchfield_and_Proceed() throws Throwable {
		 Homepage hp=new Homepage();
		    sendInput(hp.getSearchField(), "Dress");
		    clickOnElement(hp.getSearchIcon());}*/

@Then("^User Should Pass \"([^\"]*)\" in Searchfield and Proceed$")
public void user_Should_Pass_in_Searchfield_and_Proceed(String arg1) throws Throwable {
	 Homepage hp=new Homepage();
	    sendInput(hp.getSearchField(), arg1);
	    clickOnElement(hp.getSearchIcon());
}


	@When("^User Should Check Whether The FirstMenu Is Present$")
	public void user_Should_Check_Whether_The_FirstMenu_Is_Present() throws Throwable {
	
		Search sc=new Search();
	    boolean fm = elementIsDisplayed(sc.getFirstSearchedMenu());	
	    Assert.assertTrue(fm);}

	@When("^User Should See AddToCart Is Present and Whether Is Enable$")
	public void user_Should_See_AddToCart_Is_Present_and_Whether_Is_Enable() throws Throwable {
	
		Search sc=new Search();
		 moveToElement(sc.getFirstSearchedMenu());
	    boolean ad = elementIsDisplayed(sc.getAdd1());
	    Assert.assertTrue(ad);
	    boolean ea = elementisEnabled(sc.getAdd1());
	    Assert.assertTrue(ea);}

	@When("^User Moved An Product To Cart$")
	public void user_Moved_An_Product_To_Cart() throws Throwable {
	
		Search sc=new Search();
		 clickOnElement(sc.getAdd1());}

	@When("^User Should See ProceedToCheck Pop-out and Check Whether It Is Enable$")
	public void user_Should_See_ProceedToCheck_Pop_out_and_Check_Whether_It_Is_Enable() throws Throwable {
		FirstProceedTo fpt=new FirstProceedTo();
		
		boolean pop = elementisEnabled(fpt.getProceedToCheckout1());
	    Assert.assertTrue(pop);
	    }

	@When("^User Completed Moving An Product To Cart$")
	public void user_Completed_Moving_An_Product_To_Cart() throws Throwable {
	
		FirstProceedTo fpt=new FirstProceedTo();
		clickOnElement(fpt.getProceedToCheckout1());}

	@Given("^User Should Verify Shopping Cart Summary Text$")
	public void user_Should_Verify_Shopping_Cart_Summary_Text() throws Throwable {
		SummaryPage sp=new SummaryPage();
		boolean sl = elementIsDisplayed(sp.getSummaryLogo());
	    Assert.assertTrue(sl);
	    
	}
	
	@When("^User Validate All button Enabled in SummaryPage$")
	public void user_Validate_All_button_Enabled_in_SummaryPage() throws Throwable {
		SummaryPage sp=new SummaryPage();
		boolean mi = elementIsDisplayed(sp.getMinusButton());
	    Assert.assertTrue(mi);
	    boolean pl = elementIsDisplayed(sp.getPlusButton());
	    Assert.assertTrue(pl);
	    
	    boolean ycc = elementIsDisplayed(sp.getYourCartContain());
	    Assert.assertTrue(ycc);
	    boolean ptc = elementIsDisplayed(sp.getProceedToCheckout2());
	    Assert.assertTrue(ptc);
	    clickOnElement(sp.getProceedToCheckout2());
	    
	}

	@Then("^User Check Proceedbutton is Enabled in AddressPAge$")
	public void user_Check_Proceedbutton_is_Enabled_in_AddressPAge() throws Throwable {
	    AddressPage ap=new AddressPage();
		boolean gp = elementisEnabled(ap.getProceedTOChech());
	    Assert.assertTrue(gp);
	    clickOnElement(ap.getProceedTOChech());
	}

	@Then("^User Validate ShippingLogo is Present In shippingPage$")
	public void user_Validate_ShippingLogo_is_Present_In_shippingPage() throws Throwable {
	    ShippingPage sp=new ShippingPage();
	    boolean gsl = elementIsDisplayed(sp.getShippingLogo());
	    Assert.assertTrue(gsl);
	   
	}

	@Then("^User Verify TermOfService button Is Enabled in Shopping Page$")
	public void user_Verify_TermOfService_button_Is_Enabled_in_Shopping_Page() throws Throwable {
		   ShippingPage sp=new ShippingPage();
		boolean ag = elementisEnabled(sp.getAgreeI());
		Assert.assertTrue(ag);
		 clickOnElement(sp.getAgreeI());
		   
	}

	@Then("^User Verify Proceedbutton Is Enabled In Shopping Page$")
	public void user_Verify_Proceedbutton_Is_Enabled_In_Shopping_Page() throws Throwable {
		ShippingPage sp=new ShippingPage();
		boolean gsp = elementIsDisplayed(sp.getShippingProceed());
		Assert.assertTrue(gsp);
	    clickOnElement(sp.getShippingProceed());
	}

	@Then("^User Should See The BankWire Is Present In PaymentPage$")
	public void user_Should_See_The_BankWire_Is_Present_In_PaymentPage() throws Throwable {
		PaymentPage pp=new PaymentPage();
		boolean gbw = elementIsDisplayed(pp.getBankWire());
	    Assert.assertTrue(gbw);
	}

	@Then("^User Verify The PayWireButton Is Enabled$")
	public void user_Verify_The_PayWireButton_Is_Enabled() throws Throwable {
		PaymentPage pp=new PaymentPage();
		boolean gb = elementisEnabled(pp.getBankWire());
		Assert.assertTrue(gb);
		clickOnElement(pp.getBankWire());
	    
	}

	@Then("^User Check Order Confirmation is Placed$")
	public void user_Check_Order_Confirmation_is_Placed() throws Throwable {
		ConfirmationPage cp=new ConfirmationPage();
		clickOnElement(cp.getConfirmation());
		
	}

	@Then("^User Logged Out$")
	public void user_Logged_Out() throws Throwable {
		Signout s=new Signout();
		clickOnElement(s.getSignOut());
	}
	@Given("^User Should Signin SecondTime$")
	public void user_Should_Signin_SecondTime() throws Throwable {
	
	}
	@Given("^User Validate The Product Displayed Can Be Mouse-Hovered$")
	public void user_Validate_The_Product_Displayed_Can_Be_Mouse_Hovered() throws Throwable {
		Homepage hi = new Homepage();
		boolean searchField = hi.getSearchField().isEnabled();
		Assert.assertTrue(searchField);
		boolean searchbutton = hi.getSearchIcon().isEnabled();
		Assert.assertTrue(searchbutton);
	}

	@When("^User Check Product is Present in Homepage$")
	public void user_Check_Product_is_Present_in_Homepage() throws Throwable {
		QuickView qv=new QuickView();
		boolean gdd = elementIsDisplayed(qv.getDressss());
		Assert.assertTrue(gdd);
		moveToElement(qv.getDressss());
		clickOnElement(qv.getDressss());
	}

	@Then("^User Verify Whether The Order is in  AddToCart$")
	public void user_Verify_Whether_The_Order_is_in_AddToCart() throws Throwable {
		QuickView qv=new QuickView();
		
		moveToElement(qv.getPrr());
		Assert.assertTrue(elementIsDisplayed(qv.getCarttt()));
		clickOnElement(qv.getCarttt());
		clickOnElement(qv.getpro());
		
	}
	
	
	@Given("^User Should Signin ThirdTime$")
	public void user_Should_Signin_ThirdTime() throws Throwable {
	}

	@Given("^User Validate The Category Is In HomePage$")
	public void user_Validate_The_Category_Is_In_HomePage() throws Throwable {
		
		Homepage hi = new Homepage();
		boolean searchField = hi.getSearchField().isEnabled();
		Assert.assertTrue(searchField);
		QuickView qv=new QuickView();
		boolean gdd = elementIsDisplayed(qv.getDressss());
		Assert.assertTrue(gdd);
		moveToElement(qv.getDressss());
		clickOnElement(qv.getDressss());
	}

	@When("^User verify Printed Dress Is Present In Selected Category$")
	public void user_verify_Printed_Dress_Is_Present_In_Selected_Category() throws Throwable {
		QuickView qv=new QuickView();
		boolean gdd = elementIsDisplayed(qv.getDressss());
		Assert.assertTrue(gdd);
		moveToElement(qv.getDressss());
		clickOnElement(qv.getDressss());
	
	}

	@Then("^User Verify Whether The Order is   AddToCart$")
	public void user_Verify_Whether_The_Order_is_AddToCart() throws Throwable {
		QuickView qv=new QuickView();
		moveToElement(qv.getPrr());
		Assert.assertTrue(elementIsDisplayed(qv.getCarttt()));
		clickOnElement(qv.getCarttt());
		clickOnElement(qv.getpro());
	}



	
	
	
}