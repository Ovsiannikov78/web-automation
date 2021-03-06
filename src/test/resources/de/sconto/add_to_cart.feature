Feature: Sconto Add to cart Feature
  In order to add article to the cart
  I log in to the website
  I select category from header menu and click it
  I select a product section and click it
  I select a product and click it
  I add a product to the cart


  Scenario: Successful Add to cart
    Given I am on the Homepage
    When I click on the Küchen menu field
    Then I see Products Category List

    When I click on the Products Category from Products Category List
    Then I see Products Page

    When I click on the Selected Product
    Then I see Article Page
    And I see the status of the cart 0

    When I click on the Add Button
    Then I see that status of the cart has changed to 1
