Feature: user is able to search blogs

  @TestblogPage
Scenario: User should be able to  search in Blog Topics
    Given user is on homePage
    When user click on "Blog"
    And type 'End point Assessments'
    Then user should be able to search