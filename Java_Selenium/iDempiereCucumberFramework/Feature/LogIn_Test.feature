Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password
	Then Message displayed Login Successfully
	
Scenario: Sucessfully open business partner page

    Given select businees partner from favorites
	When The business partner page should be displayed
	
Scenario: Sucessfully close business partner page

    Given Able to view business partner page
	When I click on the close button
	Then The business partner page should be closed
	
Scenario: Reopen business partner page and add details 

    Given select businees partner again from favorites
    When Add all details 
    And  Click on Reset button
    Then All values should be reset sucessfully
    
    
	
