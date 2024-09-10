@google
Feature: Just a trial

  @google
  Scenario: Google search something
    Given user has access to google
    When user opens google
    And user enters "hello" in search box
#    And user clicks on search button
    Then user should be navigated to search results page