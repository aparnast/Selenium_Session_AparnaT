Feature: Check Business Flow

@RegressionTest
Scenario: Check given URL is open or not 

          Given Open the browser and launch the application
          When Click on login link
          Then Given Url should be open 

Scenario: User should login with valid  credentials 
	
	      Given User is on login screen 
	      When I enter user name and password
	      And click on ok button 
	      Then I redirect to the home page 
	      
Scenario: Check busienss flow
	
	      Given User is on home page
	      When I click on business partener link
	      And click on close button
	      Then I redirect to the home tab 	
	      
Scenario: ReCheck busienss flow
	
	      Given Again click on business partner link
	      When  Form should be open 
	      And  Enter All the details 
	      Then Click on reset button 	      
	
Scenario: Check open window is close or or not 

          Given Close The Open Window
          Then  Show The Message On Console 

