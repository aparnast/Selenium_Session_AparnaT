Feature: Login page of Application 

Scenario: Login with valid credential  

Given Open the Chrome and launch the application			
When Enter the Username and Password			
Then login with the credential

Scenario: Login with invalid credential  

Given Open the Chrome and launch the application			
When Enter the Username as a " " and Password as a " " 		
Then login with the credential

     