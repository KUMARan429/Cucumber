Feature: SmokeTesting for Adactin Hotel Functionality 

Scenario: User Checking Signin functionality
Given User Launch Adactin Hotel Site In Chrome
Then User Should Verify Adactin Logo is Present In LoginPage
And User Verify The UserNameField is Enabled In LoginPage
And User Sends "KUMARAN6143" To UserNameField In LoginPage
And User Verify The PasswordField Is Enabled In Loginpage
And User Passes "AF935A" In PasswordField In LoginPage
When  User Verify The SignIn button Is Enable to Click
Then User Click The SignIn button 
 
 Scenario: User Checking Functionality of Hotel Booking In SearchPage 
Given: User Checks SearchHOTEL Text Is Present In SearchPage
And: User Verify The LocationField Is Enabled in SearchPage
And User Select The Location'<2,1>'S in SearchPage
Then User Verify The HotelField Is Enabled in SearchPage
And User Select The Hotel '<3,1>' in SearchPage
Then User Verify The RoomType Is Enabled in SearchPage
And User Select The RoomType '<4,1>' in SearchPage
Then User Verify The NoOfRoom Is Enabled in SearchPage
And User Select The RoomType '<5,1>' in SearchPage
Then User Verify The CheckIn Is Enabled in SearchPage
And User Click On The CheckIn to Select '<6,1>' in SearchPage
And User Verify The CheckOut Is Enabled in SearchPage
And User Click On The CheckOut to Select '<7,1>' in SearchPage
Then User Click On Search in SearchPage