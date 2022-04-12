Feature: Computer test
  As a user i want to add products on computer page

#  Scenario: User should login successfully with valid credentials
#    Given I am on homepage
#    When I click on login link
#    And I enter email "primefivetest@yahoo.com"
#    And I enter password "abc123"
#    And I click on login button
#    Then I should login successfully
  Scenario: user should navigate to computer page
    Given  I am on homepage
    When I MouseHover on Computer Link
    And I click On Desktop Link
    And I click on Build your own computer