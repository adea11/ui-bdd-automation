Feature: Password Reset



  Scenario: I want to reset my password
    Given I navigate to url home page
    When I input an invalid password
    And I click Retrieve Password button
    Then Retrieval email should be sent