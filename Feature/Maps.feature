Feature: Login Action
Description: This feature will test a LogIn and LogOut functionality

@Three
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigates to Login Page
	When User enters multiple Credentials to LogIn
	| Username   | Password |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@153 |
    | testuser_3 | Test@153 |
    | testuser_4 | Test@153 |
    | testuser_5 | Test@153 |
    | testuser_6 | Test@153 |
    | ajay.kumar4@rsystems.com |ajay@123|
	Then Message displayed Login Successfully









@Three
Scenario: Successful LogOut
When User LogOut from the Application
Then Message displayed LogOut Successfully

