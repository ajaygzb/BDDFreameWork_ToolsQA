Feature: Login Action
Description: This feature will test a LogIn and LogOut functionality



Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigates to Login Page
	And User enters "InValidUsername" and "password"
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
Examples:
    | username   | password |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@153 |
    | ajay.kumar4@rsystems.com | ajay@123 |














Scenario: Successful LogOut
When User LogOut from the Application
Then Message displayed LogOut Successfully




