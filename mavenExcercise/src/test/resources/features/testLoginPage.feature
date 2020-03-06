@test
Feature: Testing of Login Page

Scenario: verification of the login to Expedia.com with valid credential
	Given the user logs inputs valid username and password
	When user clicks Submit button
	Then the user is redirected to flight page

	
Scenario Outline: Verification of login combinations for Expedia.com with valid credential 
	Given the user inputs valid "<username>" and "<password>"
	When user clicks Submit button 
	Then the user is redirected to the flight page 
	
	Examples: 
		|username|password|
		|user| 123|
		|admin| syspass|
		|mike| pass12|