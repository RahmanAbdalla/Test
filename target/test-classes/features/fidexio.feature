
  Feature: User should be able to explore the home page


 #   @fidexio
 #   Scenario: Use is on the home page
#
#      Given User clicks on the login button
#      Then User enters random credentials
#      And User should see an error message
#      Then User returns to the home page by clicking on fidexio logo on the top left
 #     And User clicks on the Contact button and then scroll down the page to see the contact number is displayed


    @fidexio
      Scenario Outline: User is on the login page

        Given User enters "<invalid email>" and "<invalid password>"credentials

        Examples:
        | invalid email  | invalid password   |
        | abc@gmail.com  | 3333   |
        | nnnc@gmail.com  | 454343 |
        | hic@gmail.com  | 43433   |
