Feature: Facebook feature
Scenario Outline: Fb login scenario

Given Humnan launch browser and get "<url>"
When Human enters username "<username>"
And Human enters password "<password>"
And Human clicks on login button
Then Human is getting logout from the page

Examples:
|url|username|password|
|https://www.facebook.com/|rajaduraivijay@gmail.com|Raja7*durai|