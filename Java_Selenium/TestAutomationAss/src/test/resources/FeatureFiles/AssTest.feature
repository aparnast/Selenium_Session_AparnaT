Feature: Open URL of Application

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
	
Scenario: Check open window is close or or not 

          Given Close The Open Window
          Then  Show The Message On Console 

