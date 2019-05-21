Feature: User login 

Discription: to validate login process with valid and invalid data .

Scenario Outline: User should login with valid  credentials 
	Given I open URl
	When I enter user name as "<uname>" and password "<pass>" 
	And I submit login page 
	Then I redirect to the home page 
	
	Examples: 
		|uname|pass|
		|traymans_u2@mailinator.com|Traymans_u21-trs|
		|traymans_u2@mailinator.com|traymans_u21-trs|
		