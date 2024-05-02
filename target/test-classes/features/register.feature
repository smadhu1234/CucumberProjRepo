@all
Feature: User Registration
User should be able to get the registration with giving valid credentials

Background:
Given User navigates to the registration page

# using Datatables
@div
Scenario: Register with mandatory fields
When User uses below data
|firstname			|Arun|
|lastname				|Motoori|
|email					|arun.motoori@gmail.com|
|phonenumber		|1234567890|
|password				|12345|
# When User enters firstname "Arun" into the firstname field
# And User enters lastname "Motoori" into the lastname field
# And User enters Email Address "arun.motoori@gmail.com" into the EMail field
# And User reenters password "12345" into the password confirmed field
And User selects privacy policy field
And User clicks on Continue button
Then Account should get successfully created
@ignore
Scenario: Register with all fields
When User enters firstname "Arun" into the firstname field
And User enters lastname "Motoori" into the lastname field
And User enters Email Address "arun.motoori@gmail.com" into the EMail field
And User enters telephone number 1234567890 into the telephone field
And User enters password "12345" into the password field
And User reenters password "12345" into the password confirmed field
And User selects Yes radio button for Newsletter
And User selects privacy policy field
And User clicks on Continue button
Then Account should get successfully created

Scenario: Register without providing any fields
When User didnt enter any details into the fields
And User clicks on Continue button
Then Warning message should be displayed for the mandatory fields

Scenario: Register with duplicate email address
When User enters firstname "Arun" into the firstname field
And User enters lastname "Motoori" into the lastname field
And User enters Email Address " arun.motoori@gmail.com" into the EMail field
And User enters telephone number 1234567890 into the telephone field
And User enters password "12345" into the password field
And User reenters password "12345" into the password confirmed field
And User selects Yes radio button for Newsletter
And User selects privacy policy field
And User clicks on Continue button
Then Warning message informing the user about the duplicate email address

