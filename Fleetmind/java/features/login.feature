Feature: Verifying Login Feature 

Scenario Outline: Login Page 
	Given user is on homepage 
	Then Navigate to RMS 
	Then Switch to new Tab
	Then user enter username "<Email>" and User enter password "<Password>" 
	Then  Click on sign in button 	
	Examples: 
		| Email                   | Password   |  
		|fleetmind@safefleet.net   |Singapur2019*|