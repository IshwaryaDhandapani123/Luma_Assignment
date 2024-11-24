Feature: LUMA Application Signup Flow
Scenario: Create An Account and Sign In With Valid Credentials
Given I navigate To The LUMA Home Page
When I click On The Create An Account button 
And I fill in First Name as <"carl"> , Last Name as <"stark"> , Email as <"carlstark@gmail.com">,  Password as <"securepwd">, Confirm Password as <"securepwd">
And I clicked Create An Account button
And I should Redirected To The SignIn Page
And I enter Username as <"carlstark@gmail.com"> and Password as <"securepwd">
Then I click The Loginbutton
