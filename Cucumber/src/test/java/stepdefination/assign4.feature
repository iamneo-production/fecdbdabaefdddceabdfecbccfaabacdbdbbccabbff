Feature: New user registration.
Scenario: Verification of successful registration when the inputs are correct. 
Given user on the user registration page
When user enter invalid data on the page. 
| Fields                 || Values            |
| First Name             || Preethi           |
| Last Name              || Sharma            |
| Email Address          || unknown@gmail.com |
| Re-enter Email Address || unknown@gmail.com |
| Password               || PASSWORD          |
|Birthdate               || 23                | 
Then user registration should be successful