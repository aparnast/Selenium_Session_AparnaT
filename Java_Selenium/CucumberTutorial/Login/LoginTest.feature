Feature: User login 
	user should be login with valid credential

Scenario Outline: User should login with valid  credentials 
	Given I open login page 
	When I enter user name as "<uname>" and password "<pass>" 
	And I submit login page 
	Then I redirect to the home page 
	
	Examples: 
		|uname|pass|
		|traymans_u2@mailinator.com|Traymans_u21-trs|
		|traymans_u2@mailinator.com|traymans_u21-trs|
		
Scenario: User should login with invalid  credentials 
	Given I am on login page  
	When I enter invalid user name as "test" and password "test" 
	And I submit details of  login page 
	Then I redirect to login page