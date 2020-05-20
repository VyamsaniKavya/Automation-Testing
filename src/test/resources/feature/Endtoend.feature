Feature: Amazon Application Test 

#Using Scenario Outline with Examples keyword
@EndtoEnd
Scenario Outline: Buying all the products present in the cart Test Scenario

	Given user opens the browser 
	When user clicks on Accounts & Lists 
	Then user enters "<email>" 
	Then clicks on continue Button 
	Then user enters  "<password>" 
	And clicks on Login Button 
	Then clicks on cart Page 
	Then clicks on proceed to Buy 
	Then clicks on Delivery to this Address 
	Then clicks on continue 
	Then clicks on Signout link 
	Examples: 
		| email      | password |
		| 7997245776 | shylu@143 |
	
#Using Scenario with DataTable List
@EndtoEnd1	
Scenario: Selecting a product and buying that perticular product Test Scenario

	Given user opens the browser 
	When user clicks on Accounts & Lists 
	Then user enters email 
		| 7997245776 |
	Then clicks on continue Button 	
	Then user enters password 
		| shylu@143 |
	And clicks on Login Button 
	Then user clicks on menu
	Then user selects any one option from CATEGORY
	Then user selects any one option
	Then user clicks on Jars and containers
	Then user clicks on product
	Then user clicks on buynow
	
#Using Scenario with DataTable Maps
@EndtoEnd2
Scenario: Searching a product and buying that perticular product Test Scenario	 
	
	Given user opens the browser 
	When user clicks on Accounts & Lists 
	Then user enters phonenumber
	| phonenumber |
	| 7997245776  |
	Then clicks on continue Button 	
	Then user enters passwords
	| passwords   |
	| shylu@143   | 
	And clicks on Login Button 
	Then user search for the Product
	Then user clicks on Search Button
	Then user selects one brand
	Then user clicks on perticular product
	Then user clicks on buynow
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	