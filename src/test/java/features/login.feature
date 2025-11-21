Feature: ParaBank Login
  As a registered or unregistered user
  I want to log in to the ParaBank application
  So that I can access account services or see appropriate error messages
#
#  Background:
#    Given User is on the ParaBank log In page

  Scenario: TC_LOG_001 Successful Login
    Given User is on the ParaBank Log In page
    When I enter a valid Username and Password
    And I click the Log In button
    Then the welcome message is displayed


  Scenario: TC_LOG_002 Login with Invalid Credentials
    When User is on the ParaBank L
  og In page
    And User enters the Invalid Username and Password
    And I click the Log In button
    Then a generic login error message should be displayed
