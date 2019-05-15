
Feature: create new incident

  Scenario: User should be able to create a new incident

  Given Go to home page
  When Login with username as "admin" and password as "Test1234"
  And Verify "System Administrator" to confirm that login is successful
  And Navigate 'to Create Incident' page
  And Complete mandatory fields by entering "Abel Tuter" into Caller field and "Testing incident" into Short Description field
  And Add "This is an automated test" in Description field
  And Submit Incident
  And Confirm that incident has been successfully created with "Testing incident"
  And Click User menu
  And Click "logout" to sign out
  Then Verify that user has succesfully logged out "Login"