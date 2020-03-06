@test
Feature: Testing of the login page

Scenario Outline: Verification of the login to Etsy.com with valid credential
	Given the user inputs valid <username> and <password>
	When user clicks submit button
	Then the user is redirected to homepage

Examples:
	|username                 | password     |
	|dn8overflow444@gmail.com | R1uby2019    |