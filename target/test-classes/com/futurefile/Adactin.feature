Feature: Hotel Booking In Adactin Application

@smoke
Scenario Outline:: Login Page In Adactin
Given User Lauching Adactin application
When User Enter "<username>" In User field
And  User Enter "<password>" In Password field
Then User Enter Login Button
Examples:
|username|password|
|dwuvxbjub|hhsgs|
|hsvcjhsbj|mani|
|8124232525|Ramesh@123|


@sanity
Scenario: Search Hotel In Adactin Application
When User Need To Select Location In Adactin Application
And User Need To Select Hotels In Adactin Application
And User Need To Select Room In Adactin Application
And User Need To Select No.Of.Rooms In Adactin Application
And User Need To Select Check In Date In Adactin Application
And User Need To Select Check Out Date In Adactin Application
And User Need To Select Adult Room In Adactin Application
And User Need To Select Children Rooms In Adactin Application
Then User Need To Click Search Button In Adactin Application

@sanity
Scenario: Select Hotel In Adactin Application
When User Need To Select Hotel In Adactin Application
Then User Need To Click Continue Button In Adactin Application

@sanity
Scenario: Book A Hotel In Adactin Application
When User Need To Enter A First Name In Adactin Application
And User Need To Enter A Last Name In Adactin Application
And User Need To Enter A Billing Address Name In Adactin Application
And User Need To Enter A Credit Card No In Adactin Application
And User Need To Enter A Credit Card Type In Adactin Application
And User Need To Enter A Expiry Date In Adactin Application
And User Need To Enter A Expiry Year In Adactin Application
And User Need To Enter A CVV Number In Adactin Application
Then User Need To Click Book Now Button In Adactin Application

@sanity
Scenario: Booking Confirmation In Adactin Application
Then User Need to Click My Itinerary Button In Adactin Application

@regression
Scenario: Logout Page In Adactin Application
Then User Need to Click Logout Button In Adactin Application











