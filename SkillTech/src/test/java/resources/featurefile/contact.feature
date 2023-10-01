Feature: Contact Page

 @TestContactPage
  Scenario Outline: User should not be able to submit Quick Enquiry form with required field Empty
    Given user is homepage
    When user click on contact
    And   User Add firstname "<Firstname>"
    And User add  lastname"<LastName>"
    And User add email"<Email>"
    And User add Phonenumber"<Phonenumber>"
    And User click on Submit button
    Then User should get an error message
    Examples:
      |Firstname|LastName|Email|Phonenumber|
      |Kelly    |Max     |     | 09898768998|
      |Kelly    |        |KellyMax@gmail.com     | 09898768998|
      |Kelly    |Max     |   KellyMax@gmail.com  | 09898768998|