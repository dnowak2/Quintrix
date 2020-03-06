@test
Feature: Testing of Date Input

Scenario Outline: verification of access to Google's website
	Given the user inputs valid url "<google>"
	When user clicks Go button
	Then the user is redirected to Google's website

	Examples: 
		| google         | 
		| google.com     |
		| www.google.com |
		