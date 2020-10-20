Feature: Add Route 
		
Scenario Outline: Login Page 
	Given user is on homepage 
	And Navigate to RMS 
	Then user enter username "<Email>" and User enter password "<Password>" 
	Then  Click on sign in button 	
      Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
		
Scenario Outline: Add route with weekly frequency
Given User successfully log into RMS
And   user clicks on Routes menu-->Add Route
Then  add route page should be loaded successfully without any errors in the console
When  User fills out the add route form and clicks on save
Then  route should be saved successfully
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
Scenario Outline: Verify route schedule generated successfully
Given User connects to RMS DBwhen select the Routeschedule table for the above created route
Then there should be 24 entries generatedAnd dates should be Based on the frequency and start date 
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
Scenario Outline: Add route Monthly frequencyGiven User successfully log into RMS
When user clicks on Routes menu-->Add Route
Then page should be loaded successfully without any errors in the console
And User fills out the add route form and clicks on saveThen route should be saved successfully
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
Scenario Outline: Verify route schedule generated successfully
Given that User connects to RMS DBwhen select the Routeschedule table for the above created route
Then there should be 24 entries generated
And dates should be Based on the frequency and start date 
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
Scenario Outline: Add Multi day route with weekly frequency
Given the user successfully log into RMS
When user clicks on Routes menu-->Add Route
Then page should be loaded successfully without any errors in the console
And User fills out the add route form and clicks on save
Then route should be saved successfully
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
Scenario Outline: Verify route schedule generated successfully
Given the user connects to RMS DB
When he selects the Route schedule table for the above created route
Then there should be 24 entries generated
And dates should be Based on the frequency and start date 
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
Scenario Outline: add route
Given the user successfully log into RMS
When user navigates to Routes menu-->Add Route
Then page should be loaded successfully without any errors in the console
And User fills out the add route form and clicks on save
Then route should be saved successfully
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
Scenario Outline: Verify route schedule generated successfully
Given the User connects to RMS (Fleetlink Route system) DB
When user selects the Routeschedule table for the above created route
Then there should be 24 entries generated
And dates should be 24 consecutive days from start date 
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
Scenario Outline:Add Customer
Given User successfully log into RMS
When User clicks on Customer menu-->Add Customer
Then Page should be loaded successfully without any errors in the console
And  User fills out the add customer form data clicks on save
Then Route should be saved successfully
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
Scenario Outline: Transfer stops to temp route ( Temporary route is for temporary for that day)
Given That User successfully log into RMS->Routes List for current dayWhen user selects the route from the list
Then Use selects the temporary route from the temporary drop down
And User clicks on “Transfer route to “ button, confirmation pop up message will be displayed
And User clicks on yes then stops on that route will be successfully added to temp route.
And Temp route will be displayed on the current day routes list with status pendingAnd select the dispatch check box and click on dispatch, route should be dispatched to waste app successfully (verify on waste app)
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
Scenario Outline: Add Geozone to workzone Route
Given User successfully log into RMS-->Edit route page
When user clicks on Geozone link on edit route page
Then page should be redirected to “Geozone” page
And User fills out the form details and draw the polygon by right click on the map,clicks on save
Then Geozone should be saved successfully in Workzone database of Polygon table and should be linked to route (You should see the assigned route Id to that Polygon)
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
Scenario Outline:Add paths to Geozone
Given user successfully log into RMS-->Edit Geozone page
When user select the correct geozone and clicks on routepath
Then “Edit” and “Add New” options should be displayed
When user clicks on “Add New” button 
Then user should be able to draw polygon line strings on the map by right clicking
And user clicks on save button,line strings should be save successfully and able to see in edit mode
And user verifies in Workzone database of Paths table, and it should be linked to Polygon
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
Scenario Outline: Craete On-demand stop for sweeping service and verify it appears on unscheduled stop screen
Given user successfully log into RMS-->Workzone List Page
When user right click on the map
Then a pop up should be displayed 
And user selects the option Schedule  on-demand stop
Then schedule On-demand pop up modal should be displayed
And user fills out the data and do not select the route and click on Save 
Then On-demand stop should be added on the map and there will be a “grey” color balloon displayed 
When user hover over the balloon, then details should be displayed and the stop status should be unassigned
Examples: 
		| Email              | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		Scenario Outline: User navigates to unscheduled stop screen
Given Selects on-demand radio button
Then above created on demand stop should be displayed on Unscheduled stop list
When user selects the stop from the list
Then Workzone routes list should be displayed in the lower grid
And user selects the route from the list and click on Save (please select the route which is dispatched)
Then route should be dispatched to waste app successfully
Examples: 
		| Email                   | Password   |  
		|kgoboori@safefleet.net   |Singapur2019*|
		
Scenario Outline: Add On-demand stop to workzone route
Given that User successfully log into RMS-->Workzone List Page
When user right click on the map
Then a context menu pop up should be displayed 
And user selects the option Schedule  on-demand stop
Then Schedule On-demand pop up modal should be displayed
And user fill out the data (User must select the route which has dispatched) and click on Save 
Then On-demand stop should be added to the route and dispatched to waste app successfully

