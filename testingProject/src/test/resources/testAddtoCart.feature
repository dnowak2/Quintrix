@test
Feature: Test the add to cart feature

Scenario: Verification that an object added to cart is found when user navigates to cart
	Given the user correctly adds a product to cart
	When user navigates to cart
	Then the product is in cart