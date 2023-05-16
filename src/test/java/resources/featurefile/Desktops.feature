
Feature: Desktop page test cases
#@sanity @regression
  Scenario: verify product arranged in alphabetical order
    Given I am on the homepage
    And I hover on the Desktops tab and click
    And click on "Show AllDesktops"
    And select sort by position "Name: Z to A"
    Then I can see the products in descending order
# @smoke @regression
  Scenario: verify product arranged in alphabetical order
    Given I am on the homepage
    And I hover on the Desktops tab and click
    And click on "Show AllDesktops"
    And select sort by the position "Name: A to Z"
    And select product 'HP LP3065'
    Then I can see the text "HP LP3065"
    And select delivery date '2022-11-30'
    And enter qty 1 using select class
    And click on 'Add to Cart' button
    Then I can see the text "Success: You have added HP LP3065 to your shopping cart!"
    And I click on link 'shopping cart' display into success message
    Then I can see the text 'Shopping Cart'
    Then I can see the Product name "HP LP3065"
    Then I can see the Delivery Date "2022-11-30"
    Then I can see the Model "Product21"
    Then I can see the Total "£74.73"


