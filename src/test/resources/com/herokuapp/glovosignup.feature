Feature: GlovoSignup Page
  In order to signup successfully
  User inserts valid credentials
  And follows the next steps

  @glovologin
  Scenario: Positive GlovoSignup login Test
    Given I am on the GlovoSignup page
    When I accept cookies
    When I enter user credentials:
      | name | email           | password             |
      | Jack | jackson@mail.ru | SuperSecretPassword! |
    And I click on Submit button
    Then I move to the Glovo Privacy page
    And I see Glovo Privacy page

    When I accept the Terms and Conditions
    And I click Continue button
    Then I see Verification page

    When I click on Verify button
    Then I see User successfully logged in

