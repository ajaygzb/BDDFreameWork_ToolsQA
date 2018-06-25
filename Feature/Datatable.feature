Feature: Login Action
Description: This feature will test a LogIn and LogOut functionality

@Two
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigates to Login Page
	And User enters Credentials to LogIn
	| username   | password |
    | testuser_1 | Test@153 |
    | ajay.kumar4@rsystems.com | ajay@123 |
	Then Message displayed Login Successfully









@Two
Scenario: Successful LogOut
When User LogOut from the Application
Then Message displayed LogOut Successfully



















Scenario: Successful LogOut
When User LogOut from the Application
Then Message displayed LogOut Successfully




