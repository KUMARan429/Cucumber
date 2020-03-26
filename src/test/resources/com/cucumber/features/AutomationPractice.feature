Feature: Sanity functionality checking for AutomationPractice

  Scenario: User Should Visit The loginpage and SignedIn
    Given User Launch the Browser and hit url
    When User Should See the AlreadyRegister text is Present in LoginPage
    And User Should See the Logo In homepage
    Then User Should Enter The "KUMARAN6143@gmail.com" in Emailfield
    And User Should Enter The "KUMARAN" in Passwordfield
    And User Should Check The LoginButton is Clickable
    Then User Should SignIn The Application

  Scenario: User Should See Every Element Is Present IN HomePage
    Given User Should See Logo In HomePage
    When User Should See Contact Number in HomePage
    And User Should See Women Category in HomePage
    And User Should See Dresses Category in HomePage
    And User Should See T-shirt Category in HomePage
    And User Should See Sign-out button in HomePage
    And User Should Check Whether The SearchField Is Enabled
    And User Should Check The SearchIco Button Is Visible
    And User Should See the Cart logo Is Visible
    Then User Should See The Account HolderName In RightCorner Of Homepage

  Scenario Outline:
 User Place Order Using Search Options
    Given User Verify Searchfield Is Enabled and Place An Order By SearchOption
    Then User Should Check Whether The SearchField Is Enabled
    And User Should Pass "<parameter>" in Searchfield and Proceed
    And User Should Check Whether The FirstMenu Is Present
    And User Should See AddToCart Is Present and Whether Is Enable
    And User Moved An Product To Cart
    And User Should See ProceedToCheck Pop-out and Check Whether It Is Enable
    Then User Completed Moving An Product To Cart
    Examples:
    |parameter|
    |Dress|
    |T-Shirt|
    |Shirts|
    |Shoes|
    

  Scenario: User Complete The Flow Of Breadcrumb End-to-End
    Given User Should Verify Shopping Cart Summary Text
    Then User Validate All button Enabled in SummaryPage
    And User Check Proceedbutton is Enabled in AddressPAge
    And User Validate ShippingLogo is Present In shippingPage
    And User Verify TermOfService button Is Enabled in Shopping Page
    And User Verify Proceedbutton Is Enabled In Shopping Page
    And User Should See The BankWire Is Present In PaymentPage
    And User Verify The PayWireButton Is Enabled
    And User Check Order Confirmation is Placed
    Then User Logged Out

  #Scenario: User Should Visit The loginpage and SignedIn
   # Given User Launch the Browser and hit url
   # Then User Should See the AlreadyRegister text is Present in LoginPage
   # And User Should See the Logo In homepage
    #Then User Should Enter The "KUMARAN6143@gmail.com" in Emailfield
    #And User Should Enter The "KUMARAN" in Passwordfield
    #And User Should Check The LoginButton is Clickable
    #Then User Should SignIn The Application

#  Scenario: User Place An OrderBy Quick-view
 #   Given User Validate The Product Displayed Can Be Mouse-Hovered
  #  Then User Check Product is Present in Homepage
   # Then User Verify Whether The Order is in  AddToCart

  #Scenario: User Complete The Flow Of Breadcrumb End-to-End
   # Given User Should Verify Shopping Cart Summary Text
    #Then User Validate All button Enabled in SummaryPage
    #And User Check Proceedbutton is Enabled in AddressPAge
    #And User Validate ShippingLogo is Present In shippingPage
    #And User Verify TermOfService button Is Enabled in Shopping Page
    #And User Verify Proceedbutton Is Enabled In Shopping Page
    #And User Should See The BankWire Is Present In PaymentPage
    #And User Verify The PayWireButton Is Enabled
    #And User Check Order Confirmation is Placed
    #Then User Logged Out

  #Scenario: User Should Visit The loginpage and SignedIn
   # Given User Launch the Browser and hit url
    #When User Should See the AlreadyRegister text is Present in LoginPage
   # And User Should See the Logo In homepage
    #Then User Should Enter The "KUMARAN6143@gmail.com" in Emailfield
    #And User Should Enter The "KUMARAN" in Passwordfield
    #And User Should Check The LoginButton is Clickable
    #Then User Should SignIn The Application

  #Scenario: User Place An OrderBy Click-Method
   # Given User Validate The Category Is In HomePage
    #When User verify Printed Dress Is Present In Selected Category
    #Then User Verify Whether The Order is   AddToCart

  #Scenario: User Complete The Flow Of Breadcrumb End-to-End
   # Given User Should Verify Shopping Cart Summary Text
    #When User Validate All button Enabled in SummaryPage
    #And User Check Proceedbutton is Enabled in AddressPAge
   # And User Validate ShippingLogo is Present In shippingPage
    #And User Verify TermOfService button Is Enabled in Shopping Page
    #And User Verify Proceedbutton Is Enabled In Shopping Page
   # And User Should See The BankWire Is Present In PaymentPage
    #And User Verify The PayWireButton Is Enabled
    #And User Check Order Confirmation is Placed
    #Then User Logged Out
