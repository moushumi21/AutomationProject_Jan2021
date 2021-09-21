@Scenario
Feature: Validate Background Scenario

@Scenario1
Scenario: Sky Blue Background
		Given "Set SkyBlue Background" button exists
		When "Set SkyBlue Background" I click on the button
		Then The background color will change to sky blue
		
@Scenario2
Scenario: White Background Change
		Given "Set SkyWhite Background" button exists
		When "Set SkyWhite Background" I click on the button
		Then The background color will change to white