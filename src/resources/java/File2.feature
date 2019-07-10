Feature: File2
Background: Browser Launch
Given Browser must be present in the System
When user opens the application in the browser
Then Testme opens in the browser

Scenario: Login Functionality
Given User must be already registered
When user enters the correct credentials
Then User must be in the home page

Scenario: Search Product 
Given User must have a search option 
When search the product with name
Then searched product detail must be displayed in page 