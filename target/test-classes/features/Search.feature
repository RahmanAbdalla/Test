Feature: Search
    Agile Story: As a user, I should be able to search when I am on Google search page


  Background: User should be on google search page
    Given User is on the google search page

  Scenario: Google default title verification
    Then User should see title is Google



    Scenario: Google title verification after search
      Then User searches apple
      When User should see apple in the title


      #implementing Parameterization
  # what we did below, putting the work inside double quote makes it easier to change test date from here than form the steps
  # if we want to change "apple" to "Pear" we just change it from here.
  Scenario: Google title verification after search
    Then User searches "pear"
    When User should see "pear" in the title



  Scenario: Google -About- link title verification
      Then User should see About-link
      And User should click About-link
      Then User should see title Google - About Google, Our Culture @ Company News


    @datatable
  Scenario: Google search page footer links verification
    Then User should see six link in the footer
    |Advertising|
    |Business|
    |How Search Works|
    |Privacy|
    |Terms|
    |Settings|



