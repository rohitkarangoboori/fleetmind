Feature: FRM Activity Report Generate  

Scenario Outline: 
Given User successfully log into frm portal
When user clicks on activity reports -->1 month summary of calls
Then page should load successfully
And upon selecting drop-down list
And clicking on search option
And data loaded successfully
And no errors in the console.
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
Scenario Outline:  
Given the user is on the 1 month summary of calls page
And user selects the divisions, lob, month, year information
When user clicks on Search option
Then the report should be displayed 
And mousing over on the graph
And confirmations, missed, exceptions information should be displayed.
And no errors in the console.
	Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
Scenario Outline: Driver productivity report

Given User successfully log into frm portal
When user clicks on activity reports -->Driver productivity
Then page should load successfully
And upon selecting division, date selection
And clicking on Generate option
And data loaded successfully
And no errors in the console.
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
Scenario Outline: Export the Driver productivity report into CSV format

Given User successfully log into frm portal
When user clicks on activity reports -->Driver productivity
Then page should load successfully
And upon selecting division, date selection
And clicking on Generate option
And data loaded successfully
And the user clicks on Export to CSV option
And the report downloaded in local driver
And user is able to view data in Excel format.
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
Scenario Outline: Daily work summary page
Given User successfully log into frm portal
When user clicks on activity reports -->Daily work summary
Then page should load successfully
And no errors in the console.
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|

Scenario Outline: Display work summary per route report
Given the User is on work summary per route page
And the user selects division, date information
When user clicks on Search option
Then the respective division progress should display 
And the user clicks on the progress bar  
And the user redirected to Route details screen.
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
Scenario Outline: Display work summary per driver report
Given the User is on work summary per driver page
And the user selects division, date information
When user clicks on Search option
Then the respective day drivers information should display 
And the user clicks on the results
And the user redirected to Driver details screen.
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
Scenario Outline: Display work summary per vehicle report
Given the User is on work summary per vehicle page
And the user selects division, date information
When user clicks on Search option
Then the respective day Vehicles information should display 
And the user clicks on the results
And the user redirected to Vehicle details screen.
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
Scenario Outline: Display Route work details report
Given the User is on Route work details menu
And the user selects division, route, date information
When user clicks on Search option
Then the respective route information should display
And the user clicks on the menu
And the user clicks on Export all data as CSV
And route details should download
And user should be able to view information on excel.
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
Scenario Outline: : Display Driver work details report
Given the User is on Driver work details menu
And the user selects division, driver, date information
When user clicks on Search option
Then the respective driver information should display
And the user clicks on the menu
And the user clicks on Export all data as CSV
And driver details should download
And user should be able to view information on Excel.
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
Scenario Outline: : Display Vehicle work details report
Given the User is on Vehicle work details menu
And the user selects division, Truck, date information
When user clicks on Search option
Then the respective vehicle information should display
And the user clicks on the menu
And the user clicks on Export all data as CSV
And driver details should download
And user should be able to view information on Excel.
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
Scenario Outline: Monthly disposal performance report
Given User successfully log into frm portal
When user clicks on activity reports -->Monthly disposal performance option
Then page should load successfully
And no errors in the console.
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|

Scenario Outline: Display Monthly disposal performance details
Given the User is on Monthly disposal performance  page
And the user selects division, lob, month, year information
When user clicks on View report option
Then the respective division graph should display 
And the user clicks on the progress bar  
And the user redirected to Disposal details screen.
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|