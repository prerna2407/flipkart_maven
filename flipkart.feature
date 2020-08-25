Feature: Test Flipkart Login Functionality

Scenario: Unsuccessful Login to Flipkart
Given Flipkart website is loaded
When User enters UserName and password and login
Then Login should not be successful and verify the error message