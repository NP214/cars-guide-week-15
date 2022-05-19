Feature: Saerch functionality
  As user I want to search car in cars guide
@sanity,@smoke
  Scenario Outline: saerch car with saech tab
    Given I am on home page
    When I mouse hover on buySell tab
    And I click on search cars tab
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And  I select price  "<price>"
    And I click on find my next car tab
    Then I should see the make "<make>" in results
    Examples:
      | make    | model      | location     | price    |
      | Bentley | Brooklands | NSW - Hunter | $200,000 |
@regression
  Scenario Outline: Search the used car with model
    Given I am on home page
    When I mouse hover on buySell tab
    And I click ‘Used’ link
    Then  I navigate to ‘Used Cars For Sale’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price  "<price>"
    And   I click on find my next car tab
    Then  I should see the make "<make>" in results
    Examples:
      | make | model    | location     | price    |
      | BMW  | 4 Series | NSW - Hunter | $100,000 |

