Feature: Etsy search feature
  Agile Story: As a user I should be able to enter search terms and see relevant result in the page
  and in the title



  Background: User is on the https://www.etsy.com
    Given User is on  the www.etsy.com


  Scenario: Etsy Title Verification
    Then User sees title is as expected.

  Scenario:  Etsy Search Functionality Title Verification
    Then User types "a word" in the search box.
    When User clicks search button.
    Then User sees "a word" is in the title