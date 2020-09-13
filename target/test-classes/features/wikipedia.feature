
Feature: Wikipedia Search box


  Background: User is on Wikipedia home page
    Given User is on Wikipedia home page

@smoke
  Scenario: Wikipedia Search Functionality Title Verification
    Then User types "Steve Jobs" in the wiki search box
    Then User sees "Steve Jobs" is in the wiki title


  Scenario: Wikipedia Search Functionality Header Verification
    Then User types "Steve Jobs" in the wiki search box
    When User sees "Steve Jobs" is in the main header

    Scenario: Wikipedia Search Functionality Image Header Verification
      Then User types "Steve Jobs" in the wiki search box
      Then User sees "Steve Jobs" is in the image header

@regression
  Scenario Outline: Wikipedia Search Functionality Title Verification
    Then User types "<searchValue>" in the wiki search box
    Then User sees "<expectedTitle>" is in the wiki title
    When User sees "<expectedMainHeader>" is in the main header
    Then User sees "<expectedImgHeader>" is in the image header


    Examples: example test data for wikipedia search
    | searchValue | expectedTitle | expectedMainHeader | expectedImgHeader|
    | Steve Jobs  | Steve Jobs    | Steve Jobs         |    Steve Jobs    |
    | Bruce Lee   | Bruce Lee     | Bruce Lee          |    Bruce Lee     |
    | Albert Einstein | Albert Einstein | Albert Einstein | Albert Einstein|
    | Tom Cruise  | Tom Cruise    | Tom Cruise         |      Tom Cruise  |



