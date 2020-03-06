@test
Feature: Testing of Date Input

Scenario: verification of the Date to Expedia.com with valid inputs
	Given the user logs inputs valid day, month, and year
	When user clicks Submit button
	Then the user is redirected to flight page

	
Scenario Outline: Verification of login combinations for Expedia.com with valid credential 
	Given the user inputs valid "<departure>" and "<arrival>"
	When user clicks Submit button 
	Then the user is redirected to the flight page 
	
	Examples: 
		|departure | arrival   |
		|02-30-2020| 03-10-2020|