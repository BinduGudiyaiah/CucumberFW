Feature: 

Scenario Outline: Search Experience for the product search in both home and Offers page
 		Given User is on GreenCart Landing page
    When User searched with Shortname <Name> and extracted actual name of product
    And Added "3" items of the selected product to cart
    Then User proceeds to Checkout and validate the <Name> items in checkout page
    And verify user has the ability to enter promo code and place the order
Examples: 
| Name |
| Tom |
