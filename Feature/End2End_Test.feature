@E2E
Feature: Automated End2End Test
Description: This feature will test End to End



Scenario: Customer place Order by purchasing an item from search
	Given user is on Home Page
	When he search for "dress"
	And choose to buy the first item
	And moves to checkout from mini cart
	And enter personal details on checkout page
	And select same delivery address
	When select payment method as "CheckPayment" payment
	And place the order
	Then verify the order details