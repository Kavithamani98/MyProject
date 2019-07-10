Feature: Data Driven Testing
Scenario: Login using diffrent Credentials
Scenario Outline: Login using below users
When login using <Username> and <Password>
Examples:
|Username|Password|
|user1|pass1|
|user2|pass2| 