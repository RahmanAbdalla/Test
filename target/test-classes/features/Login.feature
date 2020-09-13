# We can write all the tags here as well
#  @smoke @regression @login

  @login
Feature: Login
  Agile Story: As a user, I should be able to login with correct credentials
  to different accounts. And Dashboard should be displayed

  #This is how we comment in feature file

   #We use this tag so we can call it again in Runner class to specifically run the Scenarios having that tag name
  @librarian @employee @sunday
  Scenario: Librarian login scenario
    Given User is on the login page
    When User logs in as librarian
    Then User should see dashboard
# && ||
  @student
  Scenario: Student login scenario
    Given User is on the login page
    When User logs in as student
    Then User should see dashboard

  @admin @employee @sunday
  Scenario: Admin login scenario
    Given User is on the login page
    When User logs in as admin
    Then User should see dashboard