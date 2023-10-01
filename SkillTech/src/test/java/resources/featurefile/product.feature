Feature:Product Search
  Background:
    Given user is on homePage

 @TestProductPage
  Scenario: User should be able to redirected to EPAPro Essentials
    When user click on product
    And user click on EPAPro Essentials
    Then user should be redirected to the page "EPAPro Essentials - Skilltech Solutions"
