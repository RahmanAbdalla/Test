Feature: User should be able to place and order in SmartBear website


Scenario: SmartBear order process

Given User is logged into SmartBear Tester account and on Order page
And User click Order link to start palcing the order
Then User fills out the form as followed:
When User selects "product" from product dropdown
And User enters "4" to quantity
Then User click calculate button
Then User enters "John Wich" to costumer name
And User enters "Kinzie Ave" to street
When User enters "Chicago" to city
Then User enters "IL" to state
And User enters "60056"
And User selects "cardType" as card type
Then User enters "1111222233334444" to card number
When User enters "12/22" to expiration date
Then User clicks process button
And User verifies "John Wick" is in the list


  @smartBear
  Scenario Outline: SmartBear order process2
    Given User is logged into SmartBear Tester account and on Order page
    And User click Order link to start palcing the order
    Then User fills out the form as followed:
    When User selects "<product>" from product dropdown
    And User enters "<quantity>" to quantity
    Then User click calculate button
    Then User enters "<customer name>" to costumer name
    And User enters "<street><" to street
    When User enters "<city>" to city
    Then User enters "<state>" to state
    And User enters "<zipCode>"
    And User selects "<cardType>" as card type
    Then User enters "<cardNumber>" to card number
    When User enters "<date>" to expiration date
    Then User clicks process button
    And User verifies "<customer name>" is in the list

    Examples: example test data for SmartBear order
    |product|quantity|customer name|street|city|state|zipCode|cardType|cardNumber|date|customer name|
    |MyMoney|2|Rahman Abdalla|Fairfax st|Fairfax|VA|23443|Visa|756432456|12/20|Rahman Abdalla|
    |FamilyAlbum|1|Adil Mohammed|Centerville st|Centerville|VA|35343|Visa|756432456|12/20|Adil Mohammed|
    |ScreenSaver|1|Barzy Sabir|Fairfax st|Fairfax|VA|34335|Visa|756432456|12/20|Barzy Sabir|
    |MyMoney|2|Hunar Kareem|Harrsionburg st|Harrisonburg|VA|24333|Visa|756432456|12/20|Hunar Kareem|
    |FamilyAlbum|3|Hardi Kamali|Harrisonburg st|Harrisonburg|VA|34324|Visa|756432456|12/20|Hardi Kamali|
    |MyMoney|4|Rawand Adam|Washington st|Washington|VA|35455|Visa|756432456|12/20|Rawand Adam|
    |FamilyAlbum|3|Ary Kareem|Nashville st|Nashville|TN|66456|Visa|756432456|12/20|Ary Kareem|
    |ScreenSaver|1|Tom Cruise|New York st|New York|NY|46756|Visa|756432456|12/20|Tom Cruise|

